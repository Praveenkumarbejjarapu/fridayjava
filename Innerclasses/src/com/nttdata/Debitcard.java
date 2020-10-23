package com.nttdata;

public class Debitcard {
private int card_number;
private int cvv;

class Account
{
	private int acc_no;
	private double balance;
	private int pin;
	private String user_name;
	public Account(int acc_no, double balance, int pin, String user_name) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
		this.pin = pin;
		this.user_name = user_name;
	}
	boolean validate_debitcard(int pin,String user_name)
	{
		if(this.pin==pin&&this.user_name==user_name)
		{
			
		return true;
	}
		else
		{
			return false;
		}
}
}}
