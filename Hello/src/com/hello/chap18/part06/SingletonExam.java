package com.hello.chap18.part06;

public class SingletonExam {
	public static void main(String[] args) {
		Singleton hello = Singleton.INSTANCE;
		hello.sayHello();
	}
	// Singleton 객체는 프로그램 시작 시 생성되며, 종료 시 사라짐
	// 프로그램 실행 중에 추가로 객체를 생성할 수 없음
}
