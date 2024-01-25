package com.HospitalManagement.demo.Service;

import java.util.List;

import com.HospitalManagement.demo.Model.Medicine;

public interface MedicineService 
{
	Medicine addMedicine(Medicine medicine);
	
	List<Medicine> getAllMedicines();
	
	Medicine updateMedicine(Medicine medicine, Long id);
	
	Medicine getMedicineById(Long id);
	
	void deleteMedicine(Long id);
	
	long getTotalMedicines();

}
