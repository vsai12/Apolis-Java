package MT1;

class MyRunnable implements Runnable {
    public void run() {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class RunnableInterface {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable(), "Custom thread1");
        t1.start();

        Thread t2 = new Thread(new MyRunnable(), "Custom thread2");
        t2.start();

        // we can't run same thread twice.
        // t1.start(); //java.lang.IllegalThreadStateException
    }
}
