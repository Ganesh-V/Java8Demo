package com.symantec.demo.reduce;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumInteger4 {
	public static void main(String[] args) {
		int input[] = new int[] { 20, 40, 40, 50, 60, 90 };
		
		int result = Arrays.stream(input).sum();
		
		System.out.println(result);
	}
}
