package com.dinesh.corejava;

import java.util.Stack;

public class GreaterElement {
	public static void main(String[] args) {
		/*
		 * int arr1[] = { 4, 1, 2 }; int arr2[] = { 1, 3, 4, 2 }; int[] result = new
		 * int[arr1.length]; for (int i = 0; i < arr1.length; i++) { Stack<Integer>
		 * stack = new Stack<>(); boolean value = true; for (int j = 0; j < arr2.length;
		 * j++) { if (arr1[i] == arr2[j]) { stack.push(arr2[j]); } if (!stack.isEmpty()
		 * && stack.peek() < arr2[j]) { result[i] = arr2[j]; value = false; break; } }
		 * if (value) { result[i] = -1; } System.out.println(result[i]); }
		 */
		int arr1[] = { 1, 3,  2,4 };
		int[] result = new int[arr1.length];
		/*
		 * for (int i = 0; i < arr1.length; i++) { for (int j = i + 1; j < arr1.length;
		 * j++) { if (arr1[i] < arr1[j]) { result[i] = arr1[j]; break; } else {
		 * result[i] = -1; break; }
		 * 
		 * } if (i == arr1.length - 1) result[i] = -1; System.out.println(result[i]); }
		 */
		Stack<Integer> stack = new Stack<>();

		for (int i = arr1.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr1[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				result[i] = -1;
			} else {
				result[i] = stack.peek();
			}

			stack.push(arr1[i]);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
