package com.CollectionInJava.ArrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist8 {

	public static void main(String[] args) {
//		Conversion of Arrays to Collections
		String[] names = {"Abrar", "David", "Harry"};
		
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(names));
		arrayList.add("Piter");
		arrayList.add("John");
		
		System.out.println(arrayList);
		
		
//		Conversion of Generic Collections to Arrays
		ArrayList<String> stringData = new ArrayList<String>();
		stringData.add("AAA");
		stringData.add("BBB");
		stringData.add("CCC");
		
		String[] userDataStrings = new String[stringData.size()];
		stringData.toArray(userDataStrings);
		
		for(String str : userDataStrings) {
			System.out.println(str);
		}
		
		
//		Conversion of Normal Collection to Arrays
		ArrayList arr = new ArrayList();
		arr.add("Abrar");
		arr.add(58);
		Object[] o = arr.toArray();
		
		for(Object oo : o) {
			System.out.println(oo);
		}
	}

}
