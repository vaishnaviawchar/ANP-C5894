package com.HospitalManagement.demo.Converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.HospitalManagement.demo.DTO.AppointmentDTO;
import com.HospitalManagement.demo.Model.Appointment;

@Component
public class AppointmentConverter {

	public AppointmentDTO toDto(Appointment appointment) {
	    if (appointment == null) {
	        return null;
	    }

	    AppointmentDTO appointmentDTO = new AppointmentDTO();
	    appointmentDTO.setId(appointment.getId());
        appointmentDTO.setName(appointment.getName());
	    appointmentDTO.setAge(appointment.getAge());
	    appointmentDTO.setSymptoms(appointment.getSymptoms());
	    appointmentDTO.setNumber(appointment.getNumber());
	    appointmentDTO.setAppointmentDateTime(appointment.getAppointmentDateTime());
	    appointmentDTO.setCity(appointment.getCity());
	    
	    return  appointmentDTO;
    }

    public Appointment toEntity(AppointmentDTO appointmentDTO) {
        if (appointmentDTO == null) {
            return null;
        }

        Appointment appointment = new Appointment();
        appointment.setId(appointmentDTO.getId());
        appointment.setName(appointmentDTO.getName());
        appointment.setAge(appointmentDTO.getAge());
        appointment.setSymptoms(appointmentDTO.getSymptoms());
        appointment.setNumber(appointmentDTO.getNumber());
        appointment.setAppointmentDateTime(appointmentDTO.getAppointmentDateTime());
        appointment.setCity(appointmentDTO.getCity());

        return appointment;
    }

    public List<AppointmentDTO> toDtoList(List<Appointment> appointments) {
        return appointments.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}