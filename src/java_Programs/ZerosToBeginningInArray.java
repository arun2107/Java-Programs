package java_Programs;

public class ZerosToBeginningInArray {

	public static void main(String[] args) {
		
		int a[]= {2,5,6,0,9,0,6,0};
		int counter=a.length-1;
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]!=0)
				{
					a[counter]=a[i];
					counter--;
				}
			}
			for(int j=0; j<=counter+1;j++) 
			{
 				a[j]=0;
			}
			
		}
		
		
		
	}

}
