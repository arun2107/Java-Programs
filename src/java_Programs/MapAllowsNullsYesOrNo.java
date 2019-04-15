package java_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAllowsNullsYesOrNo {
	
	//CONCLUTIONS
	
	//Hashtable does not allow null keys or values, while HashMap allows null value and 1 null key.
	//TreeMap does not allow nu
	
	//IF TREEMAP has Null key values it assigns 0 for the first key... next time when null key comes the zero gets overridden with the next value
	//IF HASHMAP has Null key values it assigns 0 for the first key... next time when null key comes the zero gets overridden with the next value
	//IF TREEMAP has Null key values it assigns 0 for the first key... next time when null key comes the zero gets overridden with the next value
	public static void main(String[] args) {

		int a[]=new int[7];
		a[0]=10;
		a[1]=1;
		a[2]=3;
		a[3]=4;
		a[4]=9;
		a[5]=10;
		
		Map hashMap=new HashMap();
		Map treeMap=new TreeMap();
		Map LinkedHashMap=new LinkedHashMap();
		
		char c[]= {'a','b','c','d',};
		
		
		LinkedHashMap.put(c[0],a[0]);
		LinkedHashMap.put(c[1],a[1]);
		LinkedHashMap.put(c[2],a[2]);
		LinkedHashMap.put(c[3],a[3]);
		LinkedHashMap.put(c[4],a[4]);
		LinkedHashMap.put(c[5],a[5]);


				//treeMap.put(a[i],c[j]);
				//LinkedHashMap.put(a[i],c[j]);

			

		
	
		System.out.println(LinkedHashMap);
		//System.out.println(treeMap);
		//System.out.println(LinkedHashMap);
		
		//
		
	}

}
