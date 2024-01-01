
import java.util.*;


public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        System.out.println("End of thread 1");
    }

    public static class MyOtherThread extends Thread {
        public void run() {
            for (int j = 0; j <= 5; j++) {
                System.out.println("From thread 2: " + j);
            }
            System.out.println("End of thread 2");
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyOtherThread t2 = new MyOtherThread();
//        t1.setPriority(1);
        t1.start();
        t2.start();
    }
}
