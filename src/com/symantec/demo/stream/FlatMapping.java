package com.symantec.demo.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapping {
	public static void main(String[] args) throws IOException {
		Stream<String> rows = Files.lines(Paths.get("demo.txt"));
		rows.flatMap(row -> Arrays.stream(row.split(" "))).forEach(System.out::println);		
	}
}
