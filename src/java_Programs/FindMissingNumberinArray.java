package java_Programs;

public class FindMissingNumberinArray {
	
	public static void main(String[] args)
	{
	int n=8;
	int[] realarray= {1,2,4,5,6,7,8};
	int fakearray[] = null;
	int realarraysum=0;
	int fakearraysum=(n*(n+1))/2;
	int missingnumber;
	for(int i=0;i<realarray.length;i++)
	{
		realarraysum=realarraysum+realarray[i];
	}
	int missingnum=fakearraysum-realarraysum;
	System.out.println(missingnum);
	
}}
