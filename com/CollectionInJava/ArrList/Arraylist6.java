package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist6 {

	public static void main(String[] args) {
//		Approach-1: Constructor:
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(55);
		
		System.out.println(a2);
		
		
//		But what if we want to add multiple objects in a constructor, this actually not possible here, 
//		So we have one method called addAll() which provides this facility.
		
//		Approach-2: To add more than one collection into another collection
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		b1.add(100);
		b1.add(999);
		
		ArrayList<Integer> b2 = new ArrayList<Integer>();
		b2.add(200);
		
		ArrayList<Integer> b3 = new ArrayList<Integer>();
		b3.add(300);
		b3.addAll(b1);
		b3.addAll(b2);
		
		System.out.println(b3);
		
		
	}

}
