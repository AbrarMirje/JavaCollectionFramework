package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist4 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		System.out.println(arrayList);
		
//		To find size of arrayListq																									
		System.out.println(arrayList.size());
		
//		To add data at specific location
		arrayList.add(1, 500);
		System.out.println(arrayList);
		
//		To remove data from arrayList using index number
		arrayList.remove(2); 
//		Also we can remove data from specific location by using data itself
//		arrayList.remove("10");
		System.out.println(arrayList);
		
		
//		To replace or set the data 
		arrayList.set(0, 999);
		System.out.println(arrayList);
		
//		To check arrayList is empty of not
		System.out.println(arrayList.isEmpty());
		
		
//		To clear all the data
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
		
		
		
		
	}

}
			