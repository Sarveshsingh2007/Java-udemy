package com.sarvesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
//        session.remove(s1);

//        tx.commit();
//        session.close();
//        sf.close();

//        System.out.println(s1);
//        System.out.println(s2);       fetch data

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAname("Jadu");
        a1.setTech("space");

        SessionFactory sf= new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.persist(a1);
        tx.commit();

        session.close();
        sf.close();
    }
}
