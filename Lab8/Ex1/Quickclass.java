/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;


import static Lab8.SortThread.getRandomNumberInRange;
import static Lab8.SortThread.partition;
import static Lab8.SortThread.printArray;
import static Lab8.SortThread.sort;
import java.util.Random;

/**
 *
 * @author Ciprian
 */
public class Quickclass extends Thread{
    
   
   int integers[] = new int[100];
   //Random r = new Random(); 
   
   
    
    @Override
    public void run(){
            
            for (int i = 0; i < integers.length; i++) {
                    //integers[i] = r.nextInt();
                    integers[i] = getRandomNumberInRange(1,300);
                }
           
           printArray(integers);  
           sort(integers, 0, integers.length-1); 
           printArray(integers); 
            
            
        }
    
}
