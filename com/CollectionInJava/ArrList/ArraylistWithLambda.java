package com.CollectionInJava.ArrList;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistWithLambda {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		Iterator<Integer> itrIterator = arrayList.iterator();
		while (itrIterator.hasNext()) {
			Integer integer = (Integer) itrIterator.next();
			System.out.println(integer);
		}
		
		System.out.println("----------------------------------------");
		System.out.println("This is recommonded approach");
		Iterator<Integer> itr = arrayList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
