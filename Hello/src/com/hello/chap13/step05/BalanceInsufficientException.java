package com.hello.chap13.step05;

public class BalanceInsufficientException extends RuntimeException{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String msg) {
		super(msg);
	}
}
