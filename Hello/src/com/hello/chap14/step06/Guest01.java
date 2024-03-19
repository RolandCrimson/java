package com.hello.chap14.step06;

public class Guest01 extends Thread{
	private VendingMachine machine;

	public void setMachine(VendingMachine machine) {
		this.machine = machine;
		this.setName("Guest01");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		machine.setOrder("탄산수");
	}
}
