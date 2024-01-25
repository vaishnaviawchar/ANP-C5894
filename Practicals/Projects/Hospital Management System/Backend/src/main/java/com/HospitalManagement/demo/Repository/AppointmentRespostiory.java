package com.HospitalManagement.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.HospitalManagement.demo.Model.Appointment;

public interface AppointmentRespostiory extends JpaRepository<Appointment, Long>
{
	@Query("SELECT COUNT(a) FROM Appointment a")
    long countAppointments();
	
	Appointment findByname(String name);

}
