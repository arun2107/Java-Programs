package leetCode;

import java.util.HashMap;
import java.util.Map;


public class LongestSubs {

	 public static void main(String[] args) {
	        
		 	String s="ABBBJIK";
	        Map<Character,Integer> hash=new HashMap<Character,Integer>();
	        int i=0;
	        char[] characters=s.toCharArray();
	        for(int j=0;j<characters.length-1;j++)
	        {
	        	if(!hash.containsKey(characters[j]))
	        	{
	        		hash.put(characters[j],1);
	        		i++;
	        	}
	        	else
	        	{
	        		j=hash.get(characters[j]);
	        		hash.clear();
	        		
	        	}
	        }
			System.out.println(i);
	        
	    }
	}


