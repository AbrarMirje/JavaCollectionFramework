package com.CollectionInJava.linkedList;

import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Abrar");
		linkedList.add("Java");
		linkedList.add("Python");
		linkedList.add("David");
		linkedList.add(null);
		linkedList.addFirst("AAA");	// Adding data to the first 
		linkedList.addLast("ZZZ");	// Adding data to the last
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		linkedList.add(2, "Data Strucure and Algorithm");	// To add data at specific position
		System.out.println(linkedList.isEmpty());	// false
//		linkedList.clear();	// It will make empty the linked list
		System.out.println(linkedList.isEmpty()); // true
		linkedList.remove(1);
		System.out.println(linkedList);
		System.out.println("David");
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
	}

}
