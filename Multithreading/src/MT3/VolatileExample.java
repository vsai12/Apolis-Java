package MT3;

public class VolatileExample {
    private volatile boolean flag = false;

    public void toggle() {
        flag = !flag;
    }
    private static volatile int counter = 0;

    public static void main(String[] args) {
        /*
        VolatileExample e = new VolatileExample();
        Thread writer = new Thread(() -> {
            System.out.println("Writer thread sets flag to true");
            e.toggle();
        });

        Thread reader = new Thread(() -> {
            while(!e.flag) {
                //wait until flag is true
            }
            System.out.println("Reader thread is reading true");
        });

        writer.start();
        reader.start();*/

        Thread t1 = new Thread(() -> {
            int localCounter = counter;
            while (localCounter < 10) {
                if (localCounter != counter) {
                    System.out.println("Thread1 reads the shared variable changes.");
                    localCounter = counter;
                }
            }
        });

        t1.start();
        Thread t2 = new Thread(() -> {
            int localCounter = counter;
            while (localCounter < 10) {
                System.out.println("Thread2 update shared variable to " + (localCounter + 1));
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
