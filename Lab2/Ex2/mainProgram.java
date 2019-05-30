/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratory2;

import static Laboratory2.Complex.*;
import static Laboratory2.complexBehavior.*;
//import static Laboratory2.Complex.add;
//import static Laboratory2.Complex.multiply;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
public class mainProgram {
    
    public static void main(String[] args) {
    
        
        double real, imag;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce first number Real part");
        real = keyboard.nextDouble();
        System.out.println("Introduce first number Imag part");
        imag = keyboard.nextDouble();
        Complex n1 = new Complex(real, imag);
        
        System.out.println("Introduce second number Real part");
        real = keyboard.nextDouble();
        System.out.println("Introduce second number Imag part");
        imag = keyboard.nextDouble();
        Complex n2 = new Complex(real, imag);
        
        
//        Complex n1 = new Complex(9.1, 1.9);
//        Complex n2 = new Complex(4.4, 2.3);
        
        add(n1, n2);
        multiply(n1,n2);
       
    }
    
}
