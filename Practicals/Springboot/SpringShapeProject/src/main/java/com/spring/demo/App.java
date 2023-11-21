package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("Shape.xml");
        Shape s1 = (Shape) con.getBean("circle");
        s1.draw();
        Shape s2= (Shape) con.getBean("rectangle");
        s2.draw();
        Performer p = (Performer) con.getBean("dance");
       p.performer();
       
    }
}
