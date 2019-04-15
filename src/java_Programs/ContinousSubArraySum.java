package java_Programs;

import java.util.Arrays;
 
public class ContinousSubArraySum
{
    public static void main(String[] args)
    {
    	int[] a= {42, 15, 12, 8, 6, 32};
    	int number=26;
    	int sum=0,j;
    	for(int i=0;i<a.length-1;i++)
    	{
    		sum=a[i];
    		for(j=i+1;j<a.length;j++)
    		{
    			sum=sum+a[j];
    		
    		if(sum==number)
    		{
    			for(int k=i;k<=j;k++)
    			{
    				System.out.println("The continous sub array is " +a[k]);
    			}
    		}
    		if(sum>number)
    		{
    			break;
    		}
    		if(sum<number)
    		{
    			continue;
    		}}
    	}
    		
    }}
    
 