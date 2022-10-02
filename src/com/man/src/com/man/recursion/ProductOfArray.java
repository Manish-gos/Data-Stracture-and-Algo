/*product of Array
Write a function called productOfArray which takes in an array of numbers and returns the product of them all.

Examples

int arr[] = { 1, 2, 3, 4, 5 }; 
productofArray(arr, arr.length); #120*/

package com.man.recursion;

public class ProductOfArray {

	public static int productofArray(int []arr, int length) {
		
		if(length==0)
			return arr[0];
		return productofArray(arr,length-1)*arr[length-1];
	}
	public static void main(String[] args) {
		int [] arr= {};
		
		System.out.println(productofArray(arr,arr.length));
	
	}

}
