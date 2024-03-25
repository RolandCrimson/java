package com.hello.chap18.part02;

public class Exam01 {
	private static final int MONDAY = 1;
	private static final int TUESDAY = 2;
	private static final int WEDNESDAY = 3;
	private static final int THURSDAY = 4;
	private static final int FRIDAY = 5;
	private static final int SATURDAY = 6;
	private static final int SUNDAY = 7;

	public static void main(String[] args) {
		// 이름을 이용해서 구분하려는 시도
		int day = MONDAY;

		switch (day) {
		case MONDAY:
			System.out.println("It's Monday.");
			break;
		case TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case FRIDAY:
			System.out.println("It's Friday.");
			break;
		case SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}
		// 위 소스에서 상수 추가 시 한 눈에 보기 어려움
		// 서로 다른 상수의 집합을 구분하기 어려움
		// 서로 다른 상수의 집합에서 같은 이름의 상수가 존재하면 문제가 생김
		// 이를 해결하기 위해 인터페이스를 이용한 방법이 등장
	}
}
