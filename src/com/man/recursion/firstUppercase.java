/*
 First Uppercase
Given a string find its first uppercase letter

Example
Input : appmillerS
Output : S

*/
package com.man.recursion;

import java.util.Scanner;

public class firstUppercase {

	 public static String first(String str ) {
	     
		if(str.isEmpty())
			return null;
		
		else if(str.charAt(0)>=65 && str.charAt(0)<=90) 
			return str.charAt(0)+"";
		
		 return first(str.substring(1));
	    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("first char: "+first(sc.nextLine()));
	}

}
