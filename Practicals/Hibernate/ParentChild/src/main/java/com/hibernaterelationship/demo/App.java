package com.hibernaterelationship.demo;

import java.util.HashSet;

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
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction ts = session.beginTransaction();
        
       
        Parent p1 = new Parent();
        p1.setpId(1);
        p1.setpName("rahul");
        
        Child c1 = new 	Child();
        c1.setChild_id(1);
        c1.setChild_name("priya");
        c1.setParent(p1);
     
        
        
        Child c2 = new Child();
        c2.setChild_id(2);
        c2.setChild_name("anjli");
        c2.setParent(p1);
        
        HashSet<Child> childset = new HashSet<Child> ();
        childset.add(c1);
        childset.add(c2);
        
        session.save(c1);
        session.save(c2);
        
       
        p1.setChild(childset);
        
        session.save(p1);
        
        ts.commit();
        session.close();
        
    }
}
