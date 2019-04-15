package java_Programs;

public class BubbleSort {

	public static void main(String[] args) {

		int a[]= {22,12,1,42,45,78,11,112,4};
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);

		}
		
	}

}
