package com.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fortune {
	
    static int[] subarray ;
   static List<Integer> list = new ArrayList<>();

	
	public  void subArray(int[] array) {
        int length = array.length;
        for (int index = length; index >= 1; index--) {
            for (int start = 0, end = index - 1; end < length; start++, end++) {
               subarray =  printArray(start, end, array);
                System.out.println(Arrays.toString(printArray(start,end,array)));
               int num = convertNumber(subarray);
            }
        }
    }
	  private static int[] printArray(int start, int end, int[] arr) {
	        int[] array = new int[arr.length];
	        int index = 0;
	        for (int i = start; i <= end; i++) {
	            array[index++] = arr[i];
	        }
	        return Arrays.copyOf(array, index);
	    }
  


    public  int convertNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += (int) Math.pow(10, i) * arr[i];
        }
        list.add(ans);
        return ans;
    }
    public int reverseConvertNumber(int[] arr) {
        int ans = 0;
        for (int i = arr.length-1; i >0; i--) {
            ans += (int) Math.pow(10, i) * arr[i];
        }
        list.add(ans);
        return ans;
    }



		
	
	
	
		
		
	}
	
	


