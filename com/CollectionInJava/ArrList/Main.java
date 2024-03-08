package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(new Employee(101, "Abrar"));
		a.add(new Student(1, "David"));
		a.add("Maria");
		a.add(10);
		a.add(null);
		
		
		System.out.println(a);
		
		for (Object object : a) {
			
			if (object instanceof Employee) {
				
				Employee employee = (Employee)object;
				System.out.println(employee.eid + " " + employee.ename);
			}
			if (object instanceof Student) {
				Student student = (Student)object;
				System.out.println(student.student_id + " " + student.studentName);
			}
			if (object instanceof String) {
				System.out.println(object);
			}
			if (object instanceof Integer) {
				System.out.println(object);
			}
			if (object == null) {
				System.out.println(object);
			}
		}
	}

}
