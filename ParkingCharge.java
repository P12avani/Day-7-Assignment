package com.codegnan.operatorexamples;
import java.util.Scanner;
public class ParkingCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the hours to park an vehicle(24 hts-format) ");
         int hours=scanner.nextInt();
         int fee=(hours<=3)?(hours*2):(3*2+(hours-3)*1);
         System.out.println(fee);
         scanner.close();
	}

}
