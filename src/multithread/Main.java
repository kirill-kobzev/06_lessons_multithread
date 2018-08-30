package multithread;

public class Main {
    public static void main(String[] args) {
        Object monitor = new Object();
        ThreadTimer threadTimer = new ThreadTimer(monitor);
        ThreadFiveSecond threadFiveSecond = new ThreadFiveSecond(monitor);
        ThreadSevenSecond threadSevenSecond = new ThreadSevenSecond(monitor);
        threadTimer.start();
        threadFiveSecond.start();
        threadSevenSecond.start();
    }
}
