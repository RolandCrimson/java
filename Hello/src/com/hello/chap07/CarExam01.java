package com.hello.chap07;

public class CarExam01 {
	public static void main(String[] args) {
		Car myCar = new Car("sedan", "black");
		Car yourCar = new Car("SUV", "blue");
//		Car rentCar = new car();
		
		myCar.drive();
		yourCar.drive();
	}
}