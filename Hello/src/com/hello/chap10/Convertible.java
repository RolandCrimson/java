package com.hello.chap10;

public class Convertible extends Car {
	private String color;

	// STEP 1 - START
	public Convertible(String color) {
		this.color = color;
	}
	
	public void openRoof() {
		System.out.println("뚜껑 연다.");
	}

	public void closeRoof() {
		System.out.println("뚜껑 닫는다.");
	}
	// STEP 1 - END
	
	// STEP 2 - START
//	public Convertible(String manufacturer, String color) {
//		super(manufacturer);
//		this.color = color;
//	}
//	
//	public void openRoof() {
//		System.out.println("뚜껑 연다.");
//	}
//
//	public void closeRoof() {
//		System.out.println("뚜껑 닫는다.");
//	}
	// STEP 2 - END


	//STEP 3 - START
//	public Convertible(String manufacturer, String color) {
//		super(manufacturer);
//		this.color = color;
//	}
//	
//	public void openRoof() {
//		System.out.println("뚜껑 연다.");
//	}
//
//	public void closeRoof() {
//		System.out.println("뚜껑 닫는다.");
//	}
//	@Override
//	public void drive() {
//		// TODO Auto-generated method stub
//		System.out.println(getManufacturer() + " " +  color + " convertible driving!");
//	}
	//STEP 3 - END
	
}
