package com.example.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired //to add the dependency between person and food class object 
	Food food;
	public void speak()
	{
		System.out.println("I can speak");
	}
	public void eat()
	{
		food.recipes();
	}
}
