package com.zoho.BusTicket;

import java.util.ArrayList;

import com.zoho.console.User;

public interface Ticket {
	int availableSeat();
	void cancelTicket(String name, int can, ArrayList<User> list );
}
