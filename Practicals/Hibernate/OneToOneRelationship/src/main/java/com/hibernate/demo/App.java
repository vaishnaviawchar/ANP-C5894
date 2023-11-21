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
    	System.out.println("Connection started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        
        Husband h1 = new Husband();
        Wife w1 = new Wife();
        
        h1.setH_name("Rajesh");
        h1.setWife(w1);
        
        w1.setWife_name("vaishu");
        w1.setHusband(h1);
       
        session.save(w1);
        session.save(h1);
        
        ts.commit();
        session.close();
        System.out.println("Successfully saved:");
    }
}
