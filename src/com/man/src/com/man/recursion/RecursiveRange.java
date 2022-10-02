/*recursiveRange
Write a function called recursiveRange which accepts a number and adds up all the numbers from 0 to the number passed to the function.

Examples

recursiveRange(6)  // 6+5+4+3+2+1=21
recursiveRange(10) // 10+9+8+7+6+5+4+3+2+1=55 
*/
package com.man.recursion;

import java.util.Scanner;

public class RecursiveRange {

	static int recursiveRange(int n) {
		
		//base condition
		if(n==0) return n;
		
		//recursive call
		return recursiveRange(n-1)+n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("recursiveRange is: "+recursiveRange(sc.nextInt()));
	}

}
