/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Ciprian
 */


public class test {
    
    public static void main(String args[]){
        
        BinaryTree bt = new BinaryTree();
        bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
         
        
       bt.traverseInOrder(bt.root, 2);
       System.out.println("\n");
       bt.traversePreOrder(bt.root);
        
        
 
    
     
    }
    
}
