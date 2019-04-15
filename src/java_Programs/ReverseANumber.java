package java_Programs;

public class ReverseANumber {

	public static void main(String[] args) {

		int a=1014;
		int temp;
		int reversenum=0;
		while(a>0)
		{
		temp=a%10;
		reversenum=(reversenum*10)+temp;
		a=a/10;
		
	}
		System.out.println(reversenum);

}}
