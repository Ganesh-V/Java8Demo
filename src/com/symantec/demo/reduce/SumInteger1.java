package com.symantec.demo.reduce;

import java.util.Arrays;

public class SumInteger1 {
	public static void main(String[] args) {
		int input[] =  new int[] { 20,40,40,50,60,90};
		
		
		int result = Arrays.stream(input).reduce(0, (a, b) -> a + b);
		
		System.out.println(result);
	}
}
