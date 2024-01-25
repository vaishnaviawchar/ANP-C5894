package com.HospitalManagement.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.HospitalManagement.demo.Model.Patient;


public interface PatientRepository extends JpaRepository<Patient, Long>
{
	Patient findByname(String name);
	//List<Patient> findPatientbyname(String name);
	
	@Query("SELECT COUNT(a) FROM Patient a")
    long countPatients();
	
	/*@Modifying
    @Query("UPDATE Patient p SET p.remark = :remark WHERE p.id = :patientId")
    void updateRemark(@Param("patientId") Long patientId, @Param("remark") String remark);*/
}
