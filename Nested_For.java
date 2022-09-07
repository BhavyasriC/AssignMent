package com.sep07;

import java.util.Scanner;

public class Nested_For {
	static void pattern(String name) {
		char[] c = name.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(i==0||j==0||j==c.length-1||i==c.length-1)
					System.out.print(name.charAt(i));
			     else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Element string : ");
		String name = sc.nextLine();
		pattern(name);
		sc.close();
	}
}
