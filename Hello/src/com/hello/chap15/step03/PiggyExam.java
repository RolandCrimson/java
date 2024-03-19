package com.hello.chap15.step03;

public class PiggyExam {
	public static void main(String[] args) {
		GenericPiggyBank<Integer> intPiggy = new GenericPiggyBank<Integer>();
		intPiggy.setMoney(1000);
		System.out.println(intPiggy.getMoney());
		
		GenericPiggyBank<Double> doublePiggy = new GenericPiggyBank<Double>();
		doublePiggy.setMoney(12.56);
		System.out.println(doublePiggy.getMoney());
		
		GenericPiggyBank<Apple> applePiggy = new GenericPiggyBank<Apple>();
		applePiggy.setMoney(new Apple());
		System.out.println(applePiggy.getMoney());

	}
}
