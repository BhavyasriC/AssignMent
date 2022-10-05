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
		
		System.out.println("1-Book seat\n2-cancel\n3-exit");
		System.out.print("Enter the input: ");
		

		int n = 0;
		try {
		 n = sc.nextInt();
		if(n < 1 || n > 3) {
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
		boolean flag = true;
		while(flag) {
		int n = option();
		switch (n) {
		case 1: 
		      bd.availableSeat();
		      flag = true;
		      break;
		
		case 2: 
			System.out.println("no of tickets wants to cancel:");
			int cancelTickets = sc.nextInt();
			for(int i=0;i<cancelTickets;i++) {
				String name = "";
			    bd.cancelTicket(name, cancelTickets, bd.list);	
			}
			flag = true;
			break;
		
		default:
			System.out.println("Exited successfully");	
			flag = false;
			break;
		
		}
		}
	}
		
	
		


	public static void main(String[] args) {
		System.out.println("************************");
		BookingProcess b = new BookingProcess();
		ArrayList<BusDetails> bus = new ArrayList<>();
		
//		bus.add(new BusDetails("1",true,30));
//		bus.add(new BusDetails("2",false,32));
//		bus.add(new BusDetails("3",true,30));
//     	BusDetails details = new BusDetails();
		
		ArrayList<UserDetails> booking = new ArrayList<>();
		System.out.println();
		UserDetails book = new UserDetails();
		
		
//		for(BusDetails u:bus) {
//			u.displayInfo();
//			
//		}

//        int userinput =1;
//        Scanner scanner = new Scanner(System.in);
//        while(userinput==1) {
//        	System.out.println("enter 1 to book and 2 to exit");
//        	userinput = scanner.nextInt();
//        	if(userinput ==1) {
//        		BookingProcess booking1 = new BookingProcess();
//        		for(BusDetails busItem : bus) {
//        		if(booking1.isAvailable(userinput,busItem)) {
////        			booking.add(booking1);bus
//        			
//        			
//        		}
//        		}
//        	}
 //       }
		
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
