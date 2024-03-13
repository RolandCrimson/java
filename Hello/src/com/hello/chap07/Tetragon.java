package com.hello.chap07;

public class Tetragon {
	
	public int getSquareArea(int x) {
		return x * x;
	}

	public int getSquareArea(int x, int y) {
		return x * y;
	}
	
//	----< 파라미터 수는 동일하고 타입이 다른 경우 >-------
//	public int getSquareArea(int x, double y) {
//		return x * (int)y;
//	}
//	--------------------------------------------------
	
//	----------< 잘못된 메서드 Overload >----------------
//	public double getSquareArea(int x, int y) {
//		return (double)(x * y);
//	}
//	--------------------------------------------------
}
