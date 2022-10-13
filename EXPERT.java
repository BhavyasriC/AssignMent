/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    for(int i=0;i<num;i++){
	        float x = sc.nextFloat();
	        float y = sc.nextFloat();
	        
	        float z = x/2;
	        
	        if(y>=z)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	        
	    }
	}
}
