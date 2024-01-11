package MT1;

class RunThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunStart {
    public static void main(String[] args) {
        RunThread t1 = new RunThread();
        RunThread t2 = new RunThread();
        t1.run();
        t2.run();
        //java run treats threads as normal object so no context switch
    }
}
