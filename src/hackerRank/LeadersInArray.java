package hackerRank;

import java.util.HashSet;
import java.util.Set;

public class LeadersInArray {

	// An element is said to be a leader if 
	//all the elements on it’s right side are smaller than it. Rightmost element is always a leader. For example, 
	//if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array. 
	
	public static void main(String[] args) {

		int a[]= {67,16,19,21,6,2};
		Set hashset=new HashSet();
		boolean larger=true;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(!(a[i]>a[j]))
				{
					larger=false;
					break;
				}
				
				
			}
			if(larger)
			{
				hashset.add(a[i]);
			}
			
		}
		
		System.out.println(hashset);
	}

}
