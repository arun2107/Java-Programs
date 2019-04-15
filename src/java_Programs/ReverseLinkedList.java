package java_Programs;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {

		List<Integer> LinkedList1=new ArrayList<Integer>();
		List<Integer> arraylist=new ArrayList<Integer>();
		LinkedList1.add(1);
		LinkedList1.add(2);
		LinkedList1.add(3);
		LinkedList1.add(4);
		for(int i=LinkedList1.size()-1;i>=0;i--)
		{
			arraylist.add(LinkedList1.get(i));
		}
		
		System.out.println(arraylist);
	}

}
