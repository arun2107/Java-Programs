package java_Programs;

public class OddNumbersToLeftEvenToRight {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,111};
		int j=0;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			if(!(a[i]%2==0))
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
				
			}
			
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		
		
	}

}
