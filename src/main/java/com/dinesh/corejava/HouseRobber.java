package com.dinesh.corejava;

public class HouseRobber { 
	public static void main(String args[]) {
		int[] nums= {2,7,9,3,5,4,8,1};
		int result=HouseRobber.rob(nums);
		System.out.println(result);
	}

	private static int rob(int nums[]) {
		 int n = nums.length;

	        if (n == 1) {
	            return nums[0];
	        }

	        if (n == 2) {
	            return Math.max(nums[0], nums[1]);
	        }

	        if (n <= 0) {
	            return 0;
	        }

	        if (n == 3) {
	            int val1 = nums[0] + nums[2];
	            int val2 = nums[1];
	            return Math.max(val1, val2);
	        }

	        int[] dp = new int[n];
	        dp[0] = nums[0];
	        dp[1] = Math.max(nums[0], nums[1]);

	        for (int i = 2; i < n; i++) {
	            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
	        }
	        return dp[n - 1];
	    }
	}
