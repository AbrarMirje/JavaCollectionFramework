package com.CollectionInJava.ArrList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist9 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abrar");
		arrayList.add("Java");
		arrayList.add("David");
		arrayList.add("Python");
	
		System.out.println("Collections.swap()");
		System.out.println("Brfore swapping: " + arrayList);
		Collections.swap(arrayList, 1, 3);
		System.out.println("After swapping: " + arrayList);
		
		System.out.println();
		System.out.println("subList()");
		ArrayList<String> arrayList2 = new ArrayList<String>(arrayList.subList(1, 3));
		System.out.println(arrayList2);
	}

}
