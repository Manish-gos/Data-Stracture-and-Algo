/* Ratate an array by 90*
 *  1 |2 |3 |    7 |4 |1 |
    4 |5 |6 | -> 8 |5 |2 |
    7 |8 |9 |    9 |6 |3 |
    
 */

package com.man.array;

public class RotateArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		 int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) {
				System.out.print(arr[j][i] + " |");
			}
			System.out.println();
		}

	}

}
