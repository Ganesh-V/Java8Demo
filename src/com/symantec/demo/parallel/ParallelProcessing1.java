package com.symantec.demo.parallel;

import java.util.function.Function;
import java.util.stream.Stream;

public class ParallelProcessing1 {
	public static void main(String[] args) {
		long range = 100000L;
		System.out.println("Result : " + time(ParallelProcessing1::sequentialSum, range));
	}

	public static long sequentialSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
	}

	public static <T> T time(Function<T, T> execute,T val) {
		long startTime = System.currentTimeMillis();
		T result = execute.apply(val);
		System.out.println("Time consumption : " + (System.currentTimeMillis() - startTime));
		return result;
	}
}
