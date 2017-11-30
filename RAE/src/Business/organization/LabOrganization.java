/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.LabAssistantRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class LabOrganization extends EmployeeOrganization{

    public LabOrganization() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAssistantRole());
        return roles;
    }
     
   
    
    
}
