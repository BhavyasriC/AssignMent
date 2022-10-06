package com.zoho.console;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.sql.Timestamp;  
import java.time.Instant;
public class AccountDetails {
      HashMap< Timestamp, Transaction> map = new HashMap<>();
      
		Scanner sc = new Scanner(System.in);

		private int accountNo ;
		private double accountbal ;

		public int getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}

		public double getAccountbal() {
			return accountbal;
		}

		public void setAccountbal(double accountbal) {
			this.accountbal = accountbal;
		}
		

		@Override
		public String toString() {
			return "AccountDetails [accountNo=" + accountNo + ", accountbal=" + accountbal + "]";
		}

		AccountDetails() {
		}

		public void balanceEnquiry(UserDetails user) {
			System.out.printf("Account balance: %.2f" , user.getAccount().getAccountbal());
		}

		public void deposit(UserDetails user) {
			System.out.println("Enter deposit Amount");
			double amt=0;
			try {
				amt = sc.nextInt();
				if (amt > 0 && amt<100000) {
					user.getAccount().setAccountbal(user.getAccount().getAccountbal() + amt);
					System.out.println("Your accountbal :" + user.getAccount().getAccountbal());
				} else {
					System.out.println("Invalid ammount");
				}

			} catch (InputMismatchException e) {
				System.out.println("Enter numeric values :");
			}
			Transaction transaction = new Transaction();
			transaction.setUsername(user.getUserName());
			transaction.setAmount(amt);
			map.put(Timestamp.from(Instant.now()), transaction);
			System.out.println(map);
		}

		public void withdraw(UserDetails user) {
		    System.out.println("Enter withdraw Amount");
		    double amt = sc.nextInt();
	        try {
			final double minibal = 1000;
			if (user.getAccount().getAccountbal() >=amt && amt > 0) { //15000
				if (minibal < (user.getAccount().getAccountbal() - amt)) {
					user.getAccount().setAccountbal(user.getAccount().getAccountbal() - amt);
					System.out.println("your accountbal:" + user.getAccount().getAccountbal());
				} else {
					System.out.println("Minimum balance should be :" + minibal);
				}
			} else {
				System.out.println("Insufficent balance");
			}
		}catch (InputMismatchException e) {
				System.out.println("Enter numeric values :");
			}
	        Transaction transaction = new Transaction();
			transaction.setUsername(user.getUserName());
			transaction.setAmount(-amt);
	        map.put(Timestamp.from(Instant.now()), transaction);
		}
		public void transactionHistory(UserDetails user) {
			for (Map.Entry<Timestamp, Transaction> transaction :
	             map.entrySet()) {
				if(user.getUserName().equals(transaction.getValue().getUsername()))
					System.out.println(transaction.getKey()+"--->"+transaction.getValue());
			}
		}

	}



