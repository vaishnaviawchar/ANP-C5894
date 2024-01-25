package com.HospitalManagement.demo.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.HospitalManagement.demo.Exception.PatientIdNotFoundException;
import com.HospitalManagement.demo.Model.Patient;
import com.HospitalManagement.demo.Repository.PatientRepository;
import com.HospitalManagement.demo.Service.PatientService;
@Service
public class PatientServiceImpl implements PatientService
{
	@Autowired
	PatientRepository pr;

	@Override
	public Patient craetepatient(Patient patient) 
	{
		
		return pr.save(patient);
	}

	@Override
	public Patient getPatientById(Long id) 
	{
		return pr.findById(id).orElseThrow(()-> new PatientIdNotFoundException("Patient Id Not Found"));
	}

	@Override
	public List<Patient> getAllPatients() 
	{
		
		return pr.findAll();
	}

	@Override
	public Patient upadatePatient(Patient patient, Long id) 
	{
		Patient updatedPatient = pr.findById(id).orElseThrow(()-> new PatientIdNotFoundException("Patient Id Not Found"));
		updatedPatient.setName(patient.getName());
		updatedPatient.setPassword(patient.getPassword());
		updatedPatient.setAge(patient.getAge());
		updatedPatient.setBlood(patient.getBlood());
		updatedPatient.setDose(patient.getDose());
		updatedPatient.setFees(patient.getFees());
		updatedPatient.setPrescription(patient.getPrescription());
		updatedPatient.setRemark(patient.getRemark());
		updatedPatient.setUrgency(patient.getUrgency());
		pr.save(updatedPatient);
		return updatedPatient;
	}

	@Override
	public void deletePatient(Long id) 
	{
		Patient patient=pr.findById(id).orElseThrow(()-> new PatientIdNotFoundException("Patient Id Not Found"));
		pr.delete(patient);
		
	}

	@Override
	public Patient registerPatient(Patient patient) {
		 if (pr.findByname(patient.getName()) != null) {
	            throw new IllegalArgumentException("Username already exists. Please choose a different one.");
	        }

	        // Validate other necessary conditions if needed

	        // Save the patient with only username, password, and age
	        Patient newPatient = new Patient();
	        newPatient.setName(patient.getName());
	        newPatient.setPassword(patient.getPassword());

	        return pr.save(newPatient);
	    }
	

	@Override
	public ResponseEntity<Map<String, String>> loginPatient(Patient patient) 
	{
        System.out.println("Received login request for username: " + patient.getName());
        System.out.println("Received password: " + patient.getPassword());

        // Assuming Patient class has getUsername() and getPassword() methods
        Patient existingPatient = pr.findByname(patient.getName());

        if (existingPatient != null && existingPatient.getPassword().equals(patient.getPassword())) {
            return ResponseEntity.ok(Map.of("status", "success", "message", "Login successful!"));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("status", "error", "message", "Invalid login credentials"));
        }
    }

	@Override
	public Patient getPatientByName(String name) 
	{
		return pr.findByname(name);
	
	}

	@Override
	public long getTotalPatients() {
		 return pr.countPatients();
	}

	@Override
	public Patient save(Patient patient) {
		
		return pr.save(patient);
	}

}
