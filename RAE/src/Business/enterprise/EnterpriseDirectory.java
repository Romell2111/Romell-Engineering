/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class EnterpriseDirectory {
      private ArrayList<Enterprise> enterpriselist;

    public EnterpriseDirectory() {
        enterpriselist = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriselist;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriselist.add(enterprise);
        }
        return enterprise;
    }
    
}
