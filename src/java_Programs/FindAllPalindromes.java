package java_Programs;

public class FindAllPalindromes {

	public static void main(String[] args) {

		String a= "geeksforgeeks";
		char characters[]=a.toCharArray();
		StringBuffer buff=new StringBuffer();
		while(!(buff.reverse()==buff))
		{
			for(char c:characters)
			{
				buff.append(c);
				System.out.println(buff);
			}
		}
		
	}

}
