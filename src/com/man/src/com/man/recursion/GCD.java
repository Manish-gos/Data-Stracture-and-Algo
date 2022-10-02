/*GCD
Examples

gcd(2,4) // 2
gcd(8,16) // 8

*/
package com.man.recursion;

import java.util.Scanner;

public class GCD {

	static int gcd(int a,int b) {
		
		//unwanted condition
		if(a<0||b<0)
			return -1;
		//base condition
		if(b==0) return a;
		
		//recursive call
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		System.out.println("gcd is: "+gcd(sc.nextInt(),sc.nextInt()));
	}

}
