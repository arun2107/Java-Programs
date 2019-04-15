package java_Programs;

import java.util.HashSet;

// An element is said to be a leader if 
//all the elements on it’s right side are smaller than it. Rightmost element is always a leader. For example, 
//if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array. 

public class LeadersinAnArray {
	
	public static void main(String args[])
	{
		int[] a={12, 9, 7, 14, 8, 6, 3};
		HashSet<Integer> leader=new HashSet<Integer>();
	    for(int i=0;i<=a.length-1;i++)
	    {
			boolean larger=true;

	    	for(int j=i+1;j<a.length-1;j++)
	    	{
	    		if(!(a[i]>a[j]))
	    		{
	    			larger=false;
	    			break;
	    		}
	    		
	    		
	    	}
	    	if(larger)
    		{
    			System.out.println(a[i]);
    		}
	    	
	    }
	}

	
	
}
