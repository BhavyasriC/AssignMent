package com.zoho.BusTicket;

public class Bus {
	private boolean busAc;
	private String busNumber;
	private byte seats;
	 Bus(String busNumber, boolean busAc, byte seats){
		 this.busNumber = busNumber;
		 this.busAc= busAc;
		 this.seats = seats;
		 
	 }
	public boolean isBusAc() {
		return busAc;
	}
	public void setBusAc(boolean busAc) {
		this.busAc = busAc;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public byte getSeats() {
		return seats;
	}
	public void setSeats(byte seats) {
		this.seats = seats;
	}
//	public boolean isBusAc() {
//		return busAc;
//	}
//	
//	public String getBusNumber() {
//		return busNumber;
//	}
//	public byte getSeat() {
//		return seats;
//	}

	
	
    
    
    
    
}
