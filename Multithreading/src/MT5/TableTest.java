package MT5;

class Table {
    void printTable(int n) {
        synchronized(this) { //forces thread 1 to finish running before thread 2 can run
            for(int i = 1; i <= 5; i++) {
                System.out.println(n * 1);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread extends Thread {
    Table t;
    int n;
    MyThread(Table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.printTable(n);
    }
}

public class TableTest {
    public static void main(String[] args) {
        Table t = new Table();
        MyThread t1 = new MyThread(t, 5);
        MyThread t2 = new MyThread(t, 100);
        t1.start();
        t2.start();
    }
}
