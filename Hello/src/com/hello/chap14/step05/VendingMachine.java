package com.hello.chap14.step05;

public class VendingMachine {
	private String order;

	public String getOrder() {
		return order;
	}
	
	public synchronized void setOrder(String order) {
		this.order = order;
		try {
			Thread.sleep(1000); // 주문 처리시간
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " ordered " + getOrder());
	}
}
