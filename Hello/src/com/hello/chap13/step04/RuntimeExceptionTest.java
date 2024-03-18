package com.hello.chap13.step04;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		
		// RuntimeException : NullPointerException
		String s = null;
		System.out.println("s의 길이: " + s.length());
		
		// RuntimeException : ArrayIndexOutOfBoundsException
//		int[] numbers = {1, 2, 3, 4, 5};
//		System.out.println("numbers[5]: " + numbers[5]);
	}
}
