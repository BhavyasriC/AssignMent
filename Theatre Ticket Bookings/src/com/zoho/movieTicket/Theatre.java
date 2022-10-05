package com.zoho.movieTicket;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Theatre {

	UserLogin use = new UserLogin();
	static ArrayList<Integer> firstMovie = new ArrayList<>();
	static int fristMovieSeats = 30;
	static ArrayList<Integer> secondMovie = new ArrayList<>();
	static int secondMovieSeats = 30;
	static Scanner scan = new Scanner(System.in);
	String[] movieList = new String[] { "Ponniyan selvan", "SetaRama" };

	public void getMovie() {
		System.out.println("Select Movie");
		for (int i = 0; i < movieList.length; i++) {
			System.out.println(i + 1 + "-->" + movieList[i]);
		}
		try {
			int choice = scan.nextInt();
			System.out.println(movieList[choice - 1]);
			getBookSeat(choice);	
		}catch(Exception e) {
			System.out.println("Your choice should be numerics");
			getMovie();	
		}	
	}

	public void getBookSeat(int choice) {

		int noOfSeats = 0;
		int bookedSeats = 0;

		switch (choice) {
		case 1:
			while (fristMovieSeats > bookedSeats) {
				try {
				fristMovieSeats = fristMovieSeats - noOfSeats;
				System.out.println("Available tickets "+fristMovieSeats);
				System.out.print("Give 1 to select seat" + "\nGive 2 Exit : ");
					int c = scan.nextInt();
					switch (c) {
					case 1:
						System.out.println("Booked seats : " + firstMovie);
						System.out.println("Please select except this seat ");

						System.out.print("Enter how many seats : ");
						noOfSeats = scan.nextInt();
						int seatNumber;
						for (int i = 1; i <= noOfSeats; i++) {
							System.out.print("Enter seat number : ");
							seatNumber = scan.nextInt();

							if (firstMovie.contains(seatNumber)) {
								System.out.println("This seat is already full  ");
								i--;
							}

							else {
								firstMovie.add(seatNumber);
							}
						}
						bookedSeats = bookedSeats + noOfSeats;

						int amount = noOfSeats * 150;
						System.out.println("Amount need to pay : " + amount);
						int amountpay = scan.nextInt();
						if (amountpay == amount) {
							System.out.println("Payment Sucessfull");
						} else
							System.out.println("Payment failed");

						System.out.println("Exit account give 2");
						break;
					default:
						System.out.println("Exit");
						use.option();
					}
				} catch (Exception e) {
					System.out.println("Enter numerics to select option");
					getBookSeat(choice);
				}
			}
			break;
		case 2:

			while (secondMovieSeats > bookedSeats) {
				try {
				secondMovieSeats = secondMovieSeats - noOfSeats;
				System.out.println("Available seats are : " + secondMovieSeats);
				System.out.print("Give 1 to select seat:" + "\nGive 2 Exit : ");
					int c = scan.nextInt();
					switch (c) {
					case 1:
						System.out.println("Booked seats : " + secondMovie);
						System.out.println("Please select except this seat ");

						System.out.print("Enter how many seats : ");
						noOfSeats = scan.nextInt();
						int seatNumber;
						for (int i = 1; i <= noOfSeats; i++) {
							System.out.print("Enter seat number : ");
							seatNumber = scan.nextInt();

							if (secondMovie.contains(seatNumber)) {
								System.out.println("This seat is already full  ");
								i--;
							}

							else {
								secondMovie.add(seatNumber);
							}
						}
						// System.out.println(firstMovie);
						bookedSeats = bookedSeats + noOfSeats;

						int amount = noOfSeats * 150;
						System.out.println("Amount need to pay : " + amount);
						WHILE: while (true) {

							try {

								int amountpay = scan.nextInt();
								if (amountpay == amount)
									System.out.println("Payment Sucessfull");
								else
									System.out.println("Payment failed");

							} catch (Exception e) {
								System.out.println("Enter numeric ");

							}
							break WHILE;
						}

						System.out.println("Exit account give 2");
						break;
					default:
						System.out.println("Exit");
						use.option();
					}
				} catch (Exception e) {
					System.out.println("Enter numerics to select option");
					getBookSeat(choice);
				}
			}
			break;

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		 while(fristMovieAvailableSeats>bookedSeats){
//		 fristMovieAvailableSeats=fristMovieAvailableSeats-noOfSeats;
//	     System.out.println("Available seats are : "+fristMovieAvailableSeats);
//
//		 System.out.print("Give 1 to select seat:"+"\nGive 2 Exit : ");
//           try {
//         int c =scan.nextInt();
//         switch(c) {
//         case 1:
//		 System.out.println("Booked seats : "+ firstMovie);
//    	 System.out.println("Please select except this seat ");
//
//		 System.out.print("Enter how many seats : ");
//		 noOfSeats = scan.nextInt();
//		 int seatNumber;
//		 for(int i=1;i<=noOfSeats;i++) {
//			 System.out.print("Enter seat number : ");
//			  seatNumber = scan.nextInt();
//			     
//			 if(firstMovie.contains(seatNumber)) {
//				 System.out.println("This seat is already full  ");
//				 i--;
//			 }
//			
//			 else {
//				 firstMovie.add(seatNumber);	
//			 }		  
//		 }
//		// System.out.println(firstMovie);
//		 bookedSeats =bookedSeats+noOfSeats;
//
//		  int amount = noOfSeats*150;
//		  System.out.println("Amount need to pay : "+amount);
//		     int amountpay = scan.nextInt();
//		  if(amountpay==amount)
//		     {
//		    	 System.out.println("Payment Sucessfull");
//		     }
//		     else 
//		        System.out.println("Payment failed");
//		  
//		  System.out.println("Exit account give 2");
//		  break;
//		  default :
//			  System.out.println("Exit");
//			  use.option();
//		 }
//		 }catch(Exception e) {
//			 System.out.println("Enter numerics to select option");
//			 getBookSeat(choice);
//		 }
//         
//	 }

	}

}
