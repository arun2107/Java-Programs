package java_Programs;

public class ReverseASentenceWordByWord {

	public static void main(String[] args) {
		String str="Hi My Name is Arun Balaji";
		String[] strArray=str.split(" ");
		String newWord;
		String newSentence="";
		for(String word:strArray)
		{
			 newWord=reverse(word);
			 newSentence=newSentence+" "+newWord;

		}
		
		System.out.println(newSentence);
	}

	public static String reverse(String s)
	{
		String output="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 output=output+s.charAt(i);
		}
		
		
		return output;
		
	}
}
