class PrinterTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()
                    + ": Running task " + i);
        }
    }
}

public class exercise4 {

    public static void main(String[] args) throws InterruptedException {

        // Create one PrinterTask object
        PrinterTask pt = new PrinterTask();

        // Create two threads using the same task
        Thread worker1 = new Thread(pt, "Worker-1");
        Thread worker2 = new Thread(pt, "Worker-2");

        // Start both threads
        worker1.start();
        worker2.start();

        // Wait for both threads
        worker1.join();
        worker2.join();

        System.out.println("Main thread finished.");
    }
}