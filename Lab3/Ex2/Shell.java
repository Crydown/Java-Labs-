/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
public class Shell extends File{
    
    
    //StringBuilder dir = new StringBuilder(50);
    
    public Shell(String pathname) {
        super(pathname);
        
    }
      
    //tested and working
    public void create(){
        String file; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce path for new directory including folder to be created - Path\\dir_name ");
        file = keyboard.next();       
        java.io.File dir = new java.io.File(file);
        if(dir.mkdir()){
            
            System.out.println("Created!");
            
        }else{
            
            System.out.println("Failed to create!");
        }
      
    }
    
    //tested and working
     public static void listFiles(String directory)
    {
      
      File dir = new File(directory);
      File[] listOfFiles = dir.listFiles();
    
    
    for(int i = 0; i < listOfFiles.length;i++){
        if(listOfFiles[i].isFile()){
             System.out.println("File " + listOfFiles[i].getName());
            }
        else if (listOfFiles[i].isDirectory()) {
             System.out.println("Directory " + listOfFiles[i].getName());
        
     
        
            }
        }
    }

    //tested and working
    public static void listContent(String path){
      
        try{
        Scanner s = new Scanner(new File(path));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        for(int i =0;i<list.size();i++){
            
            System.out.println(list.get(i));
        }
        }catch(FileNotFoundException e){
            
            System.out.println("File does not exist!");
        }
        
    
        
    } 
       //not working 
    public static void changeDir(){
        /*
            Instances of File class are immutable, so we'll have to
        create every time an instance"
        */
        String dir;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce new dir");
        dir = s.next();
        
        System.setProperty("user.dir", dir);    // set default directory

    
       System.out.println("Working Directory = " +
              System.getProperty("user.dir"));

    }
    
    //not fully working
   public static void rename(){
             String path = "D:\\NetBeans\\Filews\\a";
        java.io.File dir = new java.io.File(path);
        int i = 0;
        java.io.File[] files = dir.listFiles();
        for(java.io.File file:files){
            i++;
            
            String newName = "my_file_v2_" + i + ".txt";
            String newPath = path + "\\" + newName;
            file.renameTo(new java.io.File(newPath));
        }
        
        
        
   } 
    //NullPointerException
    public static void delete(java.io.File file){
        
      //  File file = new File("D:\\NetBeans\\Filews\\b\\dsad");
        
        if(file.isDirectory())
        {
            
            if(file.list().length==0){
                
                file.delete();
                System.out.println("Directory deleted!");                      
            }
            
            else
            {
                
                String files[] = file.list();
                
                for(String temp: files){
                    
                    java.io.File fileDelete = new java.io.File(file, temp);
                    delete(fileDelete);
                    
                }
                 
            }
            if(file.list().length==0){
                
                file.delete();
                System.out.println("Directory deleted!");                      
            }
            
        }else{
            
        file.delete();
        System.out.println("File is deleted");
        }
    }
    
    //tested and working 
    public static void merge() throws FileNotFoundException, IOException{
         
         PrintWriter pw = new PrintWriter("D:\\NetBeans\\Filews\\m3.txt");
         
         BufferedReader br = new BufferedReader(new FileReader("D:\\NetBeans\\Filews\\m1.txt"));
         String line = br.readLine();
         
         while (line != null) 
        { 
            pw.println(line);
        //    pw.println("Me wrote this");   --- this is stored in .txt
            line = br.readLine(); 
        } 
         
         br = new BufferedReader(new FileReader("D:\\NetBeans\\Filews\\m2.txt"));
         line = br.readLine();
         
          while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
         
         
        pw.flush();
        
        br.close();
        pw.close();
        
        System.out.println("Merged m1.txt and m2.txt into m3.txt"); 
         
     }
       
     
     public static void info(){
         
      //   String filename = JOptionPane.showInputDialog("Enter filename: ");
	//	File f = new File(filename);
                System.out.println("Enter file path + name + extension");
                Scanner keyboard = new Scanner(System.in);
                String file;
                file = keyboard.next();
                java.io.File f = new java.io.File(file);    
                //java.io.File f = new java.io.File("D:\\NetBeans\\Filews\\a\\file3.txt");
		System.out.println("File exists: "+f.exists());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("Is a directory: "+f.isDirectory());
		System.out.println("length of the file: "+f.length()+" bytes");
		
		try
		{
			char ch;
			StringBuffer buff = new StringBuffer("");
			FileInputStream fis = new FileInputStream(file);
			while(fis.available()!=0)
			{
				ch = (char)fis.read();
				buff.append(ch);
			}
			System.out.println("\nContents of the file are: ");
			System.out.println(buff);
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file...");
		}
		catch(IOException i)
		{
			System.out.println("Cannot read file...");
		}
	}
    
         
    
}
