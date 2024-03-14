package com.hello.chap08;

public class CoffeeExam {
	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();
		
		machine.makeCoffee();
		machine.addShot(1);
		machine.addShot(100);
		machine.addSugar(100);
		System.out.println(machine.getProduction());
		
//		machine.sugar = 10;
//		System.out.println(machine.production);
	}
}
