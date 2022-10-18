package com.zoho.console;

public interface Account {
	void balanceEnquiry(UserDetails user);
	void deposit(UserDetails user) ;
	void withdraw(UserDetails user);
	void transactionHistory(UserDetails user) ;
}
