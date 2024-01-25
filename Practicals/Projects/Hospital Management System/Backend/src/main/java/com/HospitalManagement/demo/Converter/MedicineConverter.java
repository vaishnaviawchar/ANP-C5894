package com.HospitalManagement.demo.Converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.HospitalManagement.demo.DTO.MedicineDTO;
import com.HospitalManagement.demo.Model.Medicine;

@Component
public class MedicineConverter {

    public MedicineDTO toDto(Medicine medicine) {
        if (medicine == null) {
            return null;
        }

        MedicineDTO medicineDTO = new MedicineDTO();
        medicineDTO.setId(medicine.getId());
        medicineDTO.setDrugName(medicine.getDrugName());
        medicineDTO.setStock(medicine.getStock());

        return medicineDTO;
    }

    public Medicine toEntity(MedicineDTO medicineDTO) {
        if (medicineDTO == null) {
            return null;
        }

        Medicine medicine = new Medicine();
        medicine.setId(medicineDTO.getId());
        medicine.setDrugName(medicineDTO.getDrugName());
        medicine.setStock(medicineDTO.getStock());

        return medicine;
    }

    public List<MedicineDTO> toDtoList(List<Medicine> medicines) {
        return medicines.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}