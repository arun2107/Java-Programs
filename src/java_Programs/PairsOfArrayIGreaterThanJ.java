package java_Programs;

public class PairsOfArrayIGreaterThanJ {

	public static void main(String[] args) {

		int a[]= {1, 2, 7, 5, 7, 4, 1, 1, 2, 5};
		int NoOfPairs=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					NoOfPairs++;
				}
			}
		}
		System.out.println(NoOfPairs);
		
	}

}
