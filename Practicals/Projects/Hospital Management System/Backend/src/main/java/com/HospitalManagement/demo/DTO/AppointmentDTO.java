package com.HospitalManagement.demo.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class AppointmentDTO {

    private long id;  // Include ID for completeness

    private String name;
    private int age;  // 
    private String symptoms;
    private String number;
    private LocalDateTime appointmentDateTime;
    private String city;

   
}