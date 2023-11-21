package com.Spring.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.demo.entity.HolidayList;

public interface HolidayListRepository extends JpaRepository<HolidayList, Integer>
{

}
