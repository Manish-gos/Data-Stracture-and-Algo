/*Decimal to Binary
Write a function binary which accepts a number and returns the binary of the number

Examples

binary(1) // 1
binary(13)//1101
*/
package com.man.recursion;

import java.util.Scanner;

public class DecimalToBinary {

	static int binary(int n) {
		
		//Unwanted condition
		if(n<0) return -1;
		
		//base condition
		if(n==0) return 0;
		
		//recursive call
		return binary(n/2)*10+n%2;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("binary is: "+binary(sc.nextInt()));
	}

}
