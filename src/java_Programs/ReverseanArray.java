package java_Programs;

public class ReverseanArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,1212,12121};
		int temp;
		for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-(1+i)];
			a[a.length-1-i]=temp;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		
	}

}
