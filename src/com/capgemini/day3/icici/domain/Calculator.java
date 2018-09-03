package com.capgemini.day3.icici.domain;

public class Calculator {
	public static int sum(int val1, int val2) {
		 int sum = val1 + val2;
		 System.out.println("The sum of the two digits is "+ sum);
		 return sum;
	}

	public static int difference(int val1, int val2) {
		 int difference = val1 - val2;
		 System.out.println("The difference of the two digits is "+ difference);
		 return difference;
	}

	public static int product(int val1, int val2) {
		 int prod = val1 * val2;
		 System.out.println("The product of the two digits is "+ prod);
		 return prod;
	}

	public static double division(int val1, int val2) {
		 double quotient = val1 / val2;
		 System.out.println("The quotient after dividing the two digits is "+ quotient);
		 return quotient;
	}



	

}
