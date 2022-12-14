package com.zoho.BusTicket;

import java.util.ArrayList;
import java.util.Scanner;
import com.zoho.console.User;

public class BusDetails implements Ticket {
	
	private String busNumber;
	private boolean busAc;
	private int seats=30;
	
	 public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public boolean isBusAc() {
		return busAc;
	}
	public void setBusAc(boolean busAc) {
		this.busAc = busAc;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	BusDetails(String busNumber, boolean busAc, int seats){
		 this.busNumber = busNumber;
		 this.busAc= busAc;
		 this.seats = seats;	 
	 }
	 BusDetails(){	 
	 }
	 public void displayInfo() {
	    	System.out.println("Bus Number : "+busNumber+" AC : "+busAc+"Available seats : "+seats);
	  }
	
    private final double price= 150; 
    //private int seats=30;
	ArrayList<UserDetails> list = new ArrayList<>();

	@Override
	public int availableSeat() {//10
		Scanner sc = new Scanner(System.in);
		
//		boolean flag = false;
		int bookSeats=0;

		 System.out.print("how many seats you need :");
	     bookSeats = sc.nextInt();

		if(seats>=bookSeats&&bookSeats>0)
		{
			for (int i = 1; i <= bookSeats; i++) {
				String name ="";
				if(!name.matches("^[A-Za-z]+$")) {
					System.out.print(i+" Enter user name");
                    name = sc.next();
				 }
				System.out.print(i+" Enter user age");
			//	byte age = process.isAge();
				int age =0;
				age=sc.nextInt();
				System.out.print(i+" Enter user phone");
		       String phone = "";
		       phone = sc.next();
				if(!phone.matches("^[6789][0-9]{9}$")) {
					if(phone.length()==10) {
						phone = sc.next();
					}
				}
				list.add(new UserDetails(name, age, phone));
			}
			for(UserDetails i:list) {
				System.out.println(i.getName());
			}       	

			double currentPrice = price*bookSeats;
			System.out.println("Amount you need to pay for "+currentPrice+" to book tickets");
	     	double amount = sc.nextDouble();
			//double currentPrice = price*bookSeats;
//			System.out.println("Amount you need to pay for "+currentPrice+" to book tickets");
	        // 	double amount = sc.nextDouble();
			if(currentPrice<=amount) {
				
				seats = seats-bookSeats;
				System.out.println("You booked "+bookSeats+" seats");
				System.out.println("Available seats: "+seats);	
//				flag = true;
			}
			else
				System.out.println("Please pay for tickets cost : "+currentPrice);	
		}
		else if (bookSeats<=0) {
			System.out.println("enter positive number to book ticket ");
//			flag = true;
		}
		else
		{
			System.out.println("We have only "+seats+" availble seats");
//			flag = true;
		}
//		sc.close();
		return bookSeats;
	}
	@Override
	public void cancelTicket(String name, int can, ArrayList<UserDetails> list) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give YES if you want to cancel \nGive NO to continue journey");

		String str = sc.next();
		if(str.equalsIgnoreCase("yes"))
		{
			
			for(int j=0;j<can;j++) {
				System.out.println("Enter name on ticket to cancel");
				name = sc.next();
			
			int index=0;
			for(int i=0;i<list.size();i++) {
				if(name.equals(list.get(i).getName())) {
					index = i;
				}
			}
			
			list.remove(index);
			}
			
			if(price==0) 
				System.out.println("money is not deducted :");
				else if (seats>=can&&can>=0) 
				{
				    seats = seats+can;
				    System.out.println("cancelled sucessfully");
					System.out.println("Available seats are: "+seats);	
				}
				else  if(can>10)
				{
				System.out.println("Requested more than the original bookings");
				}				
				else {
				System.out.println("Cancel ticket");
				}
			    }
		else {
			System.out.println("Thanks for confirmation ");
		}
		
	}

}
