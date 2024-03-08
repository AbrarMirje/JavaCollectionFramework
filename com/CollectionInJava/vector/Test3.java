package com.CollectionInJava.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<Product> vector = new Vector<Product>();
		vector.add(new Product(111, "MacBook"));
		vector.add(new Product(222, "iPhone"));
		vector.add(new Product(333, "Lambo"));
		vector.add(new Product(444, "Villa"));
		
//		Reading data by using Enumeration cursor
		Enumeration<Product> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			Product product = enumeration.nextElement();
			System.out.println(product.productId + " " + product.productName);
		}
		
//		Reading data by using Iterator cursor
		System.out.println();
		Iterator<Product> iterator = vector.iterator();
		while(iterator.hasNext()) {
			Product product = iterator.next();
			System.out.println(product.productId + " " + product.productName);
		}
		
//		Reading data by using ListIterator cursor
		System.out.println();
		ListIterator<Product> listIterator = vector.listIterator();
		while(listIterator.hasNext()) {
			Product product = listIterator.next();
			System.out.println(product.productId + " " + product.productName);
		}
		
	}

}
