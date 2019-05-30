/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_Ex1;

import java.util.HashSet;

/**
 *
 * @author Ciprian
 */
public class test {
    
    public static void main(String args[]){
        
    HashSet h1 = new HashSet();
    HashSet h2 = new HashSet();
   
    h1.add(20);
    h1.add(21);
    h1.add(22);
    h1.add(67);
    h1.add(87);
    h1.add(10000);
    
    h2.add(43);
    h2.add(11);
    h2.add(44);
    h2.add(67);
    h2.add(99);
    h2.add(10000);
    
    //union(h1,h2);
    intersection(h1,h2);
    
    
    
    
    }
    
    public static void union(HashSet h1, HashSet h2){
        
        HashSet h3 = new HashSet();
        h3 = h1;
        h3.addAll(h2);
        
        for (Object s : h3) {
    System.out.print(s + " ");
}
    }
    
    
    public static void intersection(HashSet h1, HashSet h2){
        
        HashSet h3 = new HashSet();
        h3 = h1;
        h3.retainAll(h2);
        for (Object s : h3) {
                System.out.print(s + " ");
            }
    }
    
    public static void symmetric(){
        
    }
    
    public static void carthesian(){
        
    }
    
}
