/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.Role;
import Business.patient.PatientDirectory;
import Business.role.PatientRole;
import Business.useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public  class PatientOrganization extends Organization {

    
      private PatientDirectory pD;
    private UserAccountDirectory uad;
  
    
       public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientRole());
        return roles;
    }
     
   
    public PatientOrganization(String name) {
        super(name);
        pD = new PatientDirectory();
        uad= new UserAccountDirectory();
       
    }

  
      public PatientDirectory getPatientDirectory() {
        return pD ;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return  uad;
    }

    @Override
    public String toString() {
        return getName();
    }
    
  
 
    
}
