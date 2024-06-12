package Multithreading_17;

class yieldDemo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " in control");
            // Yield control to other threads
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        yieldDemo t1 = new yieldDemo();
        yieldDemo t2 = new yieldDemo();
        yieldDemo t3 = new yieldDemo();

        t1.start();
        t2.start();
        t3.start();
    }
}
