/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.organization.Organization.Type;
import Business.role.AdminRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class AdminOrganization extends EmployeeOrganization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
   
}
