package Multhreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String> {
    @Override
    public String call() {
        return "Callable thread executed!";
    }
}

public class CallableExample {
	public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());
        
        System.out.println(future.get()); // Retrieve result
        executor.shutdown();
    }

}
