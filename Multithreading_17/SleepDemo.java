package Multithreading_17;

class MyThread1 extends Thread {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Value " + i);
            try {
                Thread.sleep(3000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread1 t2 = new MyThread1();
        t2.start();
    }
}
