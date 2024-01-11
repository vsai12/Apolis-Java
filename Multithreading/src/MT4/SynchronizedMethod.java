package MT4;

public class SynchronizedMethod {
    private int count = 0;
    public synchronized void increment() {  //synchronized keyword ensures only one thread access at a time
        count++;
    }



    public static void main(String[] args) {
        SynchronizedMethod obj = new SynchronizedMethod();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                 obj.increment();
                 System.out.println(Thread.currentThread().getName() + " increements value to " + obj.count);
            }
        };
        Thread thread1 = new Thread(task,"First thread");
        Thread thread2 = new Thread(task, "Second thread");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + obj.count);
    }
}
