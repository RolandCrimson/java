package com.hello.chap16.step05;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
	private static List<Member> memberList = List.of(
			new Member("홍길동", "male", 90),
			new Member("김영희", "female", 90),
			new Member("박철수", "male", 85),
			new Member("이혜숙", "female", 87)
			);

	
	public static int getSum(Predicate<Member> predicate) {
		int sum = 0;
		for(Member member: memberList) {
			if(predicate.test(member)) {
				sum += member.getPoint();
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int maleTotal = getSum(m -> m.getGender().equals("male"));
		System.out.println("남자 총점수: " + maleTotal);
		
		int femaleTotal = getSum(m -> m.getGender().equals("female"));
		System.out.println("여자 총점수: " + femaleTotal);
		
	}
	
}
