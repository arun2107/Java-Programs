package java_Programs;

public class ArrayEquality {

	public static void main(String[] args) {

		int[] array1= {1,2,3};
		int[] array2= {3,2,3};
		boolean result=true;
		for(int i=0;i<array1.length-1;i++)
		{
			{
				if(!(array1[i]==array2[i]))
				{
					result=false;
				}
			}
		
		}
		if(result==true)
		{
			System.out.println("The arrays are equal");
		}
		else
		{
			System.out.println("The arrays are not equal");
		}
		}
		
	}


