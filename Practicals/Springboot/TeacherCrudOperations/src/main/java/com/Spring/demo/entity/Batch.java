package com.Spring.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Batch 
{
	@Id
	private int bid;
	@Column(length=25,nullable=true)
	@NotBlank(message="Batch name can't be blank")
	private String bname;
	@Column(length=25,nullable=true)
	@NotBlank(message="Subject name can't be blank")
	private String subject;
	@Column(length=25,nullable=true)
	@NotBlank(message="start date can't be blank")
	private String startDate;
	@Column(length=25,nullable=true)
	@NotBlank(message="end date can't be blank")
	private String endDate;
	@Column(length=25,nullable=true)
	@NotNull(message="Duration can't be blank")
	private int duration;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="TeacherId", referencedColumnName = "tid")
	@JsonManagedReference
	private Teacher teacher;


}
