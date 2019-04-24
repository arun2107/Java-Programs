package java_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackImplementationUsingArray {
	int maxSize=6;
	int newStackArr[]=new int[0];
	int stackArr[]= new int[maxSize];
	int top=0;
	public void push(int data)
	{
		if(top<maxSize) {
				stackArr[top]=data;
		top++;}
		else
		{
			enlarge();
			for(int i=0;i<stackArr.length;i++)
			{
				newStackArr[i]=stackArr[i];
			}
			newStackArr[top]=data;
		}
	}
	
	public void enlarge() {
		
		newStackArr=new int[maxSize*2];
		
	}

	public void pop() {
	if(top<maxSize)
	{
		System.out.println();
		stackArr[top-1]=0;
		top--;
	}
	else
	{
		contract();
		

	}
	}
	
	
	private void contract() {
		int newStackArr[]=new int[maxSize-1];	
	}

	public int size()
	{
		return top;
		
	}
	
	public void show()
	{
				for(int a=0;a<top;a++)
		{
			System.out.println(newStackArr[a]);
		}
	}
		/*else
		{
			for(int b=0;b<=top-1;b++)
	{
		System.out.println(stackArr[b]);*/
	

			
		
	
	public boolean isempty()
	{
		boolean isempty=false;
		if (top==0)
		{
			isempty= true;
		}
		
		else
		{
			System.out.println("the stack is not empty");
		}
		return isempty;
	}

}
