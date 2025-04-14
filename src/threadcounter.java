import java.util.*;

class counter{
    int count=0;
    public synchronized void increment(){
    //public void increment(){
        count++;
    }
        }
public class threadcounter {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            counter c = new counter();
            Runnable a = () -> {
                for (int j = 0; j < 1000; j++) c.increment();
            };
            Runnable b = () -> {
                for (int j = 0; j < 1000; j++) c.increment();
            };
            Thread t1 = new Thread(a);
            Thread t2 = new Thread(b);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println(c.count);
        }
    }
}
