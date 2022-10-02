/*fib
Write a recursive function called fib which accepts a number and returns the nth number in the Fibonacci sequence. Recall that the Fibonacci sequence is the sequence of whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1, and where every number thereafter is equal to the sum of the previous two numbers.

Examples

fib(4) # 3
fib(10) # 55
fib(28) # 317811
fib(35) # 9227465

*/
package com.man.recursion;

import java.util.Scanner;

public class Fibonacci {

	static int  fibonacciMethod(int n) {
		
		//Unwanted condition
		if(n<0) return -1;
		
		//base condition
		if(n==0||n==1) return n;
		
		//recursive call
		return fibonacciMethod(n-2)+fibonacciMethod(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("Fibonacci is: "+fibonacciMethod(sc.nextInt()));
	}

}
