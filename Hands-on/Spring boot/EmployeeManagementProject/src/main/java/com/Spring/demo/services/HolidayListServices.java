package com.Spring.demo.services;

import java.util.List;

import com.Spring.demo.entity.HolidayList;

public interface HolidayListServices 
{
	HolidayList addHoliday(HolidayList holiday);
	
	HolidayList getHoliday(int id);
	
	HolidayList updateHolidayList(HolidayList holiday, int id);
	
	List<HolidayList> getAllHolidays();

}
