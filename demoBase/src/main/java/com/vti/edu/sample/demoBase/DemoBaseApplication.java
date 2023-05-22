package com.vti.edu.sample.demoBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBaseApplication {

	public static void main(String[] args) {
        System.out.println("Started Pro");
		SpringApplication.run(DemoBaseApplication.class, args);
        System.out.println("Ended Pro");
	}

}
