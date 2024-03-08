package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(10);
		aList.add(20.50);
		aList.add("Abrar");
		aList.add('a');
		aList.add(10);
		aList.add(null);
		aList.add(true);
		aList.add(null);
		System.out.println(aList);
		System.out.println(aList.toString());
	}

}
