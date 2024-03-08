package com.CollectionInJava.ArrList;

import java.util.ArrayList;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Employee(501, "Steve"));
		arrayList.add(new Student(201, "Alexander"));
		
		
//		Not recommended
		Student student = (Student)arrayList.get(1);
		System.out.println(student.student_id + " " + student.studentName);
		
//		Recommended
		Object object = arrayList.get(1);
		
		if (object instanceof Student) {
			Student student2 = (Student)object;
			System.out.println(student2.student_id + " " + student2.studentName);
		}
		
		if (object instanceof Employee) {
			Employee employee = (Employee)object; 
			System.out.println(employee.eid + " " + employee.ename);
		}
		
	}
}
