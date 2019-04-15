package java_Programs;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		System.out.println("Please Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=s.replace("\\s+","");
		System.out.println("The Trimmed String is " + s1);
		
	}

}
