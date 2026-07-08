package com.sarvesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setRollNo(3);
//        s1.setsName("shiva");
//        s1.setsAge(15);

//        Student s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.sarvesh.Student.class);
//        cfg.configure();

//        SessionFactory sf = new Configuration()               // cfg.buildSessionFactory();
//                .addAnnotatedClass(com.sarvesh.Student.class)
//                .configure()
//                .buildSessionFactory();

//        Session session = sf.openSession();
//        s2 = session.find(Student.class, 1);                 // fetch data

//        Transaction tx = session.beginTransaction();

//        session.merge(s1);           // merge() update data
//        session.persist(s1);           //create
//        s1 = session.find(Student.class, 2);
//        session.remove(s1);        // delete

//        tx.commit();
//        session.close();
//        sf.close();

//        System.out.println(s1);
//        System.out.println(s2);       fetch data


        ///////////////          MAPPING RELATION            ////////////////

//        Laptop l1 = new Laptop();
//        l1.setLid(1);
//        l1.setBrand("MSI");
//        l1.setModel("gl66");
//        l1.setRam(16);
//
//        Laptop l2 = new Laptop();
//        l2.setLid(2);
//        l2.setBrand("Apple");
//        l2.setModel("M2");
//        l2.setRam(32);
//
//        Laptop l3 = new Laptop();
//        l3.setLid(3);
//        l3.setBrand("Asus");
//        l3.setModel("rog");
//        l3.setRam(16);
//
//
//        Alien a1 = new Alien();
//        a1.setAid(101);
//        a1.setAname("Sarvesh");
//        a1.setTech("Java");
//
//        Alien a2 = new Alien();
//        a2.setAid(102);
//        a2.setAname("Shivam");
//        a2.setTech("AI");
//
//        a1.setLaptops(Arrays.asList(l1, l2));
//        a2.setLaptops(Arrays.asList(l3));
//
//        SessionFactory sf= new Configuration()
//                .addAnnotatedClass(com.sarvesh.Laptop.class)
//                .addAnnotatedClass(com.sarvesh.Alien.class)
//                .configure()
//                .buildSessionFactory();
//
//        Session session = sf.openSession();
//
//        Transaction tx = session.beginTransaction();
//
//        session.persist(l1);
//        session.persist(l2);
//        session.persist(l3);
//        session.persist(a1);
//        session.persist(a2);
//
//
//        tx.commit();
//
//        Session session1 = sf.openSession();
//        Alien a3 = session1.find(Alien.class, 101);
//
//
////        System.out.println(a4);
//
//        session.close();
//        sf.close();


 ////////////            FETCHING DATA USING HQL          /////////////


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Query query = session.createQuery("from Laptop");
        List<Laptop> laptops = query.list();

        System.out.println(laptops);

        session.close();
        sf.close();

    }
}
