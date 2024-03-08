package com.CollectionInJava.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Practical2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abrar");
		arrayList.add("Java");
		arrayList.add("David");
		
		
		ListIterator<String> listIterator = arrayList.listIterator();
		listIterator.add("Python");
		while(listIterator.hasNext()) {
			String string = listIterator.next();
			if (string.equals("David")) {
				listIterator.remove();
			} 
			if (string.equals("Java")) {
				listIterator.set("JavaScript");
			}
			
		}
		
		System.out.println(arrayList);
	}

}
