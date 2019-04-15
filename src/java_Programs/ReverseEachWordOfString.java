package java_Programs;

public class ReverseEachWordOfString {
	
	
	public static String reverse(String tobeRev)
	{
		String reversed_str="";
		char[] chars = tobeRev.toCharArray();
		for(int i=tobeRev.length()-1;i>=0;i--)
		{
			reversed_str=reversed_str+chars[i];
		}
		return reversed_str;
		
	}

	public static void main(String[] args) {

		String a="My name is Usman Khawatzaaa";
		String reversedWakkiam="";
		String[] split = a.split(" ");
		
		
		
		
		for(String toberev:split)
		{
			String reversedword=reverse(toberev);
			reversedWakkiam=reversedWakkiam+reversedword;
		}
		
		System.out.println("the reversed String is " + reversedWakkiam);
	}

}
