package com.symantec.demo.pattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;

public class ExecuteAround {

	public static void main(String[] args) throws IOException {
		System.out.println(processFiles());
	}
	
	public static String processFiles() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
			return br.readLine();
		}
	}
}