package Multhreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}

public class RunnableExample {
	 public static void main(String[] args) {
	        Thread t1 = new Thread(new MyRunnable());
	        t1.start(); // Start the thread 
	    }

}


