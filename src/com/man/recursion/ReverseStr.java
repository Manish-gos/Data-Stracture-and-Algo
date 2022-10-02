/*
 reverse
Write a recursive function called reverse which accepts a string and returns a new string in reverse.

Examples

reverse('java') # 'avaj'
reverse('appmillers') # 'srellimppa'
*/
package com.man.recursion;

import java.util.Scanner;

public class ReverseStr {

	static String ReverseStr(String str) {
		
		//base condition
		if(str.isEmpty())
		return str;
		
		//recursive call
		return ReverseStr(str.substring(1))+str.charAt(0);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		System.out.println("reverse String: "+ReverseStr(sc.nextLine()));
	}

}
