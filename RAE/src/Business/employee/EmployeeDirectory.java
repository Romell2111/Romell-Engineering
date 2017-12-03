/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.employee;

import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class EmployeeDirectory {
     private ArrayList<Employee> employeelist;

    public EmployeeDirectory() {
        employeelist = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeelist;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeelist.add(employee);
        return employee;
    }
    
}
