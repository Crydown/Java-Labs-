/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_Ex1;

import static Lab6_Ex1.Primes2.*;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */

//Used wrong class for Primes

public class test {
    
    public static void main(String[] arg)
	{
            
            int n;
            long elapsedTime2, t1, t2;
            
            Scanner keyboard = new Scanner(System.in);
            int processors = Runtime.getRuntime().availableProcessors();
        if (processors == 1)
            System.out.println("Your computer has only 1 available processor.\n");
        else
            System.out.println("Your computer has " + processors + " available processors.\n");
        int numberOfThreads = 0;
        
        
        System.out.println("Introduce last number");
        n = keyboard.nextInt();
        
        while (numberOfThreads < 1 || numberOfThreads > 20) {
            System.out.print("How many threads do you want to use  (from 1 to 5)...20 ?  ");
            numberOfThreads = keyboard.nextInt();
            if (numberOfThreads < 1 || numberOfThreads > 20)
                System.out.println("Please enter 1, 2, 3, 4, or 5...20 !");
        }
        countPrimesWithThreads(n, numberOfThreads);
    
        
        
            t1 = System.nanoTime();

            for(int i = 1;i <=n ; i++){
                
                if(Primes2.isPrime(i) == true){
                    
                    
                    System.out.println(" " + i );
                    
                }
                
            }
            
            t2 = System.nanoTime();
            elapsedTime2 = t2-t1;
            System.out.println("\nTotal elapsed time:  " + (elapsedTime2/1000.0) + " nanoseconds.\n");
            
            
            
        }
}
