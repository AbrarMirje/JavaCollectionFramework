package com.CollectionInJava.Stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		System.out.println(stack.empty());
		stack.add("Abrar");
		stack.add("David");
		stack.add("Steve");
		stack.add("Alex");
		
		System.out.println(stack);
//		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.search("Abrar"));
		
	}

}
