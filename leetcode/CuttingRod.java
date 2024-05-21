package com.dinesh.leetcode;

public class CuttingRod {

		// Function to find the maximum value obtainable by cutting the rod
	    static int cutRod(int length, int[] val) {
	        // Create a table to store the maximum value for each length
	        int[][] t = new int[val.length + 1][length + 1];

	        // Fill the table using dynamic programming
	        for (int i = 1; i <= val.length; ++i) {
	            for (int j = 1; j <= length; ++j) {
	                if (j >= i) {
	                    t[i][j] = Math.max(t[i-1][j], val[i-1] + t[i][j-i]);
	                } else {
	                    t[i][j] = t[i-1][j];
	                }
	            }
	        }

	        // Return the maximum value obtainable
	        return t[val.length][length];
	    }

	    public static void main(String[] args) {
	        int[] val = {1, 5, 8, 9, 10};
	        int length = 5;
	        System.out.println("Maximum value obtainable by cutting the rod: " + cutRod(length, val));
	    }

}
