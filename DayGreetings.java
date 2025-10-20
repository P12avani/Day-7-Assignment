/*Write a Java program to print a greeting based on the hour of the day using ternary operators:

"Good Morning" if the hour is between 5 AM and 12 PM
"Good Afternoon" if the hour is between 12 PM and 5 PM
"Good Evening" if the hour is between 5 PM and 10 PM
"Good Night" if the hour is between 10 PM and 5 AM*/
package com.codegnan.operatorexamples;
import java.util.Scanner;
public class DayGreetings {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the hour of the day(0-23):");
		int hour=scanner.nextInt();
		String greetings=(hour>=5 && hour<=12)?"Good Morning":(hour>=12 && hour<17)?"Good Afternoon":(hour>=17 && hour<22)?"Good Evening":"Good night";
		System.out.println("Greetings:"+greetings);
		

	}

}
