/*Asssignment Question :student grade evaluation using ternary operator question:
 
Write a java program named StudentGrade that reads a student's Marks (integer input)and determines their grade using a nested ternay operator as per the following conditions:

marks Range               Grade
=============             ======
90 and above               A
80-89                      B
70-79                      C
60-69                      D
50-59                      E
below 50                   F*/
package com.codegnan.operatorexamples;
import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student numbers:");
        int marks=scanner.nextInt();
        char grade=(marks)>=90?'A':(marks)>=80?'B':(marks)>=70?'C':(marks)>=60?'D':(marks)>=50?'E' :'F';
        	System.out.println("student grade:"+grade);	
        	scanner.close();
	}

}
