package com.HospitalManagement.demo.Converter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.HospitalManagement.demo.DTO.AppointmentDTO;
import com.HospitalManagement.demo.DTO.PatientDTO;
import com.HospitalManagement.demo.Model.Appointment;
import com.HospitalManagement.demo.Model.Patient;

@Component
public class PatientConverter {

    public PatientDTO toDto(Patient patient) {
        if (patient == null) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(Objects.requireNonNullElse(patient.getId(), 0L));
        patientDTO.setName(patient.getName());
        patientDTO.setPassword(patient.getPassword());
        patientDTO.setAge(patient.getAge());
        patientDTO.setBlood(patient.getBlood());
        patientDTO.setDose(patient.getDose());
        patientDTO.setFees(patient.getFees());
        patientDTO.setPrescription(patient.getPrescription());
        patientDTO.setRemark(patient.getRemark());
        patientDTO.setUrgency(patient.getUrgency());

        return patientDTO;
    }

    public Patient toEntity(PatientDTO patientDTO) {
        if (patientDTO == null) {
            return null;
        }

        Patient patient = new Patient();
        if (patientDTO.getId() != null) {
            patient.setId(patientDTO.getId());
        }

      
        
        Long id = patientDTO.getId();
        System.out.println("ID from DTO: " + id);  // Add this line for debugging
        patient.setId(Objects.requireNonNullElse(id, 0L)); 
        patient.setName(patientDTO.getName());
        patient.setPassword(patientDTO.getPassword());
        patient.setAge(patientDTO.getAge());
        patient.setBlood(patientDTO.getBlood());
        patient.setDose(patientDTO.getDose());
        patient.setFees(patientDTO.getFees());
        patient.setPrescription(patientDTO.getPrescription());
        patient.setRemark(patientDTO.getRemark());
        patient.setUrgency(patientDTO.getUrgency());

        return patient;
    }

    public List<PatientDTO> toDtoList(List<Patient> patients) {
        return patients.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
  
}