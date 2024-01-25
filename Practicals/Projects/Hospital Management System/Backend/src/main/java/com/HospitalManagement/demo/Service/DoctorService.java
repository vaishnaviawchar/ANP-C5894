package com.HospitalManagement.demo.Service;

import java.util.List;
import java.util.Optional;

import com.HospitalManagement.demo.DTO.DoctorDTO;
import com.HospitalManagement.demo.Model.Doctor;
import com.HospitalManagement.demo.Model.Patient;

public interface DoctorService 
{
	 Doctor addDoctor(Doctor doctor);

	 List<Doctor> getAllDoctors();

	 Doctor getDoctorById(Long did);
	 
	 Doctor updateDoctorDetails(Doctor doctor, Long did);

	  void deleteDoctor(Long did);

	  long getTotalDoctors();
	  
	  Doctor save(Doctor doctor);

}
