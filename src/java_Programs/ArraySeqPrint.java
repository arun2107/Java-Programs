package java_Programs;

public class ArraySeqPrint {

	public static void main(String[] args) {

		String a="abcde";
		String b="mno";	
		char[] Achars=a.toCharArray();
		char[] Bchars=b.toCharArray();
		String output="";
		int i=0;
		
		for(i=0;i<Achars.length-1;i++)
		{
			
			if(!(i>=b.length()))
			{
				output=output + Achars[i]+Bchars[i];
			}
			else
			{
				i--;
				break;
			}
		}
		
		if(Achars.length>Bchars.length) {
			
		
		for(int j=i;j<Achars.length;j++)
		{
			output=output+Achars[j];
		}}
		
		System.out.println(output);
	}}

