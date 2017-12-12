/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.Role;
import Business.useraccount.UserAccountDirectory;
import Business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public abstract  class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory uad;
    private int ambulanceNo;


    public int getAmbulanceNo() {
        return ambulanceNo;
    }

    public void setAmbulanceNo(int ambulanceNo) {
        this.ambulanceNo = ambulanceNo;
    }
    
    public Organization(String name) {
             workQueue = new WorkQueue();
         uad = new UserAccountDirectory();
        this.name = name;
   
    }
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Ambulance("Ambulance Organization"), Lab("Lab Organization"), Nurse("NurseOrganization"), Patient("PatientOrganization")
        ,Provider("Provider"),DistributorAdmin("DistributorAdmin");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

  
    public abstract ArrayList<Role> getSupportedRole();
    
 
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return uad;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.uad = userAccountDirectory;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
}
