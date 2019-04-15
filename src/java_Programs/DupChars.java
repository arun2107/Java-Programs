package java_Programs;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DupChars {

	public static void main(String[] args) {
		System.out.println("Please Enter the String");
		Scanner sc=new Scanner(System.in);
		String output="";
		String s1=sc.next();
		char[] chars=s1.toCharArray();
		HashMap<Character,Integer> dupCharsMap=new HashMap<Character,Integer>();
		for(char c:chars)
		{
			if(dupCharsMap.containsKey(c))
			{
				dupCharsMap.put(c,dupCharsMap.get(c)+1);
			
			}
			else
			{
				dupCharsMap.put(c,1);
			}

		
			
			
		}
		Set<Character> keyset=dupCharsMap.keySet();
		
		for(char c:keyset)
		{
			if(dupCharsMap.get(c)!=1)
			{
				System.out.println("The entry " +c +" has "+ dupCharsMap.get(c)+" Occurences in the Hashmap ");
			}
		}
		

	}

}
