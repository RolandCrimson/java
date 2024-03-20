package com.hello.chap16.step05;

import java.util.function.IntBinaryOperator;

public class OperatorExam {
	public static void main(String[] args) {
		int[] scores = {82, 96, 86, 97, 100, 91, 89, 93};
		
		int max = getMinMax(
				(a, b) -> a >= b ? a: b, scores		
		);
		
		System.out.println("최대값: " + max);
		
		int min = getMinMax(
				(a, b) -> a < b ? a: b, scores
		);
		
		System.out.println("최소값: " + min);
	}
	
	public static int getMinMax(IntBinaryOperator operator, int[] array) {
		int result = array[0];
		for(int num: array) {
			result = operator.applyAsInt(result,  num);
		}
		return result;
	}
}
