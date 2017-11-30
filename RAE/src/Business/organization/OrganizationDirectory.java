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
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
    
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization(Type.Patient.getValue());
            organizationList.add(organization);
        }
    
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
    
        return organization;
    }
    
}
