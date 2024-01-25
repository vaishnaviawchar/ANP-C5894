package com.HospitalManagement.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.HospitalManagement.demo.Converter.MedicineConverter;
import com.HospitalManagement.demo.DTO.MedicineDTO;
import com.HospitalManagement.demo.Exception.ResourseNotFoundException;
import com.HospitalManagement.demo.Model.Medicine;
import com.HospitalManagement.demo.Repository.MedicineRepository;
import com.HospitalManagement.demo.Service.MedicineService;

import jakarta.validation.Valid;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @Autowired
    private MedicineConverter medicineConverter;

    @PostMapping
    public ResponseEntity<MedicineDTO> saveMedicine(@Valid @RequestBody MedicineDTO medicineDTO) {
        Medicine medicine = medicineConverter.toEntity(medicineDTO);
        Medicine savedMedicine = medicineService.addMedicine(medicine);
        MedicineDTO savedMedicineDTO = medicineConverter.toDto(savedMedicine);
        return new ResponseEntity<>(savedMedicineDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicineDTO> getMedicineById(@PathVariable("id") Long id) {
        Medicine medicine = medicineService.getMedicineById(id);
        if (medicine != null) {
            MedicineDTO medicineDTO = medicineConverter.toDto(medicine);
            return new ResponseEntity<>(medicineDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<MedicineDTO>> getAllMedicines() {
        List<Medicine> medicines = medicineService.getAllMedicines();
        List<MedicineDTO> medicineDTOs = medicineConverter.toDtoList(medicines);
        return new ResponseEntity<>(medicineDTOs, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicineDTO> updateMedicine(@PathVariable("id") Long id,
                                                      @Valid @RequestBody MedicineDTO medicineDTO) {
        Medicine medicine = medicineConverter.toEntity(medicineDTO);
        Medicine updatedMedicine = medicineService.updateMedicine(medicine, id);
        if (updatedMedicine != null) {
            MedicineDTO updatedMedicineDTO = medicineConverter.toDto(updatedMedicine);
            return new ResponseEntity<>(updatedMedicineDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMedicine(@PathVariable Long id) 
    {
        medicineService.deleteMedicine(id);
        return new ResponseEntity<>("Medicine details deleted successfully", HttpStatus.OK);
    }
    @GetMapping("/total")
    public ResponseEntity<Long> getTotalMedicines() {
        long totalMedicines = medicineService.getTotalMedicines();
        return ResponseEntity.ok(totalMedicines);
    }
}