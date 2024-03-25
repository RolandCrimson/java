package com.hello.chap17.part01;

import java.util.Arrays;
import java.util.List;

public class ListExam03 {
	public static void main(String[] args) {
		System.out.println("----------------<Arrays.asList>----------------");
		List<String> list = Arrays.asList("서울", "대전", "대구", "부산");
		
		list.add("광주");
		
//        System.out.println("----------------<List.of>----------------");
//        List<String> colors = List.of("Red", "Green", "Blue");
//        colors.add("Magenta");

		
	}
}
