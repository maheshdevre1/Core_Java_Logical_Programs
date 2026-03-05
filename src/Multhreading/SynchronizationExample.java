package Multhreading;

class SharedResource {
    synchronized void printNumbers(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + (n * i));
            try { Thread.sleep(500); } catch (InterruptedException e) {} // Simulate delay
        }
    }
}

class MyThread2 extends Thread {
    SharedResource resource;
    int num;

    public MyThread2(SharedResource resource, int num) {
        this.resource = resource;
        this.num = num;
    }

    @Override
    public void run() {
        resource.printNumbers(num);
    }
}

public class SynchronizationExample {
	public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        MyThread2 t1 = new MyThread2(obj, 2);
        MyThread2 t2 = new MyThread2(obj, 3);

        t1.start();
        t2.start();
    }

}
