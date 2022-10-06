package com.zoho.console;

import java.util.HashMap;
import java.util.Scanner;

public class Processing {

	Scanner sc = new Scanner(System.in);
	
	int accountNo = 0;
	AccountDetails account = new AccountDetails();
	static Processing main = new Processing();
	HashMap<String, UserDetails> map = new HashMap<>();

	void option() {
		while(true) {
		try {
		System.out.println("1-New User");
		System.out.println("2-Existing User");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			main.createAccount();
			break;
		case 2:
			main.loginAccount();
			break;
		default :
			System.out.println("Exit");
		}
		}catch(Exception e) {
			System.out.println("Give numeric");
			main.option();
		}
		}
	}
	void createAccount() {
		While:
		while(true) {
		try {	
		
		UserDetails user = new UserDetails();
		AccountDetails account = new AccountDetails();
		
		String name, userName, password,phone;
		double accountBal;
		System.out.println("Enter Name");
	    name = sc.next();
	    user.setName(name);
	    System.out.println("Enter userName");
	    userName = sc.next();
	    user.setUserName(userName);
	    System.out.println("Enter password");
	    password = sc.next();
	    user.setPassword(password);
	    phone ="";
	    while(!phone.matches("^[6789][0-9]{9}$")) {
			System.out.print("Enter user phone");
			phone = sc.next();		
		}
	    
	    System.out.println("Enter account balance");
	    accountBal = sc.nextDouble();
	    account.setAccountbal(accountBal);
	    accountNo = accountNo+1;
	    account.setAccountNo(accountNo);
		user.setAccount(account);
	    user.setPhone(phone);

	    
	    map.put(userName ,user);
	    System.out.println(map);
	    break;
		}catch(Exception e) {
			System.out.println("Please give correct format");
			main.createAccount();
		}
		}
	    
	}
	void loginAccount() {
		UserDetails user = new UserDetails();
		
		System.out.print("Enter userName ");
		String userName = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		if (map.containsKey(userName)) {
			    user = map.get(userName);
			if (user.getPassword().equals(password)) {
				main.processingAccount(user);
			}
		} else {
			System.out.println("This is not register yet");
			System.out.println("Please create a new account");
			main.createAccount();              
		}
	}
	
	void processingAccount(UserDetails user) {
		
		while(true) {
			System.out.println("\n1-deposit\n2-withdraw\n3-balanceEnquiry\n4-Transaction History\n5-exit");
			System.out.print("Enter the input: ");
			try {
				int choice=sc.nextInt();
				switch(choice) {	
				case 1:
					account.deposit(user);
					break;
				case 2:
					account.withdraw(user);
					break;
				case 3:
					account.balanceEnquiry(user);
					break;
				case 4:
					account.transactionHistory(user);
					break;
				default:
					System.out.println("Exit");
					return;
			}
		}catch (Exception e) {
			System.out.println("Give numerics");
			main.processingAccount(user);
		}			
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("*********************");
		main.option();
		System.out.println("*********************");

	}

}
