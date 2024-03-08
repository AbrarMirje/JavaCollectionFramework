package com.CollectionInJava.ArrList;

import java.util.ArrayList;


public class Arraylist7 {

	public static void main(String[] args) {
		Employee employee1 = new Employee(111, "Abrar");
		Employee employee2 = new Employee(222, "David");
		Employee employee3 = new Employee(333, "Mariyam");
		Employee employee4 = new Employee(444, "Steve");

		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(employee1);
		arrayList.add(employee2);
		
		ArrayList<Employee> arrayList2 = new ArrayList<Employee>();
		arrayList2.addAll(arrayList);
		arrayList2.add(employee3);
		arrayList2.add(employee4);
		
		/*
		 * System.out.println(arrayList2.contains(employee1));
		 * System.out.println(arrayList2.containsAll(arrayList));
		 * 
		 * arrayList2.remove(employee1);
		 * System.out.println(arrayList2.contains(employee1));
		 * System.out.println(arrayList2.containsAll(arrayList));
		 */
		
//		removeAll() removes all the data of arrayList
		arrayList2.removeAll(arrayList);
		System.out.println(arrayList2.containsAll(arrayList));
		
//		retainsAll() removes all the data except arrayList2
		arrayList2.retainAll(arrayList2);
		System.out.println(arrayList2.containsAll(arrayList2));
		
		for(Employee employee : arrayList2) {
			System.out.println(employee.eid + " " + employee.ename);
		} 
	}

}
