package java_Programs;

import java.util.Scanner;

public class FiboNacciSeries {

	public static void main(String[] args) {

		System.out.println("Please enter the number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int input=n;
	int output=fibo(input);
		if(output==input)
		{
			System.out.println("The number is one among the fibonacci");
		}
		
	}
	
	public static int fibo(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		while(c<=n);
		{
			
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

		
		
		return c;
	}

}
