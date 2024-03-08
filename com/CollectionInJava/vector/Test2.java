package com.CollectionInJava.vector;

import java.util.Iterator;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		for(int i = 1; i <= 30; i++) {
			vector.add(i);
		}
		
		Iterator<Integer> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Integer integer = iterator.next();
			if (integer % 2 == 0) {
				System.out.println(integer);
			} else {
				iterator.remove();
			}
		}

		
	}

}
