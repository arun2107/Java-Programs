package java_Programs;

public class ReverseAndAddPalindrome {
	
	public static void main(String[] args) {
		int num=12;
		int reverse=reverseNum(num);
		int sum=reverse+num;
		
	    do
	    {
	    	sum=reverse+sum;
	    }while(!(reverseNum(sum)==sum));
		
		System.out.println("The palindrome for  " + num + " is " + sum);
	
	}

	public static int reverseNum(int a)
	{
		int reminder;
		int reversenum=0;
		while(a>0)
		{
			reminder=a%10;
			reversenum=(reversenum*10)+reminder;
			a=a/10;
		}
		return reversenum;
	}
	
}
