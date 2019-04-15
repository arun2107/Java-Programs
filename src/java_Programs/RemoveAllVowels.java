package java_Programs;

public class RemoveAllVowels {

	public static void main(String[] args) {

		String str="aeiou Badh";
		char[] chars=str.toCharArray();
		char[] vowels= {'a','e','i','o','u'};
		for(char c:chars)
		{
			for(char v:vowels)
			{
				if(c==v)
				{
				chars[str.indexOf(c)]=' ';
				//break;
				}
			}
		}
		System.out.println(String.valueOf(chars).trim().replaceAll(" ", ""));	
	}	
}
