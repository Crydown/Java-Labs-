/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Exxercise3;


import static java.lang.System.currentTimeMillis;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Ciprian
 */
public class Vectors {
    
    
    public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    
    
    System.out.println("Introduce n:");
    int n = keyboard.nextInt();
    System.out.println("Introduce a:");
    int a = keyboard.nextInt();
    System.out.println("Introduce b:");
    int b = keyboard.nextInt(); 
    int Low = a;
    int High = b;
    int result;
    Random rand = new Random();
    long t1 = 0, t2 = 0;
    int aux; // variable for interchange
    
    Vector<Integer> vec = new Vector<Integer>(n);
    
    for(int i = 0;i<n; i++){
        
        
        result = rand.nextInt(High-Low+1) + Low;
        vec.add(result);
        
    }
    
    System.out.println("Displaying vector");
    
    for(int i = 0;i < n;i++){
        
       System.out.print(vec.get(i) + " ");
      
    }
    
    t1 = (int) System.currentTimeMillis();
    //t1 = (int) System.nanoTime();
    
//    Collections.sort(vec);   // nu merge metoda Arrays.sort()
//    System.out.println("After Collection Method");

    System.out.println("Bubble sort!! ");
    for(int i = 0;i < n-1; i++){
        
        for(int j = 0; j< n-i-1;j++){
            
            if(vec.get(j)>vec.get(j+1)){
                
                aux = vec.get(j);
                vec.set(j,vec.get(j+1));
                vec.set(j+1,aux);
                
                
            }
            
            
        }
    }
    
    
    t2 = (int) System.currentTimeMillis();
    System.out.println("Sorted!");
    for(int i = 0;i < n;i++){
        
      //  t2 = (int) System.nanoTime();
       System.out.print(vec.get(i)+ " ");
        
        
    }
    
    long elapsedTime = (t2) - (t1);
    
    System.out.println("Total t1:" + t1 + "ms");
    System.out.println("Total t2" + t2 + "ms");
    System.out.println("Total time is:" + elapsedTime + "ms");
}
    
}

 