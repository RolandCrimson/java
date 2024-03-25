package com.hello.chap18.part04;

public class Exam01 {
	public static void main(String[] args) {
		// 클래스를 이용하는 방법
//		if(Day.MONDAY == Month.JANUARY) { // <== 컴파일 에러
//			System.out.println("It's same!");
//		}

		Day day = Day.MONDAY;

//		switch (day) {// <== 사용 불가능
//		case Day.MONDAY:
//			System.out.println("It's Monday.");
//			break;
//		case Day.TUESDAY:
//			System.out.println("It's Tuesday.");
//			break;
//		case Day.WEDNESDAY:
//			System.out.println("It's Wednesday.");
//			break;
//		case Day.THURSDAY:
//			System.out.println("It's Thursday.");
//			break;
//		case Day.FRIDAY:
//			System.out.println("It's Friday.");
//			break;
//		case Day.SATURDAY:
//			System.out.println("It's Saturday.");
//			break;
//		default:
//			System.out.println("It's Sunday.");
//		}
		// 각 상수들의 타입을 자신의 상수집합 이름(클래스 이름)으로 지정
		// 자기 자신을 인스턴스화 한 값을 할당
		// 각각의 상수들이 서로 다른 값을 가지지만, 같은 타입을 유지
		// 그래서 위와 같은 말도 안되는 휴먼에서를 컴파일러가 잡아줌
		// (서로 다른 데이터 타입은 비교 할 수 없다는 에러)
		// 하지만 switch문에서 사용할 수 없음( 굉장히 불편한 단점)
		// 이 문제를 해결하기 위해 등장한 것이 enum
	}
}
