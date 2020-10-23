package com.nttdata.bank;

import java.util.Scanner;

public class Privatebank extends Bank implements Rbi{
	
	private String bankType;
	private double loanInterestRate;
	Account account;
	
	
	public Privatebank(String bankName, int bankCode, String bankType, double loanInterestRate, Account account) {
		super(bankName, bankCode);
		this.bankType = bankType;
		this.loanInterestRate = loanInterestRate;
		this.account = account;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public double getLoanInterestRate() {
		return loanInterestRate;
	}

	public void setLoanInterestRate(double loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void loanIntrestCal() {
		 
		double total = loanInterestRate*account.getBalance();
		System.out.println("over all balance is "+total);
	}
	
	
}
