package com.hibernaterelationship.demo;

import java.util.List;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Configuration cfg=new Configuration(); 
    	 cfg.configure("hibernate.cfg.xml");
 		
		  SessionFactory factory=cfg.buildSessionFactory(); 
		  Session session=factory.openSession(); 
		  Transaction tx=session.beginTransaction();
		  
		  Department d1 = new Department();
		  d1.setdId(1);
		  d1.setdName("CS");
		  
		  Employee e1 = new Employee();
		  e1.setE_id(1);
		  e1.setE_name("priya");
		  e1.setDepartment(d1);
		  
		  Employee e2 = new Employee();
		  e2.setE_id(2);
		  e2.setE_name("shreya");
		  e2.setDepartment(d1);
		  
		  d1.getE().add(e1);
		  d1.getE().add(e2);
		  
		  session.save(e1);
		  session.save(e2);
		  session.save(d1);
		  
		  tx.commit();
		  session.close();
    }
}