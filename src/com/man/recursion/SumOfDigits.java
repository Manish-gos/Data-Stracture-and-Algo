/*Sum of Digits
Write a function sumOfDigit which accepts a number and returns the sum of digits of the number
Examples

sumOfDigit(1) // 1
sumOfDigit(25) // 7

*/
package com.man.recursion;

import java.util.Scanner;

public class SumOfDigits {

	static int sumOfDigit(int n) {
		
		//base condition
		if(n==0) return 0;
		
		//recursive call
		return sumOfDigit(n/10)+n%10;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("sum is: "+sumOfDigit(sc.nextInt()));
	}

}
