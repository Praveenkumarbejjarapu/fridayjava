
package com.nttdata.bank;

import java.util.Scanner;

public class Client {

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the details of public bank");
		System.out.println("enter bank name");
		String bName = scanner.next();
		System.out.println("enter the bank code");
		int code = scanner.nextInt();
		System.out.println("enter interest rate");
		double rate = scanner.nextDouble();
		System.out.println("enter account id ");
		int id = scanner.nextInt();
		System.out.println("enter balance");
		double bal = scanner.nextDouble();
		Account a = new Account(id, bal);
		Publicbank pub = new Publicbank(bName, code, "public", rate, a);
		
		System.out.println("enter the details of private bank");
		System.out.println("enter bank name");
		String prBName = scanner.next();
		System.out.println("enter the bank code");
		int prCode = scanner.nextInt();
		System.out.println("enter loan interest rate");
		double prRate = scanner.nextDouble();
		System.out.println("enter account id ");
		int prId = scanner.nextInt();
		System.out.println("enter balance");
		double prBal = scanner.nextDouble();
		Account pa = new  Account(prId, prBal);
		Privatebank pri = new Privatebank(prBName, prCode, "private", prRate, pa);
		pub.display(pub);
		pub.loanIntrestCal();
		pri.display(pri);
		pri.loanIntrestCal();
		
	}
	}

