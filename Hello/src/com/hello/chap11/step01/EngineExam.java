package com.hello.chap11.step01;

public class EngineExam {
	public static void main(String[] args) {
		GasolineEngine engine = new GasolineEngine();
		SUV santafe = new SUV(engine);
		
		santafe.drive();
	}
}
