package com.hello.chap12.step07;

public class EngineExam {
	public static void main(String[] args) {
		Engine gas = new GasolineEngine();
		Engine diesel = new DieselEngine();
		SUV santafe = new SUV(gas);
		SUV sorento = new SUV(diesel);
		
		santafe.drive();
		sorento.drive();
	}
}
