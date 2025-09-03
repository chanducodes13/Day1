/*"Child" if age is less than 12
"Teenager" if age is between 12 and 19
"Adult" if age is between 20 and 64
"Senior" if age is 65 or older*/

package com.codegnan.javafundamentals;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=Scanner.nextInt();
		String decision=(age<12)?"child":(age>=12 && age<=19)?"teenager":(age>=20 && age<=64)?"adult":"senior";
		System.out.println("your age belongs to:" + decision +" catageory");
		Scanner.close();
		

	}

}
