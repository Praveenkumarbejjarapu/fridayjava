package com.nttdata.bank.practice;

public abstract class Bank {
 private int bankcode;
 private String bankname;
public Bank(int bankcode, String bankname) {
	super();
	this.bankcode = bankcode;
	this.bankname = bankname;
}
public int getBankcode() {
	return bankcode;
}
public void setBankcode(int bankcode) {
	this.bankcode = bankcode;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public void voiddisplay(Bank bank)
{
	if(bank instanceof Publicbank)
	{
		Publicbank pb=(Publicbank)bank;
		System.out.println("details of public bank are");
		System.out.println("bankcode is "+pb.getBankcode() +"\t bankname is "+pb.getBankname() +"\t loan intrest rate is "
		+ pb.getLoanintrestrate());
		System.out.println(" bank type is " +pb.getBanktype() +"\t bank account number is "+pb.getAccount());
	}
	else
	{
		Privatebank pr=(Privatebank)bank;
		System.out.println("details of priavte bank are");
		System.out.println("bankcode is "+pr.getBankcode() +"\t bankname is "+pr.getBankname() +"\t loan intrest rate is "
		+ pr.getLoanintrestrate());
		System.out.println(" bank type is " +pr.getBanktype() +"\t bank account number is "+pr.getAccount());
	}
		
	}
}

