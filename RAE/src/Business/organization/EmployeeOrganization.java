/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.employee.EmployeeDirectory;
import Business.role.Role;
import Business.useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public  abstract class EmployeeOrganization extends Organization{
    
     private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    

    public EmployeeOrganization(String name) {
        super(name);
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
       
    }
   @Override
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }


    @Override
    public abstract ArrayList<Role> getSupportedRole();
    
   @Override
    public String toString() {
        return getName();
    }
 

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    

   
}
