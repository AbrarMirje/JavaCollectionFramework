package com.CollectionInJava.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abrar");
		arrayList.add("Java");
		arrayList.add("David");
		arrayList.add("Python");
		
//		Read the data by using iterator : Normal version
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			String string = (String)itr.next();
			System.out.println(string);
		}
		System.out.println();
		
//		Read the data by using iterator : Normal version
		Iterator<String> itr2 = arrayList.iterator();
		
		while(itr2.hasNext()) {
			String string = itr2.next();
			System.out.println(string);
		}

	}

}
