package com.zoho.movieTicket;

import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {
	Scanner sc = new Scanner(System.in);

	int accountNo = 0;
	static UserLogin main = new UserLogin();
	HashMap<String, Details> map = new HashMap<>();

	void option() {
		while (true) {
			try {
				System.out.println("1-Register");
				System.out.println("2-Login");
				System.out.println("3-Exit");

				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					main.createAccount();
					break;
				case 2:
					main.loginAccount();
					break;
				default:
					System.out.println("Exit");
				}
			} catch (Exception e) {
				System.out.println("Give numeric");
				main.option();
			}
		}
	}

	void createAccount() {
		While: while (true) {
			try {

				Details user = new Details();
				String name, userName, password, phone;
				System.out.print("Enter Name : ");
				name = sc.next();
				while (!name.matches("^[a-zA-Z]{5,19}$")) {
					System.out.print("Enter valid name");
					System.out.println(" Eg : Miller12");
					name = sc.next();
				}
				user.setName(name);

				System.out.print("Enter user name : ");
				userName = sc.next();
				while (!userName.matches("^[a-zA-Z][0-9a-z]{5,19}$")) {
					System.out.print("Enter valid user name");
					System.out.println(" Eg : Miller12");
					userName = sc.next();
				}
				user.setUserName(userName);

				System.out.print("create password give 8 characters : ");
				password = sc.next();
				while (!password.matches("^[a-zA-Z][0-9a-z]{7,19}$")) {
					System.out.print("Enter valid password");
					System.out.println(" Eg : Miller12" + " 12345678");
					password = sc.next();
				}
				user.setPassword(password);
				phone = "";
				while (!phone.matches("^[6789][0-9]{9}$")) {
					System.out.print("Enter user phone : ");
					phone = sc.next();
				}

				map.put(userName, user);
				break;
			} catch (Exception e) {
				System.out.println("Please give correct format");
				main.createAccount();
			}
		}

	}

	void loginAccount() {
		Details user = new Details();

		System.out.print("Enter userName ");
		String userName = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		if (map.containsKey(userName)) {
			user = map.get(userName);
			if (user.getPassword().equals(password)) {
				main.processingAccount(user);
			} else if (!user.getPassword().equals(password))
				System.out.println("Incorrect password" + " Enter correct password");
		} else {
			System.out.println("This is not register yet");
			System.out.println("Please create a new account");
			main.createAccount();
		}
	}

	void processingAccount(Details user) {
		Theatre theatre = new Theatre();

		int c = 0;
		do {
			System.out.print("1-Availble screen to book ticket \n2-exit : ");

			try {
				c = sc.nextInt();
				switch (c) {
//				 case 1:
//					 theatre.getBookSeat(); 
//					 break;
				case 1:
					theatre.getMovie();
					processingAccount(user);
				default:
					System.out.println("Exit");
				}

			} catch (Exception e) {
				System.out.println("Enter numerics to select option");
				main.processingAccount(user);
			}
		} while (c == 1 || c == 2);

	}
}
