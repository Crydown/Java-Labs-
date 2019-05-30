/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3Ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */
public class Defensive {
    
    static int enteredNum;
    static double enteredNumDouble;
    
   
    
    
    public static double checkInt()
	{
            Scanner keyboard = new Scanner(System.in);
            
		do {
			while(!keyboard.hasNextInt())
			{
				System.out.println("That is not a number!");
				keyboard.next();
			}
			enteredNum = keyboard.nextInt();
		}while (enteredNum <= 0);

		return enteredNum;
	}
    
    
    public static double checkDouble()
	{
            Scanner keyboard = new Scanner(System.in);
		do {
			while(!keyboard.hasNextDouble())
			{
				System.out.println("That is not a number!");
				keyboard.next();
			}
			enteredNumDouble = keyboard.nextDouble();
		}while (enteredNumDouble <= 0);

		return enteredNumDouble;
	} 
    
    
    
    
}
