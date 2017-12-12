/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.DistributorAdminRole;
import Business.role.ProviderRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Romell
 */
public class DistributorAdminOrganization extends EmployeeOrganization{
    public DistributorAdminOrganization(){
        super(Organization.Type.DistributorAdmin.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DistributorAdminRole());
        return roles;
    }
    
}
