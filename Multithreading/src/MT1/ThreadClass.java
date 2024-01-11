package MT1;

class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
    }

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
public class ThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread("First thread");
        t.start();
        System.out.println(Thread.currentThread().getName());
    }
}
