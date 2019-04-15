package java_Programs;

public class SeperateZerosNonZeros {

	public static void main(String[] args) {
		int a[]= {1,2,0,4,0,4,5,6};
		int counter=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=0)
			{
				a[counter]=a[i];
				counter++;
			}
		}
		for(int j=counter+1;j<=a.length-1;j++)
		{
			a[j]=0;
		}

		System.out.println(a);

	}

}
