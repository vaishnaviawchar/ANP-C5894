package com.hibernate.query.enity;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
       
       Query query = session.createQuery("from Emp");
       List<Emp> list = query.getResultList();
       Iterator<Emp> it = list.iterator();
       
       while(it.hasNext())
       {
    	   Emp e = it.next();
    	   System.out.println(e.getEidd());
    	   
       }
       ts.commit();
       session.close();
       
       
    }
}
