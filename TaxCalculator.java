/*Determine Tax Bracket Based on Income
Problem:
 Write a Java program that computes the income tax based on the user's salary:
If income is less than 300,000, the tax rate is 5%.
If income is between 300,000 and 1,000,000, the tax rate is 10%.
If income is above 1,000,000, the tax rate is 15%.
Additionally, if the income is over 2,000,000, apply a special bonus of 1% on the total tax amount.*/
package com.codegnan.operatorexamples;
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter income tax:");
		double income=scanner.nextDouble();
		double tax=(income<=300000)? income*0.05:(income<=100000)? income*0.10:income*0.15;
		tax = (income > 2000000) ? tax + (tax * 0.01) : tax;
		System.out.println("Income:"+income);
		System.out.println("Tax:"+tax);
		scanner.close();

	}

}
