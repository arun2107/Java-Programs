package java_Programs;

public class SecondLargestArray {

	public static void main(String[] args) {

		int[] a={121212,14,5124,1251,2144,9898};
		int largest=0;
		int secondLargest=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
			largest=a[i];

			}
			else if(a[i]<largest && a[i]>secondLargest)
			{
				secondLargest=a[i];
			}
		}
		System.out.println("The largest number of the array is " 
		+largest + " and second largest number is " + secondLargest);
		
		
	}

}
