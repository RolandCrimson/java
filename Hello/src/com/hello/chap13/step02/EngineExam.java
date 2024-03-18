package com.hello.chap13.step02;

public class EngineExam {
	public static void main(String[] args) {
		Engine gasolineEngine = new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("부르릉~~~~!!");
			}
		};

		SUV santafe = new SUV(gasolineEngine);
		
		
		SUV sorento = new SUV(new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("드륵드륵드륵~~~~~!!!!");
			}
		});

		santafe.drive();
		sorento.drive();
	}
}
