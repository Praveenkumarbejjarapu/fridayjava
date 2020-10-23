package com.nttdata.bank.practice;

public class Privatebank extends Bank implements Rbi {
private double loanintrestrate;
private String banktype;
Account account;

	public Privatebank(int bankcode, String bankname, double loanintrestrate, String banktype, Account account) {
	super(bankcode, bankname);
	this.loanintrestrate = loanintrestrate;
	this.banktype = banktype;
	this.account = account;
}

	public double getLoanintrestrate() {
		return loanintrestrate;
	}

	public void setLoanintrestrate(double loanintrestrate) {
		this.loanintrestrate = loanintrestrate;
	}

	public String getBanktype() {
		return banktype;
	}

	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public void loanintrestcalculate() {
		// TODO Auto-generated method stub
		double total=loanintrestrate*account.getBalance();
		System.out.println("total amount is " +total);
	}

}
