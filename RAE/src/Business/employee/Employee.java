/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.employee;

import Business.applicationUser.ApplicationUser;

/**
 *
 * @author Akshay Singh
 */
public class Employee extends ApplicationUser{
      
    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
