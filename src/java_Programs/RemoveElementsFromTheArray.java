package java_Programs;

import java.util.Arrays;

public class RemoveElementsFromTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {2,3,5,6,6,6,7,8};
		int key=6;
		int arrayOutput[]=arrayRemoval(array,key);
		System.out.println(Arrays.toString(arrayOutput)); // Use Arrays.toString to print the array
		
	}
	
	public static int[] arrayRemoval(int arr[],int key)
	{
	
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=key)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		return Arrays.copyOf(arr,j);  // Use Arrays.copyOf to print an array from 0 to J

}

}