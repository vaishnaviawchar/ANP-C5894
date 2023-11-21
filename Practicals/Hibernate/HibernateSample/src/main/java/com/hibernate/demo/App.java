package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Connection Started..");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        
        Employee e1 = new Employee();
        e1.setEmp_id(01);
        e1.setEmp_name("Raj");
        e1.setSalary(20000);
        
        Employee e2 = new Employee();
        e2.setEmp_id(02);
        e2.setEmp_name("Priya");
        e2.setSalary(30000);
        
        session.save(e1);
        session.save(e2);
        
        ts.commit();
        session.close();
        System.out.println("Employee data Saved Successfully");
        
        
        
    }
}
