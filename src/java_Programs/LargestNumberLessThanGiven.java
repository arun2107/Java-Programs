package java_Programs;

import java.util.Scanner;

public class LargestNumberLessThanGiven {

	public static void main(String args[])
	{
			System.out.println("Please enter a number ");
			Scanner in=new Scanner(System.in);
			int number=in.nextInt();
			System.out.println("Please enter a digit ");
			int digit=in.nextInt();
			
			//String n=Integer.toString(number);
			//String d=Integer.toString(digit);
			
			while(Integer.toString(number).contains(Integer.toString(digit)))
			{
				number--;
			}
			System.out.println("LargestNumberLessThanGiven is " + number);
	}
	
	
}
