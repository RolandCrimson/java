package com.hello.chap15.step03;

public class GenericPiggyBank<T> {
	private T money;

	public T getMoney() {
		return money;
	}

	public void setMoney(T money) {
		this.money = money;
	}
}
