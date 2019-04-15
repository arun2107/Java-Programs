package java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapBasedOnValue {

	public static void main(String[] args) {

		Map<Character,Integer> hashmap=new HashMap<Character,Integer>();
		hashmap.put('a',2);
		hashmap.put('c',1);
		hashmap.put('b',4);
		hashmap.put('a',3);
		
		Map<Integer,Character> treeMap=new TreeMap<Integer,Character>();
		for(Map.Entry<Character,Integer> hashentry: hashmap.entrySet() )
		{
			char key=hashentry.getKey();
			int a=hashentry.getValue();
			treeMap.put(a,key);
		}
		System.out.println(treeMap);
		
	}

}
