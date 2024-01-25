package com.HospitalManagement.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospitalManagement.demo.Converter.DoctorConverter;
import com.HospitalManagement.demo.DTO.DoctorDTO;
import com.HospitalManagement.demo.Exception.DoctorNotFoundException;
import com.HospitalManagement.demo.Model.Doctor;
import com.HospitalManagement.demo.Repository.DoctorRepository;
import com.HospitalManagement.demo.Service.DoctorService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j //adding logger using annotation from lombok
public class DoctorServiceImpl implements DoctorService
{
	//logger statically created
	private static final Logger log = LoggerFactory.getLogger(Doctor.class);

	@Autowired
	private DoctorRepository drepo;
	
	@Autowired
	private DoctorConverter dcon;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		
		return drepo.save(doctor);
		
	}

	@Override
	public List<Doctor> getAllDoctors() {
		
		return drepo.findAll();
	}

	@Override
	public Doctor getDoctorById(Long did) {
		
		return drepo.findById(did).orElseThrow(()-> new DoctorNotFoundException("Doctor Id not found"));
	}

	@Override
	public Doctor updateDoctorDetails(Doctor doctor, Long did) 
	{
		Doctor updateddoctor=drepo.findById(did).orElseThrow(()-> new DoctorNotFoundException("Doctor id not found"));
		updateddoctor.setFirstName(doctor.getFirstName());
		updateddoctor.setLastName(doctor.getLastName());
		updateddoctor.setEmail(doctor.getEmail());
		updateddoctor.setLicenseNumber(doctor.getLicenseNumber());
		updateddoctor.setSpecialization(doctor.getSpecialization());
		updateddoctor.setMobileNo(doctor.getMobileNo());
		
		drepo.save(updateddoctor);
		return updateddoctor;
	}

	@Override
	public void deleteDoctor(Long did) 
	{
		 drepo.findById(did).orElseThrow(()-> new DoctorNotFoundException("Doctor Id not found"));
		drepo.deleteById(did);
		
	}

	@Override
	public long getTotalDoctors() 
	{
		return drepo.count();
	}

	@Override
	public Doctor save(Doctor doctor) {
		
		return drepo.save(doctor);
	}
    
	
		
}



