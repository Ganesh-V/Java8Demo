package com.symantec.demo.stream;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

import java.util.Arrays;
import java.util.stream.LongStream;

public class PrimeNumber {
	static Integer[] numberSet = new Integer[] { 10, 20, 77, 43, 51, 97, 35, 47 };  
	public static void main(String[] args) {
		
		Arrays.stream(numberSet).filter(Util::isPrime).forEach(System.out::println);
	}
	
}

class Util {
	public static boolean isPrime(int num) {
		return LongStream.rangeClosed(2, round(sqrt(num))).noneMatch(r -> num % r == 0);
	}
}
