package com.codegnan.javafundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter student name:");
		String sname = Scanner.next();
		System.out.println(" Enter rollno:");
		int rollno=Scanner.nextInt();
		System.out.println("age");
		int age=Scanner.nextInt();
		System.out.println("Enter grade");
		char grade=Scanner.next().charAt(0);
		System.out.println("name:"+sname);
		System.out.println("rollno:"+rollno);
		System.out.println("age:"+age);
		System.out.println("grade:"+grade);
		Scanner.close();

	}

}
