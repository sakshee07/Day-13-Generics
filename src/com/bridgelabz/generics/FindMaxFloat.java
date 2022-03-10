package com.bridgelabz.generics;

import java.util.Scanner;

public class FindMaxFloat {

		public Float MaximumFloat(Float firstnumber,Float secondnumber,Float thirdnumber) {
			Float maxFloat = firstnumber;
			if (secondnumber.compareTo(maxFloat) > 0)
				maxFloat = secondnumber;
			if (thirdnumber.compareTo(maxFloat) > 0)
				maxFloat = thirdnumber;
			System.out.println("The Maximum Number is :"+maxFloat);
			return maxFloat;
		}
		public static void main(String[] args) {
			System.out.println("Welcome to program");
			FindMaxFloat obj = new FindMaxFloat();
			
			
	         Scanner sc =new Scanner(System.in);
	         System.out.println("Enter first number");
	        Float x = sc.nextFloat();
	         System.out.println("Enter second number");
	        Float y = sc.nextFloat();
	         System.out.println("Enter third number");
	        Float z = sc.nextFloat();
	         
	 		 obj.MaximumFloat(x,y,z);

		}
	}
