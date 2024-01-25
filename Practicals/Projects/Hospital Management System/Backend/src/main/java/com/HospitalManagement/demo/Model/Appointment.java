package com.HospitalManagement.demo.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "appointment")  // Make sure the table name matches your MySQL table
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;  // Assuming age is an integer, adjust data type accordingly

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "number")
    private String number;

    @Column(name = "appointment_date_time")  // Adjust column name to match MySQL conventions
    private LocalDateTime appointmentDateTime;

    @Column(name = "city")
    private String city;
    
    
}