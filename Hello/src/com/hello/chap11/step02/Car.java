package com.hello.chap11.step02;

public class Car {
	private String manufacturer;
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public Car(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void drive() {
		System.out.println("달린다.");
	}

	public void stop() {
		System.out.println("멈춘다.");
	}
}
