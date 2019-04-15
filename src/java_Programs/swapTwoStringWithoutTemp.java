package java_Programs;

import java.util.Arrays;

public class swapTwoStringWithoutTemp {

	public static void main(String[] args) {

		String a="Arun";
		String b="Balagurunathan";
		//a=a+b;//Arun bala
		/*b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length(),a.length());
		System.out.println(b + " ");
		System.out.println(a + " ");*/
		char[] chars=a.toCharArray();
		Arrays.sort(chars);
		
	}

}
