package com.hello.chap13.step04;

public class TryTest {
	public static void main(String[] args) {
		String s = null;
		
		try {
			System.out.println("s의 길이: " + s.length());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("문자열 변수 s가 null 입니다.");
		}
	}
}
