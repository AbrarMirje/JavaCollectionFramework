package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
//		Arrays are type safe
		int[] arr = {10, 20, 30};
		for (int i : arr) {
			System.out.println(i);
		}

		
//		Collections are not type safe
		ArrayList arrayList = new ArrayList(); 
		arrayList.add(new Employee(101, "Abrar"));
		arrayList.add(new Student(1, "David"));
		
		for (Object object : arrayList) {
			
			if (object instanceof Employee) {
				Employee employee = (Employee)object;
				System.out.println(employee.eid + " " + employee.ename);
			}
			if (object instanceof Student) {
				Student student = (Student)object;
				System.out.println(student.student_id + " " + student.studentName);
			}
		}
		
		
		Object object = arrayList.get(1);
		if (object instanceof Employee) {
			Employee employee = (Employee)object;
			System.out.println(employee.eid + " " + employee.ename);
		}
		if (object instanceof Student) {
			Student student = (Student)object;
			System.out.println(student.student_id + " " + student.studentName);
		}
		
		
		
		
		
//		To provide type safety to the collections we go for the generic
		ArrayList<Employee> arrayList2 = new ArrayList<Employee>();
		arrayList2.add(new Employee(1, "Abrar"));
		arrayList2.add(new Employee(2, "David"));
		arrayList2.add(new Employee(3, "Steve"));
		
		System.out.println();
		System.out.println("Generic classes data printing:");
		for (Employee employee : arrayList2) {
			System.out.println(employee.eid + " " + employee.ename);
		}
		System.out.println();
		Employee employee = arrayList2.get(1);
		System.out.println(employee.eid + " " + employee.ename);
	}

}
