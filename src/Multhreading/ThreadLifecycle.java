package Multhreading;

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "3.  is RUNNING.");
        try {
            Thread.sleep(2000); // Simulating BLOCKED state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "5. is TERMINATED.");
    }
}

public class ThreadLifecycle {
	public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        
        System.out.println("1. Thread state after creation: " + t1.getState()); // NEW
        
        t1.start(); // Moves to RUNNABLE
        System.out.println("2. Thread state after start: " + t1.getState()); // RUNNABLE
        
        try {
            Thread.sleep(100); // Allowing time for thread to enter RUNNING state
            System.out.println(" 4. Thread state during execution: " + t1.getState()); // RUNNING or BLOCKED
            t1.join(); // Ensuring main waits for thread completion
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("6. Thread state after completion: " + t1.getState()); // TERMINATED
    }

}
