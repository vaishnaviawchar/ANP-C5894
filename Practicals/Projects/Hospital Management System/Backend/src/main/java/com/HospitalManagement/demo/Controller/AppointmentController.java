package com.HospitalManagement.demo.Controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import com.HospitalManagement.demo.Converter.AppointmentConverter;
import com.HospitalManagement.demo.Converter.PatientConverter;
import com.HospitalManagement.demo.DTO.AppointmentDTO;
import com.HospitalManagement.demo.DTO.PatientDTO;
import com.HospitalManagement.demo.Exception.AppointmentNotFoundException;
import com.HospitalManagement.demo.Model.Appointment;
import com.HospitalManagement.demo.Model.Patient;
import com.HospitalManagement.demo.Repository.AppointmentRespostiory;
import com.HospitalManagement.demo.Service.AppointmentService;
import com.HospitalManagement.demo.Service.PatientService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/v1/Appointment")
public class AppointmentController 
{
	private final Logger logger = LoggerFactory.getLogger(Appointment.class);


    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentConverter appointmentConverter;
    

    @PostMapping
    public ResponseEntity<AppointmentDTO> createAppointment(@Valid @RequestBody AppointmentDTO appointmentDTO) {
        Appointment appointment = appointmentConverter.toEntity(appointmentDTO);
        
        Appointment savedAppointment = appointmentService.createAppointment(appointment);
        AppointmentDTO savedAppointmentDTO = appointmentConverter.toDto(savedAppointment);
        logger.info("Generated ID: " + savedAppointmentDTO.getId());
        return new ResponseEntity<>(savedAppointmentDTO, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDTO> getAppointmentById(@PathVariable("id") Long id) {
        Appointment appointment = appointmentService.getAppointmetById(id);
        if (appointment != null) {
            AppointmentDTO appointmentDTO = appointmentConverter.toDto(appointment);
            return new ResponseEntity<>(appointmentDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDTO>> getAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        List<AppointmentDTO> appointmentDTOs = appointmentConverter.toDtoList(appointments);
        return new ResponseEntity<>(appointmentDTOs, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AppointmentDTO> updateAppointment(@PathVariable("id") Long id,
                                                           @Valid @RequestBody AppointmentDTO appointmentDTO) {
        Appointment appointment = appointmentConverter.toEntity(appointmentDTO);
        Appointment updatedAppointment = appointmentService.updateAppointment(appointment, id);
        if (updatedAppointment != null) {
            AppointmentDTO updatedAppointmentDTO = appointmentConverter.toDto(updatedAppointment);
            return new ResponseEntity<>(updatedAppointmentDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable("id") Long id) {
        appointmentService.deleteAppointment(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/total")
    public ResponseEntity<Long> getTotalAppointments() {
        long totalAppointments = appointmentService.getTotalAppointments();
        return ResponseEntity.ok(totalAppointments);
    }
    
    @GetMapping("/byName/{name}")
    public ResponseEntity<AppointmentDTO> getAppointmentByName(@PathVariable("name") String name) {
        Appointment appointment = appointmentService.getAppointmentbyName(name);
        if (appointment != null) {
          AppointmentDTO appointmentDTO = appointmentConverter.toDto(appointment);
            return new ResponseEntity<>(appointmentDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}