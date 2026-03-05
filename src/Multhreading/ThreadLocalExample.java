package Multhreading;

public class ThreadLocalExample {
	 // Creating a ThreadLocal variable with manual initial value setting
    private static ThreadLocal<Integer> threadLocalVar = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocalVar.set(threadLocalVar.get() + 10);
                System.out.println("Thread-1 Value: " + threadLocalVar.get());
                threadLocalVar.remove(); // Cleanup
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocalVar.set(threadLocalVar.get() + 20);
                System.out.println("Thread-2 Value: " + threadLocalVar.get());
                threadLocalVar.remove(); // Cleanup
            }
        });

        t1.start();
        t2.start();
    }
	

}
