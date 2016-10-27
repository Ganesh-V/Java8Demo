package com.symantec.demo.function;

import java.util.function.Function;

public class Composing1 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		Function<Integer, Integer> h = f.compose(g);
		System.out.println(h.apply(1));	
	}
}
