package com.hello.chap18.part06;

public class TrafficExam {
	public static void main(String[] args) {
		TrafficLight stopLight = TrafficLight.RED;
		System.out.println(stopLight.getCommand());

		TrafficLight goLight = TrafficLight.GREEN;
		System.out.println(goLight.getCommand());
	}
	// enum의 생성자는 private 이어야 함
	// enum은 고정된 상수들의 집합으로, 컴파일타임에 모든 값을 알고 있어야 함
	// 동적으로 다른 클래스에서 접근해서 생성해 주면 곤란함
	// 그렇기 때문에 컴파일 시에 타입 안전성이 보장됨
}
