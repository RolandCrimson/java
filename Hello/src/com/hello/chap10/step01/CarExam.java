package com.hello.chap10.step01;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();
		Convertible mustang = new Convertible("yellow");
		Truck truck = new Truck();
		
		car.drive();
		mustang.openRoof();
		truck.connectTrailer();
		
	}
}
