package com.symantec.demo.parallel;

import java.util.function.Function;

public class ParallelProcessing3 {
	public static void main(String[] args) {
		long range = 1000000000L;
		System.out.println("Result : " + time(ParallelProcessing3::sequentialSum, range));
	}

	public static long sequentialSum(long n) {
		long result = 0;
		for (int i=0;i<=n; i++) {
			result += i;
		}			
		return result;
	}

	public static <T> T time(Function<T, T> execute, T val) {
		long startTime = System.currentTimeMillis();
		T result = execute.apply(val);
		System.out.println("Time consumption : " + (System.currentTimeMillis() - startTime));
		return result;
	}
}
