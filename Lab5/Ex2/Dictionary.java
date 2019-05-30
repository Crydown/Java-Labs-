/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5_ex2_v2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ciprian
 */
public class Dictionary implements Serializable{
    
    private final String name;
    private String word =" ";
    private String definition = " ";
    HashMap dict = new HashMap<String,String>();
    
    
    Dictionary(String name){
        
        this.name = name;
        
        
    }
    
    Dictionary(){
        
      this.name = "default";        
    }
    
    public String getName(){
        
        return name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
    
    
    public void print(){
        
        Iterator it = dict.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " ----> " + pair.getValue());
        }
    
    }
    public static void print2(Dictionary dict1){
        
         HashMap dict2 = new HashMap<String,String>();
        
        dict2 = dict1.dict;
        Iterator it = dict2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " ----> " + pair.getValue());
        }
    
    }
    
    
    public void add(String word, String definition){
        
        
        
//        
//        System.out.println("Introduce word");
//        setWord(keyboard.next());
//         System.out.println("Introduce definition");
//        setDefinition(keyboard.next());
//        dict.put(getWord(), getDefinition());

          dict.put(word, definition);

        
    }
    
    public void delete(String word){

        dict.remove(word);
        
    }
    
    public void saveOnDisk(String filename){
        
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(dict); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException e) 
        { 
            System.out.println("IOException is caught"); 
            e.printStackTrace();
        } 
    
    
        
        
    }
    
     public static void saveOnDisk2(Dictionary dict, String filename){
        
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(dict); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        }catch(IOException e) 
        { 
            System.out.println("IOException is caught"); 
            e.printStackTrace();
        } 
    
    
        
        
    }
    
    
//    public void reload(String file){
//        
//        HashMap<String, String> map = null;
//    
//      try
//      {
//         FileInputStream fis = new FileInputStream(file);
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         map = (HashMap) ois.readObject();
//         ois.close();
//         fis.close();
//      }catch(IOException ioe)
//      {
//         ioe.printStackTrace();
//         return;
//      }catch(ClassNotFoundException c)
//      {
//         System.out.println("Class not found");
//         c.printStackTrace();
//         return;
//      }
//      System.out.println("Deserialized HashMap..");
//      // Display content using Iterator
//     
//      Set set = map.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key: "+ mentry.getKey() + " & Value: ");
//         System.out.println(mentry.getValue());
//      }
//       
//    }
    
     //implemented FileNotFoundException
    public Dictionary reload(String file){
        
        
        Dictionary reload = new Dictionary();
        //HashMap<String, String> map = null;
    
      try
      {
         FileInputStream fis = new FileInputStream(file);
         ObjectInputStream ois = new ObjectInputStream(fis);
        reload = (Dictionary) ois.readObject();
         ois.close();
         fis.close();
      }catch(FileNotFoundException e){
          
          System.out.println("File not found to be deserialized");
      }
      catch(IOException ioe)
      {
         ioe.printStackTrace();
         
      }catch(ClassNotFoundException c)
      {
         System.out.println("Class not found");
         c.printStackTrace();
         
      }
      finally{
      System.out.println("Deserialized HashMap..");
      // Display content using Iterator
      
     
      
      
      return reload;
      
      }
       
    }
    
    }
    

