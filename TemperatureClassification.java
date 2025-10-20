/*Write a program using a ternary operator to classify the temperature:
If the temperature is above 30°C, print "Hot".
If the temperature is between 15°C and 30°C, print "Moderate".
Otherwise, print "Cold".*/
package com.codegnan.operatorexamples;
import java.util.Scanner;
public class TemperatureClassification {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature :");
		double temp=scanner.nextInt();
		String result=(temp>=30)?"Hot":(temp>=15)?"Moderate":"Cold";
		System.out.println("Result:"+result);
		scanner.close();

	}

}
