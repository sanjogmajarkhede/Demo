package com.avinash.rathod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * This annotation tells the spring container this class is spring boot application class.
 * and this is the entry point for the spring application.
 *
 */
@SpringBootApplication
public class SpringDemoApp {

	public static void main(String[] args) {
		
		/**
		 * This line of code tell the Spring framework to consider this 
		 * class as a entry point for spring application.
		 * 
		 * create a servlet container.
		 * performs class path scan.
		 * starts tomcat server.
		 * deploy the app into servlet container and run it.
		 * while running application it register all the annotations with which spring container is familier.
		 * 
		 * run is the static method of SpringApplication class.
		 */
		SpringApplication.run(SpringDemoApp.class, args);
	}

}
