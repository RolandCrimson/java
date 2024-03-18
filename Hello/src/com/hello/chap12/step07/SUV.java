package com.hello.chap12.step07;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}
