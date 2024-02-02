package com.example.dependency;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		
		//Spring boot configuration
		ApplicationContext con = SpringApplication.run(DependencyInjectionApplication.class, args);
		Person people=con.getBean(Person.class);
		people.eat();
		
//		//spring core configuration
//		//To create application context below line is used
//		
//		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
//		
//		//here it look for the config class for configurations
//		//creates the container to hold the beans and refer it by con object
//		//here we have to do configuration in config file
//		//spring boot eliminates explicit configuration step
//		
//		Person person=con.getBean(Person.class);
//		person.eat();
	}

}
