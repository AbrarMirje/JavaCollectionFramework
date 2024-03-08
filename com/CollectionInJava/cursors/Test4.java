package com.CollectionInJava.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(111, "Java", "Abrar"));
		books.add(new Book(222, "Python", "David"));
		books.add(new Book(333, "C++", "Stephen"));

//		Iterating over the Book objects by using iterator 
		Iterator<Book> iterator = books.iterator();
		while(iterator.hasNext()) {
			Book book = iterator.next();
//			Removing if bookId = 111
			if (book.bookId == 111) {
				iterator.remove();
			}
		}
		
//		Printing the final result
		for(Book book : books) {
			System.out.println(book.bookId + " " + book.bookName + " " + book.authorName);
		}
	}

}
