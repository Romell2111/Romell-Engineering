/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return orgList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            orgList.add(organization);
        }
         else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            orgList.add(organization);
         }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            orgList.add(organization);
        }
      else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
//            organization.setAmbulanceNo(no);
            orgList.add(organization);
        }
    
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization(Type.Patient.getValue());
            orgList.add(organization);
        }
         else if (type.getValue().equals(Type.Provider.getValue())){
            organization = new ProviderOrganization(Type.Provider.getValue());
            orgList.add(organization);
        }
    
      
        return organization;
    }
    
}
