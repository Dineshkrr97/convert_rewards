package com.dinesh.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GroupAnagram {

	public static void main(String[] args) {
		String[] wordArr= {"ate","eat","tea","bat","nat","tan"};
		List<List<String>> result=groupAnagram(wordArr);
		System.out.println(result);

	}
	private static  List<List<String>> groupAnagram(String[] wordArr) {
		  List<List<String>> resultList=new ArrayList<List<String>>();
	        Map<String,List<String>> anagramMap=new HashMap<>();
	        for(String word :wordArr){
	            char[] charArr=word.toCharArray();
	            Arrays.sort(charArr);
	            String string1=Arrays.toString(charArr);
	            List<String> groupAnagram=anagramMap.getOrDefault(string1,new ArrayList<String>());
	            groupAnagram.add(word);
	            anagramMap.put(string1,groupAnagram);

	        }
	        for(Map.Entry<String,List<String>> entry : anagramMap.entrySet()){
                List<String> value=entry.getValue();
               resultList.add(value);
            }
	       return resultList;
	    }
	
}
