package com.HospitalManagement.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HospitalManagement.demo.Converter.DoctorConverter;
import com.HospitalManagement.demo.Converter.PatientConverter;
import com.HospitalManagement.demo.DTO.AppointmentDTO;
import com.HospitalManagement.demo.DTO.DoctorDTO;
import com.HospitalManagement.demo.DTO.PatientDTO;
import com.HospitalManagement.demo.Exception.PatientIdNotFoundException;
import com.HospitalManagement.demo.Model.Doctor;
import com.HospitalManagement.demo.Model.Patient;
import com.HospitalManagement.demo.Repository.PatientRepository;
import com.HospitalManagement.demo.Service.DoctorService;
import com.HospitalManagement.demo.Service.PatientService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/patients")
public class PatientController {


	    @Autowired
	    private PatientService patientService;

	    @Autowired
	    private PatientConverter patientConverter;
	    
	    @Autowired
	    private DoctorConverter doctorConverter;
	    
	    @Autowired
	    private DoctorService doctorService;

	    @CrossOrigin("http://localhost:4200")
	    @PostMapping
	    public ResponseEntity<PatientDTO> createPatient(@Valid @RequestBody PatientDTO patientDTO) {
	        Patient patient = patientConverter.toEntity(patientDTO);
	        Patient savedPatient = patientService.craetepatient(patient);
	        PatientDTO savedPatientDTO = patientConverter.toDto(savedPatient);
	        return new ResponseEntity<>(savedPatientDTO, HttpStatus.CREATED);
	    }

	    @CrossOrigin("http://localhost:4200")
	    @GetMapping("/{id}")
	    public ResponseEntity<PatientDTO> getPatientById(@PathVariable("id") Long id) {
	        Patient patient = patientService.getPatientById(id);
	        if (patient != null) {
	            PatientDTO patientDTO = patientConverter.toDto(patient);
	            return new ResponseEntity<>(patientDTO, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @CrossOrigin("http://localhost:4200")
	    @GetMapping
	    public ResponseEntity<List<PatientDTO>> getAllPatients() {
	        List<Patient> patients = patientService.getAllPatients();
	        List<PatientDTO> patientDTOs = patientConverter.toDtoList(patients);
	        return new ResponseEntity<>(patientDTOs, HttpStatus.OK);
	    }

	    @CrossOrigin("http://localhost:4200")
	    @PutMapping("/{id}")
	    public ResponseEntity<PatientDTO> updatePatient(@PathVariable("id") Long id,
	                                                    @Valid @RequestBody PatientDTO patientDTO) {
	        Patient patient = patientConverter.toEntity(patientDTO);
	        Patient updatedPatient = patientService.upadatePatient(patient, id);
	        if (updatedPatient != null) {
	            PatientDTO updatedPatientDTO = patientConverter.toDto(updatedPatient);
	            return new ResponseEntity<>(updatedPatientDTO, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @CrossOrigin("http://localhost:4200")
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
	        patientService.deletePatient(id);
	        return new ResponseEntity<>("Patient details deleted successfully", HttpStatus.OK);
	    }

	    @CrossOrigin("http://localhost:4200")
	    @PostMapping("/register")
	    public ResponseEntity<PatientDTO> registerPatient(@Valid @RequestBody PatientDTO patientDTO) {
	        Patient patient = patientConverter.toEntity(patientDTO);
	        Patient registeredPatient = patientService.registerPatient(patient);
	        PatientDTO registeredPatientDTO = patientConverter.toDto(registeredPatient);
	        return new ResponseEntity<>(registeredPatientDTO, HttpStatus.CREATED);
	    }

	    @CrossOrigin("http://localhost:4200")
	    @PostMapping("/login")
	    public ResponseEntity<Map<String, String>> loginPatient(@Valid @RequestBody PatientDTO patientDTO) {
	        Patient patient = patientConverter.toEntity(patientDTO);
	        return patientService.loginPatient(patient);
	    }

	    @CrossOrigin("http://localhost:4200")
	    @GetMapping("/byname/{name}")
	    public ResponseEntity<PatientDTO> getPatientByName(@PathVariable("name") String name) {
	        Patient patient = patientService.getPatientByName(name);
	        if (patient != null) {
	            PatientDTO patientDTO = patientConverter.toDto(patient);
	            return new ResponseEntity<>(patientDTO, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    @CrossOrigin("http://localhost:4200")
	    @GetMapping("/total")
	    public ResponseEntity<Long> getTotalPatients() {
	        long totalPatients = patientService.getTotalPatients();
	        return ResponseEntity.ok(totalPatients);
	    }
	    @CrossOrigin("http://localhost:4200")
	    @GetMapping("/{id}/doctor")
	    public ResponseEntity<DoctorDTO> getDoctorByPatient(@PathVariable Long id) {
	        try {
	            Patient patient = patientService.getPatientById(id);

	            if (patient == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            Doctor doctor = patient.getDoctor();

	            if (doctor == null) {
	                // If the patient has no assigned doctor
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }

	            // Convert the Doctor entity to DoctorDTO (assuming you have a converter)
	            DoctorDTO doctorDTO = doctorConverter.toDto(doctor);

	            return new ResponseEntity<>(doctorDTO, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	    @CrossOrigin(origins = "http://localhost:4200")
	    @PostMapping("/{id}/assignDoctor/{did}")
	    public ResponseEntity<Map<String, Object>> assignDoctorToPatient(
	            @PathVariable Long id,
	            @PathVariable Long did) {
	        try {
	            Patient patient = patientService.getPatientById(id);
	            Doctor doctor = doctorService.getDoctorById(did);

	            if (patient == null || doctor == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            patient.setDoctor(doctor);
	            patientService.save(patient);

	            // Create a map to hold both patient and doctor details
	            Map<String, Object> response = new HashMap<>();
	            response.put("patient", patient);
	            response.put("doctor", doctor);

	            return new ResponseEntity<>(response, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
