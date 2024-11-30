package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

import java.util.Scanner;

@SpringBootApplication(scanBasePackages = "com.example.spring")
public class Application {

	public static void main(String[] args) {
		// Set the active profile to "language" using the system property
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "english");

		// Run the Spring application
		SpringApplication.run(Application.class, args);

		// Initialize Spring context using the AppConfig class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Get the GreetingService bean from the context
		GreetingService greetingService = context.getBean(GreetingService.class);

		// Call the greet method on the GreetingService bean
		System.out.println(greetingService.greet("Alice"));

		// Close the context after use
		context.close();
	}

}
