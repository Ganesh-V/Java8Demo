package com.symantec.demo.pattern;

import java.util.function.Supplier;

public class Logger {
	public static Level logLevel = Level.INFO;

	public static boolean isLoggable(Level level) {
		return logLevel.ordinal() <= level.ordinal();
	}

	public static void log(String s) {
		System.out.println(s);
	}
	

	public static void log(Level support, String s) {
		if (isLoggable(support)) {
			System.out.println(s);
		}
	}
	
	public static void log(Level support, Supplier<String> execute) {
		if (isLoggable(support)) {
			System.out.println(execute.get());
		}
	}
}

enum Level {
	DEBUG, INFO, ERROR, FATAL
}
