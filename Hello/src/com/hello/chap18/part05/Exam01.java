package com.hello.chap18.part05;

public class Exam01 {
	public static void main(String[] args) {
		// enum을 사용
		Day day = Day.MONDAY;
		
//		if(Day.MONDAY == Month.JANUARY) { // <== 컴파일 에러
//			System.out.println("It's same!");
//		}

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
	}
}
