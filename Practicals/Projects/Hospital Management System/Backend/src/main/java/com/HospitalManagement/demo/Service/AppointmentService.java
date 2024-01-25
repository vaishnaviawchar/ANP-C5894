package com.HospitalManagement.demo.Service;

import java.util.List;

import com.HospitalManagement.demo.Model.Appointment;

public interface AppointmentService 
{
	Appointment createAppointment(Appointment appointment);
	
	Appointment getAppointmetById(Long id);
	
	Appointment updateAppointment(Appointment appointment, Long id);
	
	List<Appointment> getAllAppointments();
	
	void deleteAppointment(Long id);
	
	long getTotalAppointments();
	
	Appointment getAppointmentbyName(String name);
}
