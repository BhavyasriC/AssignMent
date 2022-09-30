package com.zoho.BusTicket;

import java.util.Scanner;

public class UserDetails {
	
	Scanner sc = new Scanner(System.in);

		private String name;
		private int age;
		private String phone;
		UserDetails(String name,int age,String phone){
			this.name=name;
			this.age=age;
			this.phone=phone;
		}
		UserDetails(){
//			System.out.println("enter name : ");
//			name = sc.next();
            
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getPhone() {
			return phone;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + ", phone=" + phone + "]";
		}
		
	}



