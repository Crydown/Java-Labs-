/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Lab6_Ex1;

import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
/**
* Summary description for Program
*/
class Primes2 extends Thread
{
	
     // isPrime()  , split(), 
    //


	static boolean isPrime(long n)
	{
		if (n <= 1) return false;
		double limit = Math.sqrt(n);
		for (long i = 2; i <= limit; i++)
		{
			if (n % i == 0) return false;
		}
                
		return true;
	}
        
      private static void countPrimes(int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++)
            if (isPrime(i))
                System.out.println(" " + i);
        
    }
        
        private static class CountPrimesThread extends Thread {
        int count = 0;
        int min, max;
        public CountPrimesThread(int min, int max) {
            this.min = min;
            this.max = max;
        }
        @Override
        public void run() {
            countPrimes(min,max);
            
           
        }
    }
        
        public static void countPrimesWithThreads(int n, int numberOfThreads) {
            
            int increment = n/numberOfThreads;
        System.out.println("\nCounting primes between " + (1) + " and " 
                + (n) + " using " + numberOfThreads + " threads...\n");
      //  long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();
        CountPrimesThread[] worker = new CountPrimesThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++)
            worker[i] = new CountPrimesThread(i*increment+1, (i+1)*increment );
   //     total = 0;
        for (int i = 0; i < numberOfThreads; i++)
            worker[i].start();
        for (int i = 0; i < numberOfThreads; i++) {
            while (worker[i].isAlive()) {
                try {
                    worker[i].join();
                }
                catch (InterruptedException e) {
                }
            }
        }
       // long elapsedTime = System.currentTimeMillis() - startTime;
        long elapsedTime = System.nanoTime() - startTime;
      //  System.out.println("\nThe number of primes is " + total + ".");
        System.out.println("\nTotal elapsed time:  " + (elapsedTime/1000.0) + " nanoseconds.\n");
        
    }
            
        


	
        
}
