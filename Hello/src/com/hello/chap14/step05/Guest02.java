package com.hello.chap14.step05;

public class Guest02 extends Thread{
	private VendingMachine machine;

	public void setMachine(VendingMachine machine) {
		this.machine = machine;
		this.setName("Guest02");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		machine.setOrder("오렌지쥬스");
	}
}
