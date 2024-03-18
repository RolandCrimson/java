package com.hello.chap13.step04;

public class TryFinallyTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		try {
//			System.out.println("numbers[5]: " + numbers[5]);
			System.out.println("numbers[4]: " + numbers[4]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			System.out.println("이 부분은 언제나 실행됩니다.");
		}
	}
}
