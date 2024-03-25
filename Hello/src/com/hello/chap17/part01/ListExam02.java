package com.hello.chap17.part01;

import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for (int s : list) {
			System.out.println(s);
		}
		System.out.println("-------<인덱스 2 항목 삭제>----------------------");
		
		list.remove(2);
		for (int s : list) {
			System.out.println(s);
		}
		System.out.println("--------------<항목 2 삭제>---------------");
		
		Integer item = 2;
		list.remove(item);

		for (int s : list) {
			System.out.println(s);
		}
	}
}
