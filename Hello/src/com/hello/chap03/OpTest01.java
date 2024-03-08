package com.hello.chap03;

public class OpTest01 {
	public static void main(String[] args) {
		int num01 = 10;
		int num02 = 4;
		int temp = num01;
		
		int sum = num01 + num02;
		int sub = num01 - num02;
		int mul = num01 * num02;
		int div = num01 / num02;
		int mod = num01 % num02;
		
		System.out.println("num01: " + num01);
		System.out.println("num02: " + num02);
		System.out.println("temp: " + temp);
		System.out.println("sum: " + sum);
		System.out.println("sub: " + sub);
		System.out.println("mul: " + mul);
		System.out.println("div: " + div);
		System.out.println("mod: " + mod);
		
		double d = 10 / 3;
		System.out.println("10 / 3: " + d);
		
		d = 10.0 / 3;
		System.out.println("10.0 / 3: " + d);
		
//		Integral promotion
		short result, shortNum1 = 2, shortNum2 = 4;
		result = (short)(shortNum1 + shortNum2);
		System.out.println("short result: " + result);
	}
}
