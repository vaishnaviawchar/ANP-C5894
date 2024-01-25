package com.HospitalManagement.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HospitalManagement.demo.Exception.AppointmentNotFoundException;
import com.HospitalManagement.demo.Model.Appointment;
import com.HospitalManagement.demo.Model.Patient;
import com.HospitalManagement.demo.Repository.AppointmentRespostiory;
import com.HospitalManagement.demo.Service.AppointmentService;

@Service
public class AppointmentServcieImpl implements AppointmentService
{
	@Autowired
	AppointmentRespostiory ar;


	@Override
	public Appointment createAppointment(Appointment appointment) 
	{
		
		return ar.save(appointment);
	}
	@Override
	public Appointment getAppointmetById(Long id) 
	{
		
		return ar.findById(id).orElseThrow(()-> new AppointmentNotFoundException("Appoinment Id Not Found "));
	}

	@Override
	public Appointment updateAppointment(Appointment appointment, Long id) 
	{
		Appointment updatedAppoinment=ar.findById(id).orElseThrow(()-> new AppointmentNotFoundException("Appoinment Id Not Found "));
		updatedAppoinment.setName(appointment.getName());
		updatedAppoinment.setAge(appointment.getAge());
		updatedAppoinment.setAppointmentDateTime(appointment.getAppointmentDateTime());
		updatedAppoinment.setCity(appointment.getCity());
		updatedAppoinment.setSymptoms(appointment.getSymptoms());
		updatedAppoinment.setNumber(appointment.getNumber());
		ar.save(updatedAppoinment);
		return updatedAppoinment;
	}

	@Override
	public List<Appointment> getAllAppointments() 
	{
	
		return ar.findAll();
	}

	@Override
	public void deleteAppointment(Long id) {
	    Appointment appointment = ar.findById(id).orElseThrow(() -> new AppointmentNotFoundException("Appointment Id Not Found"));
	    ar.delete(appointment);
	}

	@Override
	public long getTotalAppointments() 
	{
		
		return ar.countAppointments();
	}
	@Override
	public Appointment getAppointmentbyName(String name) {
		
		return ar.findByname(name);
	}
	
	
	

}
