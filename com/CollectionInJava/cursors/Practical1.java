package com.CollectionInJava.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Practical1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abrar");
		arrayList.add("Java");
		arrayList.add("David");
		arrayList.add("Python");
		
//		removing last element by using iterator
		Iterator<String> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			String string = iterator.next();
			if (string.equals("Python")) {
				iterator.remove();
			}
			
		}
		System.out.println(arrayList);
	}

}
