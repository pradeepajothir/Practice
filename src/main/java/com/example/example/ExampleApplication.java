package com.example.example;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ExampleApplication.class, args);

		// Get the bean and call the method
		HackerRank hackerRank = context.getBean(HackerRank.class);
		hackerRank.doExercise();
	}

}
