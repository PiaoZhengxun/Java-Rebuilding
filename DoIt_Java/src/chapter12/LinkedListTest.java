package chapter12;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("a");
		myList.add("b");
		myList.add("c");
		
		System.out.println(myList);
		
		myList.add(1, "d");
		System.out.println(myList);
		
		myList.addFirst("000");
		System.out.println(myList);
		
		myList.removeLast();
		System.out.println(myList);
	}

}

