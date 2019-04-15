package java_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a="Arun Balaji";
		String b="aBlaji Arun";
		boolean anagram=true;
		char[] aChars=a.toCharArray();
		Arrays.sort(aChars);
		char[] bChars=b.toCharArray();
		Arrays.sort(bChars);
		if(aChars.length==bChars.length)
		{
  			{
  				for(char EachChar: bChars) {
  				
				if((a.indexOf(EachChar)<0))
				{
					anagram=false;
				}
			
		
		else
		{
			anagram=false;
		}
		}
		if(anagram==true)
		{
			System.out.print("The Provided String is an Anagram");
		}
		else
		{
			System.out.println("The String is not an Anagram");
		}
		
		
	}

}}}
