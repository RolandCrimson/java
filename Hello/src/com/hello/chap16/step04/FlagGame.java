package com.hello.chap16.step04;

public class FlagGame {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("백기");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
