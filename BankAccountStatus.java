/*Write a Java program to check the account balance and classify it:
"Good Standing" if the balance is greater than or equal to $1000
"Low Balance" if the balance is between $500 and $999
"Account Overdrawn" if the balance is less than $500*/
package com.codegnan.operatorexamples;
import java.util.Scanner;
public class BankAccountStatus {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter account balance:");
		double balance=scanner.nextDouble();
		String status=(balance>=1000)?"Good standing":(balance>=500)?"Low balance":"Account overdrawn";
		System.out.println("Account status:"+status);
		scanner.close();
		
	}

}
