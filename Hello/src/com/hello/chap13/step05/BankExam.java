package com.hello.chap13.step05;

public class BankExam {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		account.deposit(10000);
		System.out.println("잔액: " + account.getBalance());

		try {
			account.withdraw(50000);
		} catch (BalanceInsufficientException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
