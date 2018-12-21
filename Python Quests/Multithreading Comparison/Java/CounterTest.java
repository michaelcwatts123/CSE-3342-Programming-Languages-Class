//  Java program to measure single vs. multithread performance

import java.util.ArrayList;

public class CounterTest {
    public static int totalCount = 10000000;

    public static void countWithSingleThread (int ntimes) {
       MyCounter counter = new MyCounter();
        // start timing
       long startTime = System.nanoTime();
       for ( int i=0; i<ntimes; i++ ) {
            counter.increment();
       }

       long endTime = System.nanoTime();
       long duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
       System.out.println("Single thread:  counter = " + counter.value() );
       System.out.println("Single thread:  time (in ms) = " + duration );
    }

     public static void countWithMultiThreads (int ntimes, int nthreads) {
       // compute number of counts per thread
       int countsPerThread = ntimes / nthreads;

       MyCounter counter = new MyCounter();
        // start timing
       long startTime = System.nanoTime();
       ArrayList<Thread> threads = new ArrayList<Thread>();

       // create thread objects and add to list
       // note that we pass a Runnable object to the Thread constructor
       for ( int i=0; i<nthreads; i++ ) {
            threads.add( new Thread(new CounterIncRunnable(counter, countsPerThread)));
       }

       // start up the threads
       for ( Thread t:  threads  ) {
            t.start();
       }

       // wait for threads to complete
       for ( Thread t:  threads  ) {
           try {
               t.join();
           }
           catch (InterruptedException e) {}
       }

       long endTime = System.nanoTime();
       long duration = (endTime - startTime)/1000000;  //divide by 1000000 to get milliseconds.
       System.out.println("Multi threads: " + nthreads + " counter = " + counter.value() );
       System.out.println("Multi threads: " + nthreads + " time (in ms) = " + duration );
    }

    public static void main(String[] args) throws InterruptedException {
        int totalCount = 10000000;
        countWithSingleThread(totalCount);

        countWithMultiThreads(totalCount, 10);


    }
}


class CounterIncRunnable implements Runnable {
    private MyCounter counter;
    private int numberCounts;

    public CounterIncRunnable(MyCounter counter, int numberCounts) {
        this.counter = counter;
        this.numberCounts = numberCounts;
    }

    public  void run() {
        
        for ( int i=0; i<numberCounts; i++ ) {
            counter.increment();
        }
        
    }
}


class MyCounter {
    private  int c = 0;

    public  synchronized  void increment() {
        c++;
    }

    public    void decrement() {
        c--;
    }

    public  int value() {
        return c;
    }
}
