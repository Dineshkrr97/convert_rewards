package com.dinesh.leetcode;

import java.util.Arrays;

public class StackByUsingArray {
	
	public static int top=0;
	public static int size=10;
	
	public static int[] arr=new int[size+1];
	
	public static void main(String[] args) {
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		push(2);
		for(int i=1;i<arr.length;i++)
			System.out.println("Number"+"index is "+i+" "+arr[i]);
		
		System.out.println(pop());
		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
//		System.out.println(pop());
		
		for(int i=1;i<arr.length;i++)
		System.out.println("Number"+"index is "+i+" "+arr[i]);
	}
	
	
	public static void push(int x) {
		top++;
		if(top>size) {
			 arr= Arrays.copyOf(arr, size+10);
			 arr[top]=x;
			 
		}else {
			arr[top]=x;
		}
	}
	
	public static int pop() {
		
		if(isEmpty()) {
			System.out.println("Stackunderflow");
		}
		int temp=arr[top];
		arr[top]=0;
		top=top-1;
		return temp;
	}
	
	public static boolean isEmpty() {
		
		if(top==0) {
			return true;
		}
		return false;
	}

}

