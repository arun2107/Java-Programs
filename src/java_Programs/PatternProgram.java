package java_Programs;

import java.util.Scanner;

public class PatternProgram {
	
	
	public static void main(String args[])
	{	
		System.out.println("Enter the number of Rows");
		Scanner sc=new Scanner(System.in);
		int noOfRows=sc.nextInt();
		int counter=1;
		
		for(int i=noOfRows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "); // print spaces
			}
			
			for(int j=1;j<=counter;j++)
			{
				//
				//System.out.print(rowcount+" "); //this is for printing like 1 22 333
				//System.out.print(j + ""); // this is for printing numbers like 1 2 3
				System.out.print("* "); // this is for printing stars
			}
			System.out.println();
			counter++;
		}
		
		
	}

}
