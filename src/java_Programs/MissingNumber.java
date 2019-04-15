package java_Programs;

public class MissingNumber {

	public static void main(String[] args) {

		int a[]= {-12,2,1,3,5,6,8,9,10}; // considering this as a sorted array
		int n=a[a.length-1];
		 int realsum=0;
		 int generatedsum=0;
		 int diff=0;
		 int firstMissNum=0;
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]>0)
				{
					realsum=realsum+a[i]; // 1. Sum of the array elements
					generatedsum=(n*(n+1))/2; //2. Generated sum of array elements		
				}
				
		
						
				}
		diff=generatedsum-realsum; // 3. find the difference between both
		System.out.println(diff);
		int average=diff/2;  // 4. Divide the difference by 2 and name it as average
		
		int averagesum=0;
		int averagegeneratedsum=0;
		
		for(int k=0;k<average;k++) // 5. run the loop between 0 to average and find the generated sum and the real sum
		{
			if(a[k]>0) {
			averagesum=averagesum+a[k];
			averagegeneratedsum=(average*(average+1))/2;}
		}
		firstMissNum=averagegeneratedsum-averagesum; // 6. Find the difference between the generated sum and the real sum - this would be the first missing number
		System.out.println(firstMissNum);
		int nextaveragesum=0;
		int nextAverageGeneratedsum=0;
		for(int m=average;m<=a.length-1;m++) 
		{
			
			nextaveragesum=nextaveragesum+a[m]; // find the sum of array elements greater than the average
			
		}
			int nextaveragegeneratedsum=generatedsum-(average*(average+1))/2;
			int secondMissNum=nextAverageGeneratedsum-nextaveragesum;
			System.out.println(secondMissNum);
	}
	}


