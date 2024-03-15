package com.hello.chap11.step02;

public class CarExam {
	public static void main(String[] args) {
		// 자동 형변환
		Car convertible= new Convertible("현대", "yellow");
		Car truck = new Truck("현대");
		
		System.out.println(convertible.getManufacturer());
		System.out.println(truck.getManufacturer());
		
		// 다음은 오류
//		convertible.openRoof();
//		truck.connectTrailer();
		
		convertible.drive();
		truck.drive();
		
		// 자식(자신) 메서드 접근이 필요할 때 수동 형변환
//		Convertible myCar = (Convertible)convertible;
//		Truck yourCar = (Truck)truck;
//		myCar.openRoof();
//		yourCar.connectTrailer();
		
		
		// 허용되지 않는 형변환
//		Truck t = (Truck)convertible;
//		Convertible c = (Convertible)new Car("현대");
		
		// 타입 검사
//		if (convertible instanceof Truck) {
//			Truck t = (Truck)convertible;
//		}
		
	}
}
