package com.Spring.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.demo.Exception.HolidayListNotFoundException;
import com.Spring.demo.Repository.HolidayListRepository;
import com.Spring.demo.entity.HolidayList;
import com.Spring.demo.services.HolidayListServices;

@Service
public class HolidayServicesImpl implements HolidayListServices
{
	@Autowired
	HolidayListRepository hl;

	@Override
	public HolidayList addHoliday(HolidayList holiday) 
	{
		
		return hl.save(holiday);
	}

	@Override
	public HolidayList getHoliday(int id) 
	{
		
		return hl.findById(id).orElseThrow(()-> new HolidayListNotFoundException("HolidayList not found"));
	}

	@Override
	public HolidayList updateHolidayList(HolidayList holiday, int id) 
	{
		
		HolidayList updatedHoliday= hl.findById(id).orElseThrow(()-> new HolidayListNotFoundException("HolidayList not found"));
		updatedHoliday.setDay(holiday.getDay());
		updatedHoliday.setRemark(holiday.getRemark());
		hl.save(holiday);
		return updatedHoliday;
	}

	@Override
	public List<HolidayList> getAllHolidays() 
	{
		
		return hl.findAll();
	}
	
	

}
