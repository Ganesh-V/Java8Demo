package com.symantec.demo.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduction {

	
	private static List<Integer> values = Arrays.asList(10, 20, 30, 40, 50, 20, 10);
	
	public static void main(String[] args) {
		int minValue = values.stream().collect(Collectors.minBy(Integer::compareTo)).get();
		int maxValue = values.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
		System.out.println(minValue);
		System.out.println(maxValue);
	}
}

