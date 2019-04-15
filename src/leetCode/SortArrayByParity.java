package leetCode;

public class SortArrayByParity {

	public static void main(String[] args) {

		int a[]= {1,3,4,2,6};
		int[] ans=new int[a.length];
		int t=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]%2==0)
			{
				ans[t]=a[i];
				t++;
			}
			
		}
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]%2==1)
				{
					ans[t]=a[i];
				}
			}
		for(int j=0;j<a.length-1;j++)
		{
			System.out.println(ans[j]);
		}
		
		
		
	}

}
