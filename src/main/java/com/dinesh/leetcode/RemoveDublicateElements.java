package com.dinesh.leetcode;

import java.util.Arrays;

public class RemoveDublicateElements {

	public static void main(String[] args) {

		int [] nums= {0,0,1,1,1,2,2,3,3,4};
		int result=removeDublicate(nums);
		System.out.println(result);
	}

	private static int removeDublicate(int[] nums) {

		int value=1;

		for(int i=1;i<nums.length;i++) {

			if(nums[i]!=nums[i-1]) {

				nums[value]=nums[i];
				value++;
			}

		}

		return value;

	}

}
