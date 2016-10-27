package com.symantec.demo.function;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Premitive {
	public static void main(String[] args) {
		IntPredicate evenNumber = (int i) -> i % 2 == 0;
		
		Predicate<Integer> oddNumber = (Integer i) -> i % 2 == 1;
				
	}
}
