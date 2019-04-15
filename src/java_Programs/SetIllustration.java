package java_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIllustration {

	public static void main(String[] args) {
		
		char a[] = new char[10];
		a[0]='a';
		a[1]='k';
		a[2]='m';
		a[3]='w';
		a[5]='p';
		 
		HashSet hashSet=new HashSet();
		TreeSet treeSet=new TreeSet();
		LinkedHashSet LinkedHashSet=new LinkedHashSet();
		
		for(int i=0;i<a.length;i++)
		{
			hashSet.add(a[i]);
			treeSet.add(a[i]);
			LinkedHashSet.add(a[i]);
			

		}
		//treeSet.add("Ar");
		hashSet.add("Balaji");
		LinkedHashSet.add("Chandrasekaran");

		System.out.println(hashSet);// Random Order
		System.out.println(treeSet);// Ascending order
		System.out.println(LinkedHashSet); // Insertion Order
		
		// all three set types allow only one null element
		
		// if generics are not specified in treeset u can add any element as the first element but the first element type should be retained for the rest 
		// of the elements else classCastException Occurs
		
		//if generics are not specified for any other set it allows you to add any element type
		
		
	}

}
