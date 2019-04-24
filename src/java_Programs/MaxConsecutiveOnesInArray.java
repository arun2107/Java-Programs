package java_Programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxConsecutiveOnesInArray {

	public static void main(String[] args) {

		int arr[]= {1,1,0,1,1,1,1,0,1,1,1,1,1};
		int SecondMaxOnes=0;
		int MaxOnes = 0;
		Set<Integer> hashSet=new HashSet<Integer>();
		for(int n:arr)
		{
			if(n==1)
			{
				MaxOnes++;
				
			}
			if(n==0)
			{
				hashSet.add(MaxOnes);
				MaxOnes=0;	
			}
			
			
	}
		System.out.println(Collections.max(hashSet));
		
		
	}

}
