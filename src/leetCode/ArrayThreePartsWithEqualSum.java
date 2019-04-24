package leetCode;

public class ArrayThreePartsWithEqualSum {

	public static void main(String[] args) {

		int arr[]= {0,2,1,1,2,0};
		
		int Allsum=0;
		int tempsum=0;
		int tempposition = 0;
		for(int a:arr)
		{
			Allsum=Allsum+a;
		}
		int average=Allsum/3;
		
		for(int i=0;i<arr.length;i++)
		{
			
			
			
			if(tempsum==average)
			{
				
				for(int j=tempposition;j<i;j++)
				System.out.println(arr[j]);
				System.out.println();
				tempsum=0;
				tempposition=i;

			}
			else if(tempsum>average)
			{
				break;
			}
			if(tempsum<average)
			{
				tempsum=tempsum+arr[i];
			}
			
		}
		
		
	}

}
