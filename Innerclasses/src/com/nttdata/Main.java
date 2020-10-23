package com.nttdata;

import com.nttdata.Debitcard.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Debitcard d=new Debitcard();
Debitcard.Account a=d.new Account(2345, 9876.99, 54, "john");
boolean b=a.validate_debitcard(54, "john");
if(b==true)
{
	System.out.println("valid details");
}
else
{
	System.out.println("invalid details");
}
	}

}
