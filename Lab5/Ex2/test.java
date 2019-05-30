/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_ex2_v2;

import static Lab5_ex2_v2.Dictionary.print2;
import static Lab5_ex2_v2.Dictionary.saveOnDisk2;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
public class test {
    
    public static void main(String args[]){
        
        
        String key;
        Scanner keyboard = new Scanner(System.in);
        
        Dictionary d1 = new Dictionary("One");
        Dictionary reload = new Dictionary();
        
        d1.add("1", "one");
         d1.add("12", "doi");
          d1.add("13", "trei");
           d1.add("14", "patru");
           d1.delete("13");
           
           
           d1.print();
           System.out.println(d1.getName());
           saveOnDisk2(d1,"D:\\NetBeans\\dict1.ser");
           
           System.out.println("Introduce which dictionary");
           key = keyboard.next();
           
           // Choosing dictionaries
           if(key.equals("One")){
               d1= d1.reload("D:\\NetBeans\\dict1.ser");
               print2(d1);
           }else 
           {
               d1= d1.reload("D:\\NetBeans\\dict2.ser");
               print2(d1);
               
           }
           
           
         
         System.out.println("After!! ");
         d1.add("added", "implemented");
         print2(d1);
         
         
    }
        
        
    
    
}
