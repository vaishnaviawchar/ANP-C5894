package com.HospitalManagement.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.HospitalManagement.demo.Model.Patient;


public interface PatientService 
{
	Patient craetepatient(Patient patient);
	
	Patient getPatientById(Long id);
	
	List<Patient> getAllPatients();
	
	Patient upadatePatient(Patient patient, Long id);
	
    void deletePatient(Long id);
    
    Patient registerPatient(Patient patient); 
    
    Patient getPatientByName(String name);
    
   ResponseEntity<Map<String, String>> loginPatient(Patient patient);
   
   long getTotalPatients();
   Patient save(Patient patient);

}
