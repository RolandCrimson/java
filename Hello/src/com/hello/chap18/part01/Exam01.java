package com.hello.chap18.part01;

public class Exam01 {
	public static void main(String[] args) {

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
	}
}
