package com.hello.chap11.step02;

public class Truck extends Car{
	public Truck(String manufacturer) {
		super(manufacturer);
	}
	
	public void connectTrailer() {
		System.out.println("트레일러 연결");
	}
	
	public void disconnectTrailer() {
		System.out.println("트레일러 해제");
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(getManufacturer() + " 트레일러 트럭 : 부르릉~~~");
	}
}
