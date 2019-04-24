package java_Programs;

public class Sort_Array_By_Parity {

	public static void main(String[] args) {

		int[] arr= {4,2,5,7};
		int temp;
		int position=0;

			int[] newArr=new int[arr.length-1];
	
	
	
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i]%2==0)
				{
					newArr[position]=arr[i];
					position=position+2;
				}
				
				else
				{
					position=1;
					newArr[position]=arr[i];
					position=position+2;
				}

		}
	}
}