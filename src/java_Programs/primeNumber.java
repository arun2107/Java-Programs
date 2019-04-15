package java_Programs;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		boolean isPrime=true;
		for(int i=2;i<a;i++)
		{
			if((a%i==0))
			{
				 isPrime=false;
			}
	
		}
	if(isPrime)
	{
		System.out.println("The number is prime");
	}
	else
	{
		System.out.println("The number is not prime");
	}
	
	}
	

}
