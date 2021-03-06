package com.symantec.demo.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapping2 {
	public static void main(String[] args) throws IOException {
		List<Integer> number1 = Arrays.asList(1, 2, 3);
		List<Integer> number2 = Arrays.asList(3, 4);

		List<int[]> result = number1.stream()
				.flatMap(i -> number2.stream().map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
		
		result.forEach(r-> System.out.println(Arrays.toString(r)));
	} 
}
