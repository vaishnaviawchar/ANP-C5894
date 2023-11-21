package com.hibernate.application;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.application.entity.Employees;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session se = HiberUtil.getSessionFactory().openSession();
        Transaction ts = se.beginTransaction();
        Employees e1 = new Employees();
        e1.setEmployeeId(1);
        e1.setEmployeeName("Raj");
        e1.setEmployeeDesignation("IT");
        e1.setEmployeemob(1122345678);
        
        se.save(e1);
        ts.commit();
        System.out.println("Saved");
        
    }
}
