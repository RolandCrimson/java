package com.hello.chap12.step06;

public class Bird implements Animal{

	// abstract method sound()를 반드시 구현
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("짹짹!");
	}

//	@Override
//	public void eat() {
//		// TODO Auto-generated method stub
//		System.out.println("쪼아 먹다");
//	}
	
}
