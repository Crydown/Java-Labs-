/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratory2;
import static Laboratory2.Complex.*;
/**
 *
 * @author Ciprian
 */
public class complexBehavior {
    
    
    
    
    public static void print(Complex temp){
        
        System.out.printf("Result is: %.1f + %.1f\n", temp.getReal(), temp.getImag());  //Formatted output     
 
    }
    
    public static void multiply(Complex n1, Complex n2)
    {
    
    Complex temp = new Complex(0.00, 0.00);
    
    // like this or static at the top? 
    double var;
    
    var = n1.getReal() * n2.getReal();
    temp.setReal(var);
    
    var = n1.getImag() * n2.getImag();
    temp.setImag(var);
    
    print(temp);
}
     public static void add(Complex n1, Complex n2)
    {
    
    Complex temp = new Complex(0.00, 0.00);
    
    // like this or static at the top? 
    double var;
    
    var = n1.getReal() + n2.getReal();
    temp.setReal(var);
    
    var = n1.getImag() + n2.getImag();
    temp.setImag(var);
    
    print(temp);
}
    
}
