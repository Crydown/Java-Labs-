/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratory2Stack;

/**
 *
 * @author Ciprian
 */
// Implement Encapsulation
// implement getters and setters
// Implement separate libraries 

public class MyStack2 implements actions{
    
   public int size;
   public long stack[];
   public int top, top2;    
    
    MyStack2(int s){
        
        size = s;
        stack = new long[size];
        top = -1;
    
}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long[] getStack() {
        return stack;
    }

    public void setStack(long[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getTop2() {
        return top2;
    }

    public void setTop2(int top2) {
        this.top2 = top2;
    }
    
    
    
    
}
