package MT9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println("Task executed by " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = e.submit(task);
        System.out.println("Main thread continues...");

        try {
            int result = future.get();
            System.out.println("Result from task: " + result);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        e.shutdown();

    }
}
