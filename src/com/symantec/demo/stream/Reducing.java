package com.symantec.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(10,30,30,40,20);
		
		Optional<Integer> result = array.stream().reduce(Integer::max);
	}
}
