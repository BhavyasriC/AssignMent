package com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<>();

	Scanner scan = new Scanner(System.in);
	Fortune f = new Fortune();
     int[] numbers = new int[4];

	String str = "(+-*/)";
	char[] op = str.toCharArray();

        System.out.println("Enter the Four  Number");

        for (int count = 0; count < 4; count++) {
            numbers[count] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Enter the Result Number");
        int result = scan.nextInt();
        System.out.println(result);
        f.subArray(numbers);
        System.out.println(list.toString());
    }    
    
    
    
    
	}


