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
		
		// 코드가 단순해지고 가독성이 좋아짐
		// 인스턴스 생성과 상속을 방지(생성자가 private 임)
	}
}
