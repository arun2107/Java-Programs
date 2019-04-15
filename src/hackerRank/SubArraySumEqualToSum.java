package hackerRank;

public class SubArraySumEqualToSum {

	public static void main(String[] args) {

		int[] a= {42, 15, 12, 8, 6, 32};
    	int number=27;
    	
    	int sum=0
    	,temp;
    	
    	for(int i=0;i<a.length-1;i++)
    	{
    		sum=a[i];
    		for(int j=i+1;j<a.length-1;j++)
    		{
    			sum=sum+a[j];
    			
    			if(sum==number)
    			{
    				for(int k=i;k<=j;k++)
    				{
    					System.out.println(a[k]);
    					
    				}
    			}
    			else if(sum>number)
    			{
    				break;
    			}
    		}
    	}
	}

}
