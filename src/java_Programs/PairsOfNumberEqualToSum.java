package java_Programs;

public class PairsOfNumberEqualToSum {

	public static void main(String[] args) {
		
		int a[]= {1,2,11,4,9,5,6,7,8};
		int number=13;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==number)
				{
					System.out.println("The pairs are " + a[i] +" and " + a[j]);
				}
			}
		}
		
	}

}
