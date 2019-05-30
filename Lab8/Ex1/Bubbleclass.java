/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;


import static Lab8.SortThread.bubbleSort;
import static Lab8.SortThread.getRandomNumberInRange;
import static Lab8.SortThread.printArray;
import java.util.Random;

/**
 *
 * @author Ciprian
 */
public class Bubbleclass extends Thread {
    
    //int arr[] = { 4, 7, 9, 3, 12};
   //Random r = new Random(); 
   int integers[] = new int[100];
    
    @Override
    public void run(){
            
        
            for (int i = 0; i < integers.length; i++) {
                   // integers[i] = r.nextInt();
                   integers[i] = getRandomNumberInRange(1,300);
                }
            printArray(integers);
            bubbleSort(integers);
            printArray(integers);
        }
}
    

