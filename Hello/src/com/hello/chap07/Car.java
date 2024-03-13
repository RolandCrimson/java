package com.hello.chap07;

public class Car {
	String model = "new car";
	String color = "white";
	
	public Car(String inputModel, String inputColor) {
		model = inputModel;
		color = inputColor;
	}
	
//	public Car() {
//		
//	}
	
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
