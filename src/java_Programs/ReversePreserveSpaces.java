package java_Programs;

public class ReversePreserveSpaces {

	public static void main(String[] args) {

		/*String str="I am";
		String final_str="";
		String[] toReverse = str.split(" ");
		for (int i = toReverse.length - 1; i >= 0; i --)
		{
			final_str += " " + toReverse[i];

		}
		System.out.println(final_str);*/
		/*String a= "I am";
		char[] chars=a.toCharArray();
		char chars2[]=new char[chars.length];
		for(int i=0;i<chars.length-1;i++)
		{
			if(chars[i]==' ')
			{
				chars2[i]=' ';
			}
			for(int j=chars2.length-1;j>=0;j--)
			{
				chars2[j]=chars2[i];
			}
		}*/
		
		String inputString="My name is arun";
	
		char[] inputStringArray = inputString.toCharArray();
        
        //Defining a new char array 'resultArray' with same size as inputStringArray
         
        char[] resultArray = new char[inputStringArray.length];
         
        //First for loop : 
        //For every space in the 'inputStringArray', 
        //we insert spaces in the 'resultArray' at the corresponding positions 
         
        for (int i = 0; i < inputStringArray.length; i++) 
        {
            if (inputStringArray[i] == ' ') 
            {
                resultArray[i] = ' ';
            }
        }
         
        //Initializing 'j' with length of resultArray
         
        int j = resultArray.length-1;
                 
        //Second for loop :
        //we copy every non-space character of inputStringArray 
        //from first to last at 'j' position of resultArray
         
        for (int i = 0; i < inputStringArray.length; i++)
        {
            if (inputStringArray[i] != ' ') 
            {
                //If resultArray already has space at index j then decrementing 'j'
                 
                if(resultArray[j] == ' ')
                {
                    j--;
                }
                 
                resultArray[j] = inputStringArray[i];
                 
                j--;
            }
        }
         
        System.out.println(inputString+" ---> "+String.valueOf(resultArray));
    }
		
	}


