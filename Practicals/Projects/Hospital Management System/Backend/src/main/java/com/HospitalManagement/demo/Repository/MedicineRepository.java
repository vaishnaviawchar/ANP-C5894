package com.HospitalManagement.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HospitalManagement.demo.Model.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long>
{ 
	@Query("SELECT COUNT(m) FROM Doctor m")
    long countMedicines();

}
