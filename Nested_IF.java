package com.sep07;

import java.util.Scanner;

public class Nested_IF {
	static String grade(int marks)
	{
		if(marks<100&& marks>=35) 
		{
					if(marks>70)//95
					{
						if(marks>80)//85 >80
						{
						if(marks>90)//75:85>70
						{
							return "Grade A++";//95
                         }
						else {
							return "GRade A";//85
						}
						}
						else {
							return "Grade B++";//75
						}
					}
					else {
						return "Grade B";//<75
					}
		}
		else
		{
			return "Fail";
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		System.out.println(grade(marks));
      sc.close();
	}

}
