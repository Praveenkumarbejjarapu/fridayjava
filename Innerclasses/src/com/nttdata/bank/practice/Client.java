package com.nttdata.bank.practice;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enterpublic  bank details are");
Scanner sc= new Scanner(System.in);
System.out.println("enter bank name");
 String bankname=sc.next();
 System.out.println("enter bank code");
 int bankcode=sc.nextInt();
 System.out.println("enter loan intrest rate");
 int loanintrestrate=sc.nextInt();
 System.out.println("enter account no");
 int account_no=sc.nextInt();
 System.out.println("enter balance");
 double balance=sc.nextInt();
 System.out.println("enter bank type");
 String banktype=sc.next();
 Account a=new Account(account_no, balance);
 Publicbank p=new Publicbank(account_no, banktype, balance, banktype, a);
 
 
 System.out.println("enter private  bank details are");
 System.out.println("enter bank name");
  String prbankname=sc.next();
  System.out.println("enter bank code");
  int prbankcode=sc.nextInt();
  System.out.println("enter loan intrest rate");
  int prloanintrestrate=sc.nextInt();
  System.out.println("enter account no");
  int praccount_no=sc.nextInt();
  System.out.println("enter balance");
  double prbalance=sc.nextInt();
  System.out.println("enter bank type");
  String prbanktype=sc.next();
  Account a1=new Account(account_no, balance);
  Privatebank p1=new Privatebank(praccount_no, prbanktype, prbalance, prbanktype, a1);
  p1.voiddisplay(p1);
  p.voiddisplay(p);
  p.loanintrestcalculate();
  p1.loanintrestcalculate();
  
  
 

 
	}

}
