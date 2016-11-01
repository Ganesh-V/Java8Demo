package com.symantec.demo.completableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFutures {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Future<Double> future = executor.submit(new Callable<Double>() {
			@Override
			public Double call() throws InterruptedException {
				// do some long computation
				TimeUnit.SECONDS.sleep(1);
				return 100.0d;
			}
			
		});
		
		// do some other big tasks
		
		
		Double result = 0d;
		try {
			result = future.get(3, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
		System.out.println(result);
		
		executor.shutdown();
		
	}

}
