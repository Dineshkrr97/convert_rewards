package com.dinesh.leetcode;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str="dddccdbba";

		int ch=findNonRepeatingCharacter(str);
		System.out.println(ch);
	}

	private static int findNonRepeatingCharacter(String str) {
		char[] ch=str.toCharArray();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		 	 
		
		for(int i=0;i<ch.length;i++) {
			if(map.get(ch[i])==1) {
				return i;
			}
		}
		return -1;
	}

}
