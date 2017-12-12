/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.enterprise;

import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Romell
 */
public class DistributorEnterprise extends Enterprise
{
public DistributorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Distributor);
}

    @Override
     public ArrayList<Role> getSupportedRole() {
        return null;
    }

    
    
}
