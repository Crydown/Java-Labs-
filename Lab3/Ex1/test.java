/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3Ex1;

// import Employee;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Lab3Ex1.EmpList;



/**
 *
 * @author Ciprian
 */
public class test {
    
    static void view_menu()
	{

		System.out.println("\n\n-------------------------------------");
        System.out.println("|    Employee Interaction Menu      |");
        System.out.println("|-----------------------------------|");
        System.out.println("|                                   |");
        System.out.println("|   Select number and press enter   |");
        System.out.println("|       to perform operation        |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1.) Create New Employee           |");
        System.out.println("| 2.) Modify Employee Information   |");
        System.out.println("| 3.) Delete an Employee            |");
        System.out.println("| 4.) List Current Employees        |");
        System.out.println("| 5.) Search an Employee            |");
        System.out.println("| 6.) View Menu                     |");
        System.out.println("| 7.) Exit Program!                 |");
        System.out.println("|                                   |");
        System.out.println("-------------------------------------");
	}

	static Scanner console = new Scanner(System.in);
    
        public static void main(String args[]) throws IOException
	{
            
             
		boolean programOn = true;
		int userMenuOption;
		int empNum, index;
                String change, search;
                char check;
                String name;
                EmpList emp = new EmpList("List1");
                
                //mEmployee.create_new(emp);

		// Call view_menu() method to display menu on screen
		view_menu();
            
                while(programOn)
		{
			// Prompt and accept menu options and execute them in the switch statement
			System.out.print("\nSelect a menu option (5 for list options): ");
			System.out.println();
			userMenuOption = console.nextInt();
			
			switch(userMenuOption)
			{
				case 1:
				{
					// Call the creat_new()method with emp ArrayList as argument
					emp.create_new();
					break;
				}

				case 2:
				{
					
                                        emp.modify_info();

					break;
				}

				case 3:
				{
                                    //remove from Arrayylist
                                    //delete employee
                                        System.out.print("Introduce employee name for delete.");
                                        name = console.next();
					emp.delete(name);
					break;
                                    
					
				}
				case 4:
				{
					
					emp.get_info();
					break;
				}
				
                                case 5:
				{       
                                        // Check if employee name or number is in database	
                                        System.out.println("Introduce name? Y/N");
                                        check = (char)System.in.read();
                                        if((check == 'Y')||(check == 'y')){
					
                                           emp.find();
                                        }
                                        
                               
									                                       
					break;
				}
                                
                                case 6:
				{
					// Display menu on screen
					view_menu();
					break;
				}

				case 7:
				{
					// Set programOn Boolean to false to end loop and exit program
					System.out.println("Program Exited!");
					programOn = false;
					break;
				}
                        }
                    }
        }
}

