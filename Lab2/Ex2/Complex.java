/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratory2;

// Implement Encapsulation
// implement getters and setters
// Implement separate libraries
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
public class Complex {
    
    private double real;
    private double imag;

    public double getReal() {
        return real;
    }

    
    //this used to differentiate the fuction parameter from the object attribute
    //it is not forbidden to use it in getters but it's does not use its meaning
    //because in setters we can have 2 paraments wth the same name 
    
    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    //Construct
    public Complex(double real, double imag) {
        
        this.real = real;
        this.imag = imag;
        
        
    }
    
    

}  
    
    

