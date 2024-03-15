package com.hello.chap10;

public class CarExam {
	public static void main(String[] args) {
		// STEP 1 - START
		Car car = new Car();
		Convertible mustang = new Convertible("yellow");
		Truck truck = new Truck();
		
		car.drive();
		mustang.openRoof();
		truck.connectTrailer();
		// STEP 1 - END
		
		
		// STEP 2 - START
//		Car car = new Car("현대");
//		Convertible mustang = new Convertible("현대", "yellow");
//		Truck truck = new Truck("현대");
//		
//		car.drive();
//		mustang.openRoof();
//		truck.connectTrailer();
		// STEP 2 - END
		
		// STEP 3 - START
//		Car car = new Car("현대");
//		Convertible mustang = new Convertible("현대", "yellow");
//		Truck truck = new Truck("현대");
//		
//		car.drive();
//		mustang.drive();
//		truck.drive();
		// STEP 3 - END
	}
}
