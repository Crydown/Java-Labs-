/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_Ex2;

import static Lab3_Ex2.Shell.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Ciprian
 */
public class test {
    
    public static void main(String args[]) throws IOException{
        
        Shell s1 = new Shell("D:\\NetBeans\\Filews");
        //s1.create();
        //listFiles("D:\\NetBeans\\Filews");
        //listContent("D:\\NetBeans\\Filews\\Miike.txt");
        //rename();
        //delete(new File("D:\\NetBeans\\Filews\\a"));
        //merge();
        info();
    }
    
}
