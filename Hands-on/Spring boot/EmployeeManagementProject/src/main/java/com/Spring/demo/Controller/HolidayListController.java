package com.Spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.demo.Repository.HolidayListRepository;
import com.Spring.demo.entity.HolidayList;
import com.Spring.demo.services.HolidayListServices;

import jakarta.validation.Valid;

@RestController
public class HolidayListController 
{
	@Autowired
	HolidayListServices hs;
	
	@PostMapping("/Holiday/addHolidayDetails")
	public ResponseEntity<HolidayList> addHolidays(@Valid @RequestBody HolidayList holiday)
	{
		return new ResponseEntity<HolidayList> (hs.addHoliday(holiday),HttpStatus.CREATED);
	}
	
	@GetMapping("/Holiday/getHolidayDetails/{id}")
	public ResponseEntity<HolidayList> getHolidayDetails(@PathVariable("id") int id)
	{
		return new ResponseEntity<HolidayList> (hs.getHoliday(id),HttpStatus.OK);
	}
	
	@PutMapping("/Holiday/updateHolidayDetails/{id}")
	public ResponseEntity<HolidayList> updateHolidays(@Valid @PathVariable("id") int id, @RequestBody HolidayList holiday)
	{
		return new ResponseEntity<HolidayList> (hs.updateHolidayList(holiday, id),HttpStatus.OK);
	}
	
	@GetMapping("/Holiday/getHolidayAllDetails")
	public ResponseEntity<List<HolidayList>> getAllHolidayDetails()
	{
		List<HolidayList> holiday=hs.getAllHolidays();
		return new ResponseEntity<List<HolidayList>> (holiday,HttpStatus.OK);
	}
	
	
	

}
