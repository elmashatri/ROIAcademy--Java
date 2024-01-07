package Praktika4A;
import java.util.*;

public class Praktika4A {
public static void main (String [] args) {
	
	// Krijo dy thread-e duke përdorur klasën ShfaqNumerat
    Thread thread1 = new Thread(new ShfaqNumerat("Thread 1"));
    Thread thread2 = new Thread(new ShfaqNumerat("Thread 2"));
    
    // Fillo ekzekutimin e thread-eve
    thread1.start();
    thread2.start();
	
}
}

class ShfaqNumerat implements Runnable {
    private String emriThreadit;

    public ShfaqNumerat(String emriThreadit) {
        this.emriThreadit = emriThreadit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(emriThreadit + " - Numri: " + i);
            try {
                Thread.sleep(1000); // Pritja për 1 sekondë
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}