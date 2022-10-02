/*factorial
Write a function factorial which accepts a number and returns the factorial of that number. A factorial is the product of an integer and all the integers below it; e.g., factorial four ( 4! ) is equal to 24, because 4 * 3 * 2 * 1 equals 24. factorial zero (0!) is always 1.

Examples

factorial(1) // 1
factorial(2) // 2
factorial(4) // 24
factorial(7) // 5040
*/
package com.man.recursion;

import java.util.Scanner;

public class Factorial {

	static int factorialMethod(int n) {
		
		//Unwanted condition
		if(n<0) return -1;
		
		//base condition
		if(n==0) return 1;
		
		//recursive call
		return factorialMethod(n-1)*n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("factorial is: "+factorialMethod(sc.nextInt()));
	}

}
