package com.symantec.demo.reduce;

import java.util.Arrays;

public class SumInteger {
	public static void main(String[] args) {
		int input[] =  new int[] { 20,40,40,50,60,90};
		
		int result = 0;
		for (int i=0; i< input.length; i++) {
			result += input[i];
		}
		
		System.out.println(result);
		
	}
}
