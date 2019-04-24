package java_Programs;

public class MonotonicArray {

	public static void main(String[] args) {

		int A[]= {10,5,2,1,1,10};
		boolean Monotonous=false;
		int i=1;
		int j=2  ;
		while(i<=A.length-1 && j<A.length)
		{
			if(A[0]>A[1])
			{
				if(A[i]>=A[j])
				{
					Monotonous=true;
				}
				else
				{
					Monotonous=false;
					break;
				}
			}
			else
			{
				if(A[i]<=A[j])
				{
					Monotonous=true;
				}
				else
				{
					Monotonous=false;
					break;
				}
			}
			i++;
			j++;
			
		}
			
		
		System.out.println(Monotonous);

		
	}

}
