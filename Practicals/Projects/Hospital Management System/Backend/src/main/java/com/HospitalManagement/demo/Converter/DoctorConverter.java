package com.HospitalManagement.demo.Converter;

import org.springframework.stereotype.Component;

import com.HospitalManagement.demo.DTO.DoctorDTO;
import com.HospitalManagement.demo.Model.Doctor;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DoctorConverter {

    public DoctorDTO toDto(Doctor doctor) {
        if (doctor == null) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();
        doctorDTO.setDid(doctor.getDid());
        doctorDTO.setFirstName(doctor.getFirstName());
        doctorDTO.setLastName(doctor.getLastName());
        doctorDTO.setSpecialization(doctor.getSpecialization());
        doctorDTO.setLicenseNumber(doctor.getLicenseNumber());
        doctorDTO.setEmail(doctor.getEmail());
        doctorDTO.setMobileNo(doctor.getMobileNo());

        return doctorDTO;
    }

    public Doctor toEntity(DoctorDTO doctorDTO) {
        if (doctorDTO == null) {
            return null;
        }

        Doctor doctor = new Doctor();
        doctor.setDid(doctorDTO.getDid());
        doctor.setFirstName(doctorDTO.getFirstName());
        doctor.setLastName(doctorDTO.getLastName());
        doctor.setSpecialization(doctorDTO.getSpecialization());
        doctor.setLicenseNumber(doctorDTO.getLicenseNumber());
        doctor.setEmail(doctorDTO.getEmail());
        doctor.setMobileNo(doctorDTO.getMobileNo());

        return doctor;
    }

    public List<DoctorDTO> toDtoList(List<Doctor> doctors) {
        return doctors.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
