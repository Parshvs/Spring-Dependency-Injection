package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class Food {
	public void recipes()
	{
		System.out.println("Food is ready you can eat");
	}
}
