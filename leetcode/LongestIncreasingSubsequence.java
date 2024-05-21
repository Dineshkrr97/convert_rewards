package com.dinesh.leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int [] arr= {10,9,2,5,3,7,101,18};
		
		int result=lengthofLIS(arr);
		System.out.println(result);
	}

	private static int lengthofLIS(int[] arr) {
		int[] result=new int[arr.length];
		Arrays.fill(result, 1);
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					result[i]=Math.max(result[i], result[j]+1);
				}
			}
		}
		int max=result[0];
		for(int i=1;i<result.length;i++) {
			
			if(result[i]>max) {
				max=result[i];
			}
		}
		return max;
	}

}
