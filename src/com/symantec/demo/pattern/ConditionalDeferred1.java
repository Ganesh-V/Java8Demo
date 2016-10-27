package com.symantec.demo.pattern;

import java.util.concurrent.TimeUnit;

public class ConditionalDeferred1 {
	
	public static void main(String[] args) {
		Logger.log(Level.ERROR, "Sorry for keeping you wait..." + keepWait() + "!!!");
	}

	public static String keepWait() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "NF team members";
	}
}
