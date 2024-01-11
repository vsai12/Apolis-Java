package MT7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        for(int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            es.submit(() -> {
               System.out.println("Task " + taskNumber + " executed by " + Thread.currentThread().getName());
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
            });
        }
        es.shutdown();
    }
}
