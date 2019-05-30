/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Implement class for arraylist
package Lab3Ex1;

import static Lab3Ex1.Defensive.checkDouble;
import static Lab3Ex1.Defensive.checkInt;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Ciprian
 */
public class EmpList {
    
    String listname;
    
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList();
    
    
    EmpList(String listname) {
    
        this.listname = listname;
    }

    public ArrayList<Employee> getEmppoyees() {
        return employees;
    }

    public void setEmppoyees(ArrayList<Employee> emppoyees) {
        this.employees = emppoyees;
    }
    private void add () {
        Employee temp = new Employee();
        this.employees.add(temp);
    }
    void delete(String name) {
        
        
        boolean Found = false;
        
        for(Employee employee: employees)
		{
                    
                    if(employee.getName().equals(name)){
                        
                        employees.remove(employee);
                        System.out.println("Employee found and deleted");    
                        Found = true;
                        break;
                    }

                }
               if(!Found)
                    System.out.println("Employee not found in order to be deleted");
        
    
    }
    
    //find() returning Employee
    void find() {
        
        boolean Found = false;
        String name;
        System.out.print("Search for employee with name:");
	
        name = keyboard.next();
        
        for(Employee employee: employees)
		{
                    if(employee.getName().equals(name)){
                        
                        System.out.println("Employee found!");
                        System.out.println("Number is: " + employee.getNumber());
                        System.out.println("Salary is: " + employee.getSalary());
                        System.out.println("Phone No is: " + employee.getPhoneNo());
                        System.out.println("Address is: " + employee.getAdress());
                        Found = true;
                    }
                    if(!Found)
                        System.out.println("Employee not found");
                    
		}
                
        
    }
    
    
     void create_new()
    {
        int empNum;
       
        int number;
        String name;
        double salary;
        String employmentDate;
        String adress;
        String phoneNo;
        
        
    	// Propts user for how many employees 
		System.out.print("How many Employee's would you like to create?:");
	
                empNum = (int) checkInt();
    	// Creating each object to be added in the objects array 
		for(int i = 0; i < empNum; i++)
		{               
		System.out.printf("What is Employee Name?: ");
		name = keyboard.next();
		System.out.printf("\nWhat is %s's Salary?: ", name);
		salary = checkDouble();
                
                
		System.out.printf("\nWhat is %s's employmentDate?: ", name);
		adress = keyboard.next();
                System.out.printf("\nWhat is %s's Address?: ", name);
		phoneNo = keyboard.next();
                System.out.printf("\nWhat is %s's phoneNo: ", name);
		employmentDate = keyboard.next();
                System.out.println();
		employees.add(new Employee(name,salary,employmentDate,adress,phoneNo));
					
				}
	
    
}
    
    void get_info(){
       
       if(employees.size()!=0){
       
       System.out.println("All the employee information is:");
		for(Employee employee: employees)
		{       
                    
                  
		System.out.println("#"+ employee.getNumber() + ": " + employee.getName());
			
		
            }
       }else{
           System.out.println("Database is empty!");
           
           
       }
       
       
   }
    
    void modify_info(){
        
        String name;
        double salary;
        System.out.print("Search for employee with name:");
	
        name = keyboard.next();
        
        for(Employee employee: employees)
		{
                    if(employee.getName().equals(name)){
                        
                        System.out.println("Employee found!");
                         System.out.println("Introduce new salary!");
                         salary = keyboard.nextDouble();
                         employee.setSalary(salary);
                         System.out.println("Introduce new phoneNo!");
                         name = keyboard.next();
                         employee.setPhoneNo(name);
                         System.out.println("Introduce new address!");
                         name = keyboard.next();
                         employee.setAdress(name);
                       
                        System.out.println("UPDATED!");
                        
                        System.out.println("New salary is: " + employee.getSalary());
                        System.out.println("New phone No is: " + employee.getPhoneNo());
                        System.out.println("New address is: " + employee.getAdress());
                        break;
                    }
                    else
                        System.out.println("Employee not found");
		}
        
    }
    
}
