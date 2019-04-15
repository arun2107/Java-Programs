package java_Programs;

import java.util.HashSet;

public class InsertionOfTwoArrays {

	public static void main(String[] args) {

		int a[]= {21,14,15,17,18};
		int b[]= {22,44,56,61,123,13,12,77,89,88,14};
		HashSet<Integer> hash=new HashSet<Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					hash.add(a[i]);
				}
			}
		}
		
		System.out.println("The duplicates in the array are" + hash);
	}

}
