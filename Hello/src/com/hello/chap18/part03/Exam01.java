package com.hello.chap18.part03;

public class Exam01 {
	public static void main(String[] args) {
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
	}
}
