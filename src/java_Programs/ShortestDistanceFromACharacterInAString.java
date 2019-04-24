package java_Programs;

public class ShortestDistanceFromACharacterInAString {

	public static void main(String[] args) {

		String s="loveleetcode";
		char c='e';
		int lengthFromChar=0;
		char chars[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(chars[i]!=c)
			{
			lengthFromChar=i-s.indexOf(c);
			}
			else
			{
				i=s.indexOf(c);
				lengthFromChar=i-s.indexOf(c);
				System.out.println(lengthFromChar);
				continue;
			}
			
			
			if(lengthFromChar<0)
			{
				lengthFromChar=lengthFromChar*-1;
				System.out.println(lengthFromChar);
			}
			else
			{
				System.out.println(lengthFromChar);
			}
		}
				
		
		
	}

}
