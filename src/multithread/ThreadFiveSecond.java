package multithread;

public class ThreadFiveSecond extends Thread{

    Object monitor;

    public ThreadFiveSecond(Object monitor) {
        this.monitor = monitor;
    }

    public void run(){
        synchronized (monitor){

                while (true) {
                    System.out.println("Thread2");
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
