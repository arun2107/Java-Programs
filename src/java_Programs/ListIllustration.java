package java_Programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListIllustration {

	public static void main(String[] args) {
		char a[] = new char[10];
		a[0]='a';
		a[1]='k';
		a[2]='m';
		a[3]='w';
		a[5]='b';
		
		ArrayList arraylist=new ArrayList();
		LinkedList linkedList= new LinkedList();
		
		for(int i=0;i<a.length-1;i++)
		{
			arraylist.add(a[i]);
			linkedList.add(a[i]);
			
		}
		linkedList.add("arun");// LinkedList allows us to add element of another type if generics are not specified
		arraylist.add("Balaji"); // Arraylist also allows us to add element of another type if generics are not specified
		for(int k=0;k<a.length-1;k++)
		{
			System.out.println(arraylist);
			System.out.println(linkedList);
		}
		
		// Allows any number of duplicates
		// both does not maintain any order
		
	}

}
