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
public class MyStack3 extends MyStack2{
    
    MyStack3(int n){
        
        super(n);
        
    }
    
      public boolean empty(){
        //test if empty
   
        return (getTop()) == -1;
        
        
    }
    
    long peek(){
        //retun top element 
        
        return getStack()[getTop()];
    }
    
    long pop(){
        //return top and delete
         
         return getStack()[top--];
        
    }
    
    void push(long element){
        //add element 
        getStack()[++top] = element;
        
        
        
    }
    
    boolean search(long elem){
        //search element
        
        
        while(!((getTop()) == -1)){
            
            if(elem == pop()){
                return true;
            }
            
        }
        return false;  
        
    }
    void print2(){
        //print whole stack
        for(int i=0; i< getStack().length; i++ ){
            
            System.out.print(" " + getStack()[i]);
        
        
        
    }
    }
    
    void search2(long elem){
        //print whole stack
        for(int i=0; i< getStack().length; i++ ){
            
            if(elem == getStack()[i]){
            System.out.println("Element found" + getStack()[i]);
            }
        }
        System.out.println("Element not found");
    }
   
    
     void print(){
       
        setTop2(top);
       
        while(!(top == -1)){
            
            System.out.println(pop());
            
        }
        setTop(top2);
    
        
    }
    
    
    
    
    
}
