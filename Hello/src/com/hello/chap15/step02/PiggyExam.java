package com.hello.chap15.step02;

public class PiggyExam {
	public static void main(String[] args) {
		IntPiggyBank intPiggy = new IntPiggyBank();
		intPiggy.setMoney(1000);
		System.out.println(intPiggy.getMoney());
		
		DoublePiggyBank doublePiggy = new DoublePiggyBank();
		doublePiggy.setMoney(50.4);
		System.out.println(doublePiggy.getMoney());
	}
}
