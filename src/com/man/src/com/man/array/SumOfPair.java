/*
 
Pairs / Two Sum - LeetCode 1
Write a program to find all pairs of integers whose sum is equal to a given number.

Examples

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1]


Input: nums = [3,2,4], target = 6
Output: [1,2]
Exercise.java

 */

package com.man.array;
import java.util.Arrays;
class SumOfPair {
  public static void main(String[] args) {
    SumOfPair mn = new SumOfPair();
    int[] intArray = {2,7,13,15};
    int[] result = mn.twoSum(intArray, 20);
    System.out.println(Arrays.toString(result));



  }

  // Two Sum
  public int[] twoSum(int[] nums, int target) {
    for (int i=0; i<nums.length; i++) {
      for (int j = i+1; j<nums.length; j++) {
        if (nums[i]+nums[j]==target) {
          return new int[] { i, j};
        }
      }
    }
    throw new IllegalArgumentException("No solution found");
  }

}
