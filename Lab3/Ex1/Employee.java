/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Implem getters, setters, encapsulation, defensive programming

package Lab3Ex1;

import static java.lang.System.console;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ciprian
 */

// implement gettrs and setters 
// Encapsulation - behaviors/actions in another class


public class Employee {
   
    static int number = 1;
    String name;
    double salary;
    String employmentDate;
    String adress;
    String phoneNo;
    int enteredNum;
    double enteredNumDouble;
 //
   
   
    //Constructors
    public Employee(String name, double salary, String employmentDate, String adress, String phoneNo) {
        this.number = number++;
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
        this.adress = adress;
        this.phoneNo = phoneNo;
    }
    
    public Employee(){
        
        this.number = -1;
        this.name = "";
        this.salary = -1;
        this.employmentDate = "";
        this.adress = "";
        this.phoneNo = "";
        
    }

    //getters and setters
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
        
}
