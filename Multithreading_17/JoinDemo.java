package Multithreading_17;

class MyThread3 extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        t1.start();

        try {
            t1.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        MyThread3 t2 = new MyThread3();
        t2.start();
    }
}
