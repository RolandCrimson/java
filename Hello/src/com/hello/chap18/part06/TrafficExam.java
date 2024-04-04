package com.hello.chap18.part06;

public class TrafficExam {
	public static void main(String[] args) {
		TrafficLight stopLight = TrafficLight.RED;
		System.out.println(stopLight.getCommand());

		TrafficLight goLight = TrafficLight.GREEN;
		System.out.println(goLight.getCommand());
	}
}
