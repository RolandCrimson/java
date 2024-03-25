package com.hello.chap18.part03;

public class Exam01 {
	public static void main(String[] args) {
		// 인터페이스를 이용하는 방법
		if (DAY.MONDAY == MONTH.JANUARY) { // <- 여기가 문제
			System.out.println("It's same!");
		}

		int day = DAY.MONDAY;

		switch (day) {
		case DAY.MONDAY:
			System.out.println("It's Monday.");
			break;
		case DAY.TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case DAY.WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case DAY.THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case DAY.FRIDAY:
			System.out.println("It's Friday.");
			break;
		case DAY.SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}
		// 두 개의 집합으로 상수를 규정
		// 각 집합별로 동일한 이름의 상수 정의 가능
		// interface의 상수는 자동으로 public static final 이므로 코드를 간결하게 작성할 수 있음
		// 하지만 위 소스의 비교문에서 볼 수 있듯이, 말도 안되는 휴먼 에러를 컴파일러가 잡아주지 못함
		// 이를 해결하기 위해 클래스를 이용
	}
}
