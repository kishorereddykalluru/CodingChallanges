package practice;

public class Woombat implements Runnable{

    private int i;

    public synchronized void run() {
        if(i%5 != 0) {
            i++;
        }
        for(int x = 0; x < 5; x++,i++) {
            if(x > 1) Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+ " : " + i + " ");
    }

    public static void main(String args[]) {
        Woombat n = new Woombat();
        for(int x = 100; x > 0; --x){new Thread(n).start();}
    }
}
