package java_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStrWithoutReps {

	public static void main(String[] args) {

		String a="AaBJP";
		String output="";
		char chars[]=a.toCharArray();
		LinkedHashMap<Character,Integer> hashmap=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<=chars.length-1;i++)
		{
			char character=chars[i];
			if(!(hashmap.containsKey(chars[i])))
			{
				hashmap.put(character,i);
			}
			else
			{
				i=hashmap.get(character);
				hashmap.clear();
			}
		}
		
		System.out.println("The longest SubString is" +hashmap.keySet().toString());
		
		
	}

}
