package com.HospitalManagement.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HospitalManagement.demo.Model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>
{
	@Query("SELECT COUNT(d) FROM Doctor d")
    long countDoctors();
	
	

}
