package MT8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CustomTask implements Runnable {
    private String name;

    public CustomTask(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread : "+name+"starts");
        for(int i = 1;i<=5;i++) {
            System.out.println(i);
        }
        System.out.println("Real name of the thread :"+Thread.currentThread().getName());
        System.out.println("Thread : "+name+" ends");
    }
}


public class ExecutorFramework {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            System.out.println("Start executing " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
                System.out.println("Executing " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished execution " + Thread.currentThread().getName());
            System.out.println();
        });
        executor.submit(new CustomTask("Custom Task"));
        executor.shutdown();
    }
}
