package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class EmailManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//If you add periods ('.') between some characters in the local name part of an email address,
		//mail sent there will be forwarded to the same address without dots in the local name.  
		//For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  
		//(Note that this rule does not apply for domain names.)
		
		//If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. 
		//This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com. 
		//(Again, this rule does not apply for domain names.)

		
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter the goddamn email");
		String str=in.next();
		int position=str.indexOf('@');
		int plusPosition=str.indexOf('+');

		char chars[]=str.toCharArray();
		
		for(char c:chars)
		{
			if(!(c=='+'))
			{
				
			if(c=='.' && str.indexOf(c)<position)
			{
				chars[str.indexOf(c)]=' ';
			}
			}
			else
			{
				for(int i=plusPosition;i<position;i++)
				{
					chars[i]=' ';
				}
		}}
	String Out1str=" ";
	for(char d:chars)
	{
		if(d!=' ')
		{
			Out1str=Out1str+d;
		}
		
	}
	System.out.println("The possible email is" + Out1str);

		
	}

}
