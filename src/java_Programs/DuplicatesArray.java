package java_Programs;

import java.util.TreeSet;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,4,5,5,6,77,77};
		TreeSet<Integer> DupsSet=new TreeSet<Integer>();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					DupsSet.add(a[i]);
				}
				
			}
			
		}
		
		System.out.println("The duplicate elements in the array is " + DupsSet);
		
	}

}
