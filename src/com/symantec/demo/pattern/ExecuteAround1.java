package com.symantec.demo.pattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

@FunctionalInterface
interface BufferReaderProcess {
	String process (BufferedReader br) throws IOException;
}

public class ExecuteAround1 {

	public static void main(String[] args) throws IOException {
		System.out.println(processFiles(r -> r.readLine()));
		System.out.println(processFiles(r -> r.readLine() + r.readLine()));
	}
	
	public static String processFiles(BufferReaderProcess reader) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
			return reader.process(br);
		}
	}
}