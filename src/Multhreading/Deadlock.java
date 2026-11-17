package Multhreading;

public class Deadlock {
	 public static void main(String[] args) {

	        final String resource1 = "A";
	        final String resource2 = "B";

	        Thread t1 = new Thread() {
	            public void run() {
	                synchronized (resource1) {
	                    System.out.println("Thread 1 locked Resource A");

	                    synchronized (resource2) {
	                        System.out.println("Thread 1 locked Resource B");
	                    }
	                }
	            }
	        };

	        Thread t2 = new Thread() {
	            public void run() {
	                synchronized (resource2) {
	                    System.out.println("Thread 2 locked Resource B");

	                    synchronized (resource1) {
	                        System.out.println("Thread 2 locked Resource A");
	                    }
	                }
	            }
	        };

	        t1.start();
	        t2.start();
	    }

}
