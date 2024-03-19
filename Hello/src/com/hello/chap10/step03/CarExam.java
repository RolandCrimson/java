package com.hello.chap10.step03;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car("현대");
		Convertible mustang = new Convertible("현대", "yellow");
		Truck truck = new Truck("현대");
		
		car.drive();
		mustang.drive();
		truck.drive();
	}
}
