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







public class BinaryTree {
    
    
    Node root;
     
     
//     private BinaryTree createBinaryTree() {
//    BinaryTree bt = new BinaryTree();
// 
//    bt.add(6);
//    bt.add(4);
//    bt.add(8);
//    bt.add(3);
//    bt.add(5);
//    bt.add(7);
//    bt.add(9);
// 
//    return bt;
//}
     // 2 for decimal, 1 for hex,
      public void traverseInOrder(Node node, int choice) {
          
          
          
          
    if (node != null) {
        traverseInOrder(node.getLeft(),choice);      
        
        if(choice == 1){
        System.out.print(" " + String.format("0x%08X ",node.getValue()));
        }
        else{
        System.out.print(node.getValue()+ " ");
        }
        traverseInOrder(node.getRight(),choice);
    }
      }
    
    public void traversePreOrder(Node node) {
    if (node != null) {
        System.out.print(" " + node.getValue());
        traversePreOrder(node.getLeft());
        traversePreOrder(node.getRight());
    }
}
    
    
    // ...
    
    private Node addRecursive(Node current, int value) {
    if (current == null) {
        return new Node(value);
    }
 
    if (value < current.getValue()) {
        current.setLeft(addRecursive(current.getLeft(), value));
    } else if (value > current.getValue()) {
        //current.right = addRecursive(current.right, value);
        current.setRight(addRecursive(current.getRight(), value));
        
        
    } else {
        // value already exists
        return current;
    }
 
    return current;
    
}
    
    public void add(int value) {
    root = addRecursive(root, value);
    
    
    
    
}   
}
    
