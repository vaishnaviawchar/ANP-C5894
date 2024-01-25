package com.HospitalManagement.demo.Controller;

import java.util.List;
import java.util.stream.Collectors;

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
import com.HospitalManagement.demo.DTO.DoctorDTO;
import com.HospitalManagement.demo.DTO.PatientDTO;
import com.HospitalManagement.demo.Model.Doctor;
import com.HospitalManagement.demo.Model.Patient;
import com.HospitalManagement.demo.Service.DoctorService;
import com.HospitalManagement.demo.Service.PatientService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/doctors")
public class DoctorController 
{
	
	@Autowired
    private DoctorService doctorService;
	
	@Autowired
    private DoctorConverter doctorConverter;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PatientConverter patientConverter;

    @PostMapping
    public ResponseEntity<DoctorDTO> saveDoctor(@Valid @RequestBody DoctorDTO doctorDTO) {
	        Doctor doctor = doctorConverter.toEntity(doctorDTO);
	        Doctor savedDoctor = doctorService.addDoctor(doctor);
	        DoctorDTO savedDoctorDTO = doctorConverter.toDto(savedDoctor);
	        return new ResponseEntity<>(savedDoctorDTO, HttpStatus.CREATED);
	    }

	    @GetMapping("/{did}")
	    public ResponseEntity<DoctorDTO> getDoctorById(@PathVariable("did") Long did) {
	        Doctor doctor = doctorService.getDoctorById(did);
	        if (doctor != null) {
	            DoctorDTO doctorDTO = doctorConverter.toDto(doctor);
	            return new ResponseEntity<>(doctorDTO, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @GetMapping
	    public ResponseEntity<List<DoctorDTO>> getAllDoctors() {
	        List<Doctor> doctors = doctorService.getAllDoctors();
	        List<DoctorDTO> doctorDTOs = doctorConverter.toDtoList(doctors);
	        return new ResponseEntity<>(doctorDTOs, HttpStatus.OK);
	    }

	    @PutMapping("/{did}")
	    public ResponseEntity<DoctorDTO> updateDoctor(@PathVariable("did") Long did,
	                                                  @Valid @RequestBody DoctorDTO doctorDTO)
	    {
	        Doctor doctor = doctorConverter.toEntity(doctorDTO);
	        Doctor updatedDoctor = doctorService.updateDoctorDetails(doctor, did);
	        if (updatedDoctor != null) {
	            DoctorDTO updatedDoctorDTO = doctorConverter.toDto(updatedDoctor);
	            return new ResponseEntity<>(updatedDoctorDTO, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	    @DeleteMapping("/{did}")
	    public ResponseEntity<String> deleteAllDoctors(@PathVariable Long did) {
	        doctorService.deleteDoctor(did);
	        return new ResponseEntity<>("All doctor details deleted successfully", HttpStatus.OK);
	    }

	    @GetMapping("/total")
	    public ResponseEntity<Long> getTotalPatients() {
	        long totalDoctors = doctorService.getTotalDoctors();
	        return ResponseEntity.ok(totalDoctors);
	    }
	    
	    @GetMapping("/{did}/patients")
	    public ResponseEntity<List<PatientDTO>> getPatientsByDoctor(@PathVariable Long did) {
	        try {
	            Doctor doctor = doctorService.getDoctorById(did);

	            if (doctor == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            List<Patient> patients = doctor.getPatients();

	            // Directly create PatientDTO instances from Patient entities
	            List<PatientDTO> patientDTOs = patients.stream()
	                .map(patient -> new PatientDTO(
	                    patient.getName(),
	                    patient.getPassword(),
	                    patient.getId(),
	                    patient.getAge(),
	                    patient.getBlood(),
	                    patient.getPrescription(),
	                    patient.getDose(),
	                    patient.getFees(),
	                    patient.getUrgency(),
	                    patient.getRemark()
	                ))
	                .collect(Collectors.toList());

	            return new ResponseEntity<>(patientDTOs, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }



	    @PostMapping("/{did}/addPatient/{id}")
	    public ResponseEntity<Doctor> addPatientToDoctor(
	            @PathVariable Long did ,
	            @PathVariable Long id) {
	        try {
	            Doctor doctor = doctorService.getDoctorById(did);
	            Patient patient = patientService.getPatientById(id);

	            if (doctor == null || patient == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	            }

	            doctor.getPatients();
	         doctorService.save(doctor);

	            return new ResponseEntity<>(doctor, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	}


