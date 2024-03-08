package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist5 {

	public static void main(String[] args) {
		
//		To add one collections class into another collections class
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(arrayList);
		arrayList2.add(501);
		arrayList2.add(502);
		System.out.println(arrayList2);
	}

}
