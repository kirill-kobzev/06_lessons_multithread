package multithread;

import java.sql.SQLOutput;

public class ThreadTimer extends Thread {
    Object monitor;
    private Object monitor1;


    public ThreadTimer(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {
        int time = 1;
        synchronized (monitor){
            while (true) {
                try {
                    Thread.sleep(1000);
                    time++;
                    monitor.wait();
                    monitor.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
