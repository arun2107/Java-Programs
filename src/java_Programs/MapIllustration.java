package java_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIllustration {

	public static void main(String[] args) {

		Map hashMap=new HashMap();
		Map treeMap=new TreeMap();
		Map LinkedHashMap=new LinkedHashMap();
			int a[]=new int[7];
		char c[]= {'a','g','b','z','l','u'};
		a[0]=5;
		a[1]=9;
		a[2]=4;
		a[3]=10;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				hashMap.put(c[j],a[i]);
				treeMap.put(c[j],a[i]);
				LinkedHashMap.put(c[j],a[i]);


			}
		}
		hashMap.put("Arun Balaji",1);
		//treeMap.put("Arun Balaji",2);
		LinkedHashMap.put("Chandrasekaran",3);

		
		
		
		{
			System.out.println(hashMap); //Doesn't retain order
			System.out.println(treeMap); //Maintains order based on Key
			System.out.println(LinkedHashMap); //Maintains insertion Order
		}
		
		// Treemap if generics are not specified it means that if u put the first variable of one type then the next all variables need to be put in same type
		// LinkedHashMap allows any data type if generics are not specified
		// HashMap also allows any data type if generics are not specified
		
	}

}
