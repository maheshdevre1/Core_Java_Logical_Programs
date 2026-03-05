package Multhreading;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class ThreadExample {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start(); // Start the thread
	}

}
