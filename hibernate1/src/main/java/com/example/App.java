package com.example;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.Entity.Course;
import com.example.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
        Configuration con1= new Configuration().configure().addAnnotatedClass(Course.class);
        
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Student s1=new Student();
        s1.setS_name("Rajshree");
        s1.setCollege("BDBA");
        Course c1=new Course(101,"jaya");
        Course c2=new Course(102,"python");
        List<Course>courses=new ArrayList();
        courses.add(c1);
        courses.add(c2);
        s1.setCourses(courses);
         session.save(s1);
        Transaction t1= session.beginTransaction();
        t1.commit();
    }
}
