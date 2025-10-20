/*Write a Java program that categorizes a person into an age group based on their age using a ternary operator:
"Child" if age is less than 12

"Teenager" if age is between 12 and 19
"Adult" if age is between 20 and 64
"Senior" if age is 65 or older*/

package com.codegnan.operatorexamples;
import java.util.Scanner;
public class AgeGroupCategorizer {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age:(teenager/adult/senior)");
		int age=scanner.nextInt();
		String category=(age<=12)?"child":(age<=19)?"Teenager":(age<=64)?"adult":"senior";
		System.out.println("age:"+category);

	}

}
