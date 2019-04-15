package java_Programs;

public class LargestNumberWithGivenDigits {

	public static void main(String[] args) {

		int a[]={4, 7, 9, 2, 3};
		int temp=0,output=0;
		String a1="";
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			 a1=a1+a[i];
		}
		 output=Integer.valueOf(a1);
		 System.out.println(output);
		
	}

}
