package com.hello.chap18.part01;

public class Exam01 {
	public static void main(String[] args) {
		// 자바 1.5 이전에 연관된 상수를 취급하던 방법

		int day = 1;

		switch (day) {
		case 1:
			System.out.println("It's Monday.");
			break;
		case 2:
			System.out.println("It's Tuesday.");
			break;
		case 3:
			System.out.println("It's Wednesday.");
			break;
		case 4:
			System.out.println("It's Thursday.");
			break;
		case 5:
			System.out.println("It's Friday.");
			break;
		case 6:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}
		// 단순히 숫자를 이용하여 취급
		// 프로그램을 해석하기 힘듬
		// 데이터간의 연관성을 부여하기 힘들며 사용 중 오류 발생가능성 높음
	}
}
