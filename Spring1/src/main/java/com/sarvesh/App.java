package com.sarvesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class); // get bean byType
//        System.out.println(obj.getAge());
//        obj.code();
//
//        Desktop obj1 = context.getBean("com2", Desktop.class);

//        Desktop obj1 = context.getBean(Desktop.class);  // we can get by type or name

        ApplicationContext context = new AnnotationConfigApplicationContext(com.sarvesh.config.AppConfig.class);
        Alien obj = context.getBean(Alien.class);
//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();


//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.process();

//        Desktop dt = context.getBean(Desktop.class);
//        dt.process();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.process();
    }
}
