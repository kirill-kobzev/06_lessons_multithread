package multithread;

import java.sql.SQLOutput;

public class ThreadTimer extends Thread {
    Object monitor;

    public ThreadTimer(Object monitor) {
        this.monitor = monitor;
    }

    public void run() {
        int time = 1;
        synchronized (monitor){
            while (time<6) {
                try {
                    Thread.sleep(1000);
                    System.out.println(time);
                    time++;
                    monitor.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
