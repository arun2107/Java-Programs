package java_Programs;

import java.util.regex.Pattern;

public class NumberOrNot {

	public static boolean NumberorNot(String a) {
		
		/*String digit="[0-9]+";
		boolean isDigit;		
		isDigit=digit.matches(Integer.toString(a));
		System.out.println(isDigit);*/
		try
		{
		Integer.parseInt(a);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;

	}

	public static void main(String[] args)
	{
		boolean NumberorNotstr=NumberorNot("88");
		System.out.println(NumberorNotstr);
	}

	
}
