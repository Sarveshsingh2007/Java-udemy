package com.sarvesh.App;

import com.sarvesh.App.model.Alien;
import com.sarvesh.App.model.Laptop;
import com.sarvesh.App.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		// Using Annotations ---------------------
//		Alien alien = context.getBean(Alien.class);
//		System.out.println(alien.getAge());
//		alien.code();


		// Service class --------------------
		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

	}

}
