package java_Programs;

import java.util.Scanner;

class ArmStrongNumber
{
	public static void main(String[] args)
	{
	System.out.println("Please enter the number to check if its an armstrong number");
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	int num2=num;
	int temp,output=0;
	while(num2>0)
	{
	temp=num2%10;
	output=output+(temp*temp*temp);
	num2=num2/10;
	}
	if(num==output)
	{ 
		System.out.println("The number " +num+ " is an armstrong number");
	}
	else
		System.out.println("The number " + num + " is not an armstrong number ");
	
}
	}