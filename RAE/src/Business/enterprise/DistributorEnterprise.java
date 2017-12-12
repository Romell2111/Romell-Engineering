/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ProviderRole;
import Business.role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Akshay Singh
 */
public class DistributorEnterprise extends Enterprise{
    
      public DistributorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Distributor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        role.add(new ProviderRole());
        role.add(new SupplierRole());
        return role;
    }
}
