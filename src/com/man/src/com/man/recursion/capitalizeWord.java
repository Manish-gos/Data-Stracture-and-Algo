/*capitalizeWord
Implement a function that capitalizes each word in String.

Example

input: i love java
output : I Love Java*/

package com.man.recursion;

import java.util.Scanner;

public class capitalizeWord {

	public static String capitalizeWord(String str){
		 if(str.isEmpty()) {
		        return str;
		    }
		    char chr = str.charAt(str.length()-1);
		    if(str.length()==1) {
		        return Character.toString(Character.toUpperCase(chr));
		    }
		    if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
		        chr = Character.toUpperCase(chr);
		    }
		    return capitalizeWord(str.substring(0,str.length()-1))+ Character.toString(chr);
	  }  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("capitalize word : "+capitalizeWord(sc.nextLine()));
	}

}
