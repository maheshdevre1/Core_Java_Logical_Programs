package Multhreading;

public class WaitExample {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    try {
                        System.out.println("Thread waiting...");
                        lock.wait(); // Releases lock and waits
                        System.out.println("Thread resumed...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("Notifying...");
                    lock.notify(); // Resumes waiting thread
                }
            }
        });

        t1.start();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        t2.start();
    }

}
