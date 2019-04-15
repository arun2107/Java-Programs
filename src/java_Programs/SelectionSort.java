package java_Programs;

public class SelectionSort {

	public static void main(String[] args) {

		int a[]= {22,12,1,42,45,78,11,112,4};
		int temp,minimum,i,j;
		for( i=0;i<a.length-1;i++)
		{
			// assuming the first element to be the minimum of the unsorted array .
			minimum=i;
			for( j=i+1;j<a.length;j++)
				{
				if(a[j]<a[minimum])
				{
			//find the minimum element
					minimum = j ;
				}}
				temp=a[i];
				a[i]=a[minimum];
		
				a[minimum]=temp;
		}

for(int k=0;k<a.length-1;k++)
		{
			System.out.println(a[k]);

		}

	}

}
