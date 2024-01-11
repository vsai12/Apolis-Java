package MT1;

public class AnonymousClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "My thread");

        thread.start();
    }
}
