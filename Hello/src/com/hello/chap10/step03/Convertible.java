package com.hello.chap10.step03;

public class Convertible extends Car {
	private String color;

	public Convertible(String manufacturer, String color) {
		super(manufacturer);
		this.color = color;
	}
	
	public void openRoof() {
		System.out.println("뚜껑 연다.");
	}

	public void closeRoof() {
		System.out.println("뚜껑 닫는다.");
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(getManufacturer() + " " +  color + " convertible driving!");
	}
	
}
