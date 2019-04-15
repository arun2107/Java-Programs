package java_Programs;

public class Count_Occurences_Of_Anagrams {

	public static void main(String[] args) {

		String inputString="forxxorfxdofr";
		char inputStringChars[]=inputString.toCharArray();
		String searchString="for";
		boolean yes=false;
		char[] searchStringchars=searchString.toCharArray();
		String output="";
		for(int i=0;i<inputStringChars.length-1;i++)
		{
			while(output.length()<=searchString.length()) {
			output=output+inputString.charAt(i);}
		}
		char OutputChars[]=output.toCharArray();
		for(char c:OutputChars)
		{
			for(char v:searchStringchars) {
			if(!(c==v))
			{
				 yes=true;
			}
			if(yes)
			{
				System.out.println(output);
			}
		}
		
	}

}}
