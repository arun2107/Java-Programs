package leetCode;

public class NumberOfOccurences {

	public static void main(String[] args) {

		String Jewels="Aab";
		String Stones="aAAbbbb";
		int jewels=0;
		for(char c:Jewels.toCharArray())
		{
			for(char s:Stones.toCharArray())
			{
				if(c==s)
				{
					jewels++;
				}
			}
		}
	
		System.out.println(jewels);
	}

}
