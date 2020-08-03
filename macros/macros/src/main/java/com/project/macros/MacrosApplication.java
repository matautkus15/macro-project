package com.project.macros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MacrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacrosApplication.class, args);
		
		StringBuilder message = new StringBuilder();
		message.append("Sup boyo\n" )
			.append("This is your main class and the code written here will be excuted first when the application is started!\n")
			.append("Look in the console down below to see this message!");
		System.out.println(message.toString());
	}

}
