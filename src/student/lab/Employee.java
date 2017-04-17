/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

/**
 * Represents a real employee in a business
 * 
 * @author Leslee Trinastic ltrinastic@my.wctc.edu
 * @version 1.8
 * 
 */
public class Employee {
    
    private String lastName;

    /** default*/
    public Employee() {
    }
   
    /**
     * A helpful constructor that allows you to initialize an employee with a last name
     * 
     * @param lastName - the employees last name  
     */
    public Employee(String lastName) {
        this.lastName = lastName;
    }
        
    /**
     * Gets the last name of the employee
     * @return - return the last name of the employee (or empty string, or null if allowed)
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Modifies or sets the last name of the employee
     * @param lastName - mandatory last name of employee
     * @throws IllegalArgumentException if last name is null or empty
     */
    public void setLastName(String lastName) throws IllegalArgumentException {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }
    
    private void method3(){
        
    }
    
}
