/*power
Write a function called power which accepts a base and an exponent. The function should return the power of the base to the exponent. This function should mimic the functionality of math.pow() - do not worry about negative bases and exponents.

Examples

power(2,0) // 1
power(2,2) // 4
power(2,4) // 16
*/
package com.man.recursion;

import java.util.Scanner;

public class Power {

	static int powerMethod(int base, int exponent) {
		
		//Unwanted condition
		if(exponent<0) return -1;
		
		//base condition
		if(exponent==0) return 1;
		
		//recursive call
		return powerMethod(base,exponent-1)*base;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("power is: "+powerMethod(sc.nextInt(),sc.nextInt()));
	}

}
