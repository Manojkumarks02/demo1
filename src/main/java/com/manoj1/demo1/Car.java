package com.manoj1.demo1;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive(){
		System.out.println("drive car");
	}

}

