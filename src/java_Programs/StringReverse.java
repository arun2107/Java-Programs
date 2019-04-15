package java_Programs;

public class StringReverse {

	public static void main(String[] args) {

		String A="Arun Balaji";
		String ReverseA="";
		char a[]=A.toCharArray();
		for(int i=A.length()-1;i>=0.;i--)
		{
			ReverseA=ReverseA+a[i];
		}
		System.out.println(ReverseA);
		if(ReverseA.equals(A))
		{
			System.out.println("String Reversed");
		}
		else
		{
			System.out.println("String Not Reversed");

		}
	}

}
