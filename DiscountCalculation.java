 /*Write a Java program to apply a discount based on the total shopping amount using a ternary operator:
20% discount if the total amount is greater than or equal to 1000
10% discount if the total amount is between 500 and 999
No discount if the amount is less than 500*/

package com.codegnan.operatorexamples;
import java.util.Scanner;
public class DiscountCalculation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter total shopping amount:");
		double totalAmount=scanner.nextDouble();
		double discount=(totalAmount>=1000)? totalAmount*0.20 :(totalAmount>=500)? totalAmount *0.10 :0;
		double finalAmount = totalAmount - discount;
		System.out.println("Total amount:"+totalAmount);
		System.out.println("Discount:"+discount); 
		System.out.println("final amount:"+finalAmount);
		scanner.close();
		

	}
}


