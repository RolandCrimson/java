package com.hello.chap16.step05;

public class Member {
	private String name;
	private String gender;
	private int point;
	
	public Member(String name, String gender, int point) {
		this.name = name;
		this.gender = gender;
		this.point = point;
	}

	public String getGender() {
		return gender;
	}

	public int getPoint() {
		return point;
	}
	
}
