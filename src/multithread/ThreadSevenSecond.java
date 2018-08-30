package multithread;

public class ThreadSevenSecond  extends Thread{

    Object monitor;

    public ThreadSevenSecond(Object monitor) {
        this.monitor = monitor;
    }

    public void run(){

        synchronized (monitor){
            int countThreadSevenSecond = 1;
            while (true) {
                if(countThreadSevenSecond == 7){
                    System.out.println("Thread three: 7 second");
                    countThreadSevenSecond = 0;
                }
                countThreadSevenSecond++;
                monitor.notify();
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
