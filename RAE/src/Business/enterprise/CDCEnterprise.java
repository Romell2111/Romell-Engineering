/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CDCManagerRole;
import Business.role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Akshay Singh
 */
public class CDCEnterprise extends Enterprise{
      public CDCEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.CDC);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        role.add(new CDCManagerRole());
        return roles;
    }
}
