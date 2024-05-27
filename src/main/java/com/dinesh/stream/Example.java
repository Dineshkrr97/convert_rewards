package com.dinesh.stream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	private static Function<Integer, Integer> triple = (value) -> value * 3;
	private Predicate<Integer> isGreaterThanFive() { return i -> (i > 5); }
	static List<Integer> integerStream = List.of(1,2,3,4,5,6,7,8,9);	
	public static void main(String[] args) {
		
		List<Integer> mappedStream =  integerStream.stream().map(triple).collect(Collectors.toList());
		mappedStream.forEach(i -> System.out.print(i+" "));
	}
	
	
	
}
