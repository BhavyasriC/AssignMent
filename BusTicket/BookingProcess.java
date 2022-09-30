package com.zoho.BusTicket;
 
import java.util.ArrayList;
import java.util.Scanner;

import com.zoho.console.User;

public class BookingProcess {
    BusDetails bd = new BusDetails();
 	Scanner sc = new Scanner(System.in);
 	UserDetails user = new UserDetails();
	//ArrayList<UserDetails> list = new ArrayList<>();
	
	public byte isAge() {
		byte age =0;
		boolean validAge = true;
		while(validAge) {
			age= new Scanner(System.in).nextByte();
			if(age<100&&age>0) {
				validAge=false;
			}
			else if(age>100) {
				System.out.println("Age should be below 100");
		
			}
			else
			System.out.println("Enter valid age : ");
		}
		return age;
	}
	
	public int option() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-Book seat\n2-cancel");
		System.out.print("Enter the input: ");
		

		int n = 0;
		try {
		 n = sc.nextInt();
		while(n < 1 || n > 2) {
			System.out.print("Select Correct Option : ");
			n = sc.nextInt();
		}
		}catch(Exception e) {
			System.out.println("give numerics");
			n=option();
		}
		return n;

	}	
	
	
	public void processes() {
		boolean flag = false;
		int n = option();
		switch (n) {
		case 1: 
		      bd.availableSeat();
		       	
           break;
		case 2: 
			System.out.println("no of tickets wants to cancel:");
			int cancelTickets = sc.nextInt();
			for(int i=0;i<cancelTickets;i++) {
				String name = "";
			    bd.cancelTicket(name, cancelTickets, bd.list);	
			}
		}
	}
		
	
		


	public static void main(String[] args) {
		System.out.println("************************");
		BookingProcess b = new BookingProcess();
		ArrayList<BusDetails> bus = new ArrayList<>();
		
		bus.add(new BusDetails("1",true,30));
		bus.add(new BusDetails("2",false,32));
		bus.add(new BusDetails("3",true,30));
     	BusDetails details = new BusDetails();
		
		ArrayList<UserDetails> booking = new ArrayList<>();
		System.out.println();
		UserDetails book = new UserDetails();
		
		
		for(BusDetails u:bus) {
			u.displayInfo();
			
		}


 //    	Scanner sc = new Scanner(System.in);
//		System.out.println("1-Book seat\n2-cancel");
//		String userInput = sc.next();
//        byte c = sc.nextByte();
//        switch(c) {
//        case 1:
//        	for(BusDetails busdetails:bus)
//        		busdetails.equals(userInput);
//        	details.availableSeat();
//        	
//        	break;
//        case 2:
//        	break;
//        	
//        default :System.out.println("Came out");
//        }     
//        sc.close();
		
		b.processes();
		System.out.println("************************");
	
	}


}
