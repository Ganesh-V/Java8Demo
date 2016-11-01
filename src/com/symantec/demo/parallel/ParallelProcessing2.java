package com.symantec.demo.parallel;

import java.util.function.Function;
import java.util.stream.LongStream;

public class ParallelProcessing2 {
	public static void main(String[] args) {
		long range = 1000000000L;
		System.out.println("Result : " + time(ParallelProcessing2::sequentialSum, range));
	}

	public static long sequentialSum(long n) {
		return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
	}

	public static <T> T time(Function<T, T> execute, T val) {
		long startTime = System.currentTimeMillis();
		T result = execute.apply(val);
		System.out.println("Time consumption : " + (System.currentTimeMillis() - startTime));
		return result;
	}
}
