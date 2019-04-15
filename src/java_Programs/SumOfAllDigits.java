package java_Programs;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int temp;
		int result=0;
		while(num>0)
		{
			 temp=num%10;
			 result=result+temp;
			 num=num/10;
		}
		
		System.out.println("The sum of the number is " +result);
	}

}
