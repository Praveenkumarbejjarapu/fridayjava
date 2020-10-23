package com.nttdata.bank;

import java.util.Scanner;

public abstract class Bank {
	private String bankName;
	private int bankCode;
	public Bank(String bankName, int bankCode) {
		super();
		this.bankName = bankName;
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	void display(Bank bank)
	{
		if(bank instanceof Publicbank)
		{
			Publicbank p = (Publicbank)bank;
			System.out.println("details of bank are :");
			System.out.println("bank name :"+p.getBankName()+"\t"+"bank type "+p.getBankType()+"\t"+"Loan rate :"+p.getLoanInterestRate());
		}
		else
		{
			Privatebank p1 = (Privatebank)bank;
			System.out.println("details of bank are :");
			System.out.println("bank name :"+p1.getBankName()+"\t"+"bank type :"+p1.getBankType()+"\t"+"Loan rate :"+p1.getLoanInterestRate());
		}
	}
	

}



