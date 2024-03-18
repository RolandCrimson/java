package com.hello.chap12.step06;

public class AnimalExam {
	public static void main(String[] args) {
		Animal puppy = new Dog();
		Animal sparrow  =new Bird();
		
		puppy.sound();
		sparrow.sound();
		
		System.out.println(Animal.name);
		
//		puppy.eat();
//		sparrow.eat();
	}
}
