/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.NurseRole;
import Business.role.ProviderRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Romell
 */
public class ProviderOrganization extends EmployeeOrganization {
    public ProviderOrganization(){
        super(Organization.Type.Provider.getValue());
    }

    ProviderOrganization(String value) {
         super(Organization.Type.Provider.getValue());
    }

   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
    }
}
