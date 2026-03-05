package Multhreading;

class SleepThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread sleeping...");
        try {
            Thread.sleep(2000); // Pauses for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread woke up!");
    }
}

public class SleepExample {
	public static void main(String[] args) {
        SleepThread t = new SleepThread();
        t.start();
    }

}
