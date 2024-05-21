package com.dinesh.leetcode;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] one= {1,2,3,4,5};
		int[] two= {1,2,3,4,5,};
		mergeArray(one,two);
	}
	
	public static int[] mergeArray(int[] one, int[] two) {
		int i=0,j=0,k=0;
		int length1=one.length;
		int length2=two.length;
		int[] result=new int[length1+length2];
		while(i<length1 && j<length2) {
			if(one[i]<two[j]) {
				result[k++]=one[i++];
			}else {
				result[k++]=two[j++];
			}
		}
		while(i<length1) {
			result[k++]=one[i++];
		}
		while(j<length1) {
			result[k++]=one[j++];
		}
		for(int num:result) {
			System.out.println(num);
		}
		return result;
	}

}
