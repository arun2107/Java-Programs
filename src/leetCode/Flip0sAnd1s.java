package leetCode;

public class Flip0sAnd1s {

	public static void main(String[] args) {

		String s="00110";
		char[] characters=s.toCharArray();
		int zeros=0;
		int ones=0;
		int flips=0;
		for(char ch:characters)
		{
			if(ch=='0')
			{
				zeros++;
			}
			else
			{
				ones++;
			}
			
		}
		
		
			if(zeros>ones)
			{
					System.out.println(ones);
			}
			else if(ones>zeros)
			{
				System.out.println(ones);

				
			}
		
		
		
		
	}

}
