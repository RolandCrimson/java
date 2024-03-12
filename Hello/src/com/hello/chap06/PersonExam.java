package com.hello.chap06;

public class PersonExam {
	public static void main(String[] args) {
		Person kate = new Person(1, "Kate", 32, "female", "accountant");
		Person tom = new Person(2, "Tom", 32, "male", "student");
		
		kate.work();
		tom.study();
	}
}
