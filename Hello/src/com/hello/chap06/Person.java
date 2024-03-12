package com.hello.chap06;

public class Person {
	int id;
	String name;
	int age;
	String gender;
	String job;
	
	public Person(int id, String name, int age, String gender, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}

	void study() {
		System.out.println(name + "은 공부합니다.");
	}
	
	void sleep() {
		System.out.println(name + "은 잠니다.");
	}
	
	void work() {
		System.out.println(name + "은 일합니다.");
	}
	
	void eat() {
		System.out.println(name + "은 먹습니다.");
	}
}
