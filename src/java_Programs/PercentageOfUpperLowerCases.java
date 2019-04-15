package java_Programs;

public class PercentageOfUpperLowerCases {

	public static void main(String[] args) {
		
		String a="Hi My name is Arun2107 $$Balaji";
		char[] totalChars=a.toCharArray();
		int uppercase=0;
		int lowerCase=0;
		int specialChars=0;
		int digits=0;
		for(char c: totalChars)
		{
			if(Character.isUpperCase(c))
			{
				uppercase++;
			}
			if(Character.isLowerCase(c))
			{
				lowerCase++;
			}
			if(Character.isDigit(c))
			{
				digits++;
			}
			else
			{
				specialChars++;
			}
			
			
		}
		System.out.println(lowerCase);
		System.out.println(uppercase);
		System.out.println(specialChars);
		System.out.println(digits);
		
		
		
	}

}
