/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.NurseRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class NurseOrganization extends EmployeeOrganization{
    
    public NurseOrganization(){
        super(Organization.Type.Nurse.getValue());
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NurseRole());
        return roles;
    }
     
   
    
}