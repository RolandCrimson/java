package com.hello.chap14.step02;

public class FlagGame {
	public static void main(String[] args) {
		Runnable flagTask = new FlagTask();
		Thread thread = new Thread(flagTask); 
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		// 실습과제: FlagTask 클래스를 사용하지 않고 Runnable의 익명구현객체를 사용해보세요
	}
}
