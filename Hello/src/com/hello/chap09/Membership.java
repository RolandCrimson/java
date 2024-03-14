package com.hello.chap09;

public class Membership {
	private final int memberNo;
	private final boolean permanent = true;
	private final String name;
	
	public Membership(int memberNo, String name) {
		this.memberNo = memberNo;
		this.name = name;
	}
	
	public String getIngo() {
		return memberNo + "-" + name;
	}
	
//	public void setMemberNo(int memberNo) {
//		this.memberNo = memberNo;
//	}
}
