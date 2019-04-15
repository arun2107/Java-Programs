package java_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String a="$%6ArunBalaji";
		Pattern p=Pattern.compile(("[^a-zA-Z0-9]"));
		Matcher M=p.matcher(a);
		if(M.find()==true)
		{
			//System.out.println(M.group());
		}
		a=a.replaceAll("\\W+","");
		System.out.println(a);
	}

}
