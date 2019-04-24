package java_Programs;

import java.util.Stack;

public class StringLettersPreservingTheSpecialCharacter {

	public static void main(String[] args) {

		String s="a-bC-dEf-ghIj";
		
		Stack stack=new Stack();
		
		char[] characters=s.toCharArray();
		
		for(char c:characters)
		{
			if(Character.isLetter(c)) {
			stack.push(c);}
		}
		
		StringBuffer buf=new StringBuffer();
		
		for(char c:characters)
		{
		  if(Character.isLetter(c))
		  {
			  buf.append(stack.pop());
		  }
		  else
		  {
			  buf.append(c);
		  }
		}
		
		System.out.println(buf);
		
		
	}

}
