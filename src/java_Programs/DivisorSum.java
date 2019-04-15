package java_Programs;

public class DivisorSum {

	public static void main(String[] args) {

		int a=36;
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
