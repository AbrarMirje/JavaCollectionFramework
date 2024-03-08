package com.CollectionInJava.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("Abrar");
		vector.add("Java");
		vector.add("David");
		vector.add("Python");
		
//		Read the data by using Enumeration : Normal version 
		Enumeration enumeration = vector.elements();

		while(enumeration.hasMoreElements()) {
//			Why we type-cast, because by using Enumeration we can read any type of data, but for now we want
//			String data so that's the reason we type-cast it into String
			String s = (String)enumeration.nextElement();
			System.out.println(s);
		}
		
		System.out.println();
//		Read the data by using Enumeration : Generic version
		Enumeration<String> enumeration2 = vector.elements();
		while (enumeration2.hasMoreElements()) {
			String string = enumeration2.nextElement();
			System.out.println(string);
		}
	}

}
