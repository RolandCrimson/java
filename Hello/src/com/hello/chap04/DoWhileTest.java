package com.hello.chap04;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 1;

		do {
			sum += i;
			i++;
		}while (i <= 100); // 반드시 세미콜론이 있어야 함
		System.out.println("1~100 까지의 합: " + sum);
	}
}
