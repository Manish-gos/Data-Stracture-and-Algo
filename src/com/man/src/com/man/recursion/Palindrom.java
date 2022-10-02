/*isPalindrome
Write a recursive function called isPalindrome which returns true if the string passed to it is a palindrome (reads the same forward and backward). Otherwise it returns false.

isPalindrome('awesome') # false
isPalindrome('foobar') # false
isPalindrome('tacocat') # true
isPalindrome('amanaplanacanalpanama') # true
isPalindrome('amanaplanacanalpandemonium') # false
*/


package com.man.recursion;

import java.util.Scanner;

public class Palindrom {

	public static boolean palindrom(String str) {
		
		if(str.length()==0||str.length()==1)
			return true;
		
		if(str.charAt(0)==str.charAt(str.length()-1))
			return palindrom(str.substring(1,str.length()-1));
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		System.out.println("reverse String: "+palindrom(sc.nextLine()));
	}

}
