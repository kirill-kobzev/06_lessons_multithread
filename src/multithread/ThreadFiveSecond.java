package multithread;

public class ThreadFiveSecond extends Thread{

    Object monitor;

    public ThreadFiveSecond(Object monitor) {
        this.monitor = monitor;
    }

    public void run(){
        synchronized (monitor){
        int countThreadFiveSecond = 1;
            while (true) {
                if(countThreadFiveSecond == 5){
                    System.out.println("Thread two: 5 second");
                    countThreadFiveSecond = 0;
                }
                countThreadFiveSecond++;
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
