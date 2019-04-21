package java_Programs;

import java.util.Stack;

public class StackUnderStanding {

	public static void main(String[] args) {

		Stack stackArr=new Stack();
		stackArr.push(2);
		stackArr.push(3);
		stackArr.push(4);
		stackArr.push(5);
		
		int top=0;
		
System.out.println(stackArr);

stackArr.pop();

System.out.println("After Popping " + stackArr);

System.out.println("So we peek here " +stackArr.peek() + " is the top element " );

System.out.println("Checking if its empty  -> " + stackArr.isEmpty());

System.out.println("finally the size of the stack is  " + stackArr.size());

System.out.println("Now we are gonna search for an element " + stackArr.search(2));
}}
