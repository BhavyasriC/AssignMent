package com.sep07;

public class LabeledForLoop {

	public static void main(String[] args) {
		int i =0,j=0;
		outer:
    for( i =0;i<=5;i++) {
    	inner:
    	for(j =0;j<=9;j++) {
    		System.out.print(j);
    	
    	if(j==3)
    	break inner;
    	}
    	System.out.println();

    }
	}

}
