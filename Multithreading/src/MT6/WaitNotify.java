package MT6;

class MyThread extends Thread {

    int total = 0;
    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calc");
            for(int i = 1; i <= 50; i++) {
                total++;
            }
            System.out.println("Child Thread notfity()");
            this.notify();
        }
    }
}

public class WaitNotify {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();

        synchronized (t) {
            System.out.println("main thread calling wait method.");
            t.wait();
            System.out.println("main thread got notification call.");
            System.out.println("Result : "+ t.total);
        }
    }
}
