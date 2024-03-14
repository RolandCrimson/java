package com.hello.chap08;

public class OrderExam {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.setAppetizer("죽");
		order.setMaindish("불고기");
		order.setDessert("약과");
		order.setDrink("복분자주");
		order.setTogo(false);
		
		System.out.println("<주문 현황>");
		System.out.println("appetizer: " + order.getAppetizer());
		System.out.println("maindish: " + order.getMaindish());
		System.out.println("dessert: " + order.getDessert());
		System.out.println("drink: " + order.getDrink());
		System.out.println("togo: " + order.isTogo());
	}
}
