package com.greatlearning.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.GreatLearning;

@SpringBootApplication
public class SpringBootLibraryDesignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("hello");
		System.out.println("damien");
	}

	@Override
	public void run(String... args) throws Exception {
		GreatLearning greatLearning = new GreatLearning();
        greatLearning.setCourseName("Designing microservices with spring boot");
        greatLearning.setCourseType("Information Technology");
        greatLearning.setInstructorName("Samarth Narula");
        System.out.println("Great Learning " + greatLearning);
	}

}
