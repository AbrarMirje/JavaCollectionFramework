package com.CollectionInJava.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abrar");
		arrayList.add("Java");
		arrayList.add("David");
		arrayList.add("Python");
		
		System.out.println("For normal classes");
//		ListIterator cursor: with normal version : print the data in forward direction
		ListIterator listIterator = arrayList.listIterator();
		
		while(listIterator.hasNext()) {
			String string = (String)listIterator.next();
			System.out.println(string);
		}
		
		System.out.println();
//		 print the data in forward direction
		while(listIterator.hasPrevious()) {
			String string = (String)listIterator.previous();
			System.out.println(string);
		}
		
		
		
		
		System.out.println();
		System.out.println("For generic classes");
		
		
//		ListIterator cursor: with generic version : print the data in forward & backward direction
		ListIterator<String> listIterator2 = arrayList.listIterator();
		while(listIterator2.hasNext()) {
			String string = listIterator2.next();
			System.out.println(string);
		}
		System.out.println();
		while(listIterator2.hasPrevious()) {
			String string = listIterator2.previous();
			System.out.println(string);
		}

	}

}
