package com.hello.chap07;

public class CarExam02 {
	public static void main(String[] args) {
		Car02 myCar = new Car02("sedan", "black");
		
		myCar.drive();
		
		myCar.printThis();
		System.out.println(myCar);
	}
}
