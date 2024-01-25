package com.HospitalManagement.demo.ServiceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospitalManagement.demo.Exception.MedicineIdNotFoundException;
import com.HospitalManagement.demo.Model.Medicine;
import com.HospitalManagement.demo.Repository.MedicineRepository;
import com.HospitalManagement.demo.Service.MedicineService;


@Service
public class MedicineServiceImpl implements MedicineService
{
	//logger statically created
	private static final Logger log = LoggerFactory.getLogger(Medicine.class);
	
	@Autowired
	private MedicineRepository mr;

	@Override
	public Medicine addMedicine(Medicine medicine) 
	{
	
		return mr.save(medicine);
	}

	@Override
	public List<Medicine> getAllMedicines() 
	{
		
		return mr.findAll();
	}

	@Override
	public Medicine updateMedicine(Medicine medicine, Long id) 
	{
		Medicine updatedMedicine = mr.findById(id).orElseThrow(()-> new MedicineIdNotFoundException("Medidcine Id Not found"));
		updatedMedicine.setDrugName(medicine.getDrugName());
		updatedMedicine.setStock(medicine.getStock());
		mr.save(updatedMedicine);
		return updatedMedicine;
	}

	@Override
	public Medicine getMedicineById(Long id) 
	{
		return mr.findById(id).orElseThrow(()-> new MedicineIdNotFoundException("Medidcine Id Not found"));
		
	}

	@Override
	public void deleteMedicine(Long id) 
	{
		mr.findById(id).orElseThrow(()-> new MedicineIdNotFoundException("Medidcine Id Not found"));
		mr.deleteById(id);;
		
	}

	@Override
	public long getTotalMedicines() 
	{
		
		return mr.count();
	}
	
	
		
		

}
