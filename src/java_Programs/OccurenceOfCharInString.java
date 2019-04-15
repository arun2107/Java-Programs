package java_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfCharInString {
	
	public static void main(String[] args)
	{
	
	System.out.println("Please enter the string to count the occurences");
	Scanner in=new Scanner(System.in);
	String input1=in.next();
	String input=input1.replaceAll("\\s+","");
	char[] chars=input.toCharArray();
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(char a:chars)
	{
		if(map.containsKey(a))
		{
			map.put(a,map.get(a)+1);
		}
		else
		{
			map.put(a,1);
		}
		
	}
	
	System.out.print("The occurences are"+ map) ;

}
}