/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratory2Stack;
import Laboratory2Stack.MyStack3;
/**
 *
 * @author Ciprian
 */
public class mainProgram {
 
    public static void main(String args[]){
        
        MyStack3 stack = new MyStack3(20);
        
        stack.push(20);
        stack.push(11);
        stack.push(22);
        stack.push(27);
        
        stack.print();
        
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        
        stack.search2(12);
        System.out.println(stack.empty());
        System.out.println(stack.top);
        
    }
    
}
