package com.CollectionInJava.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("C++");
		vector.add("Java");
		vector.add(1, "Python");
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("GoLang");
		arrayList.addAll(1, vector);
		
		System.out.println(arrayList);
	}

}
