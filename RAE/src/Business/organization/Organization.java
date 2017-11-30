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
    private int organizationID;
    private UserAccountDirectory userAccountDirectory;
   // private static int counter;
    
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
         userAccountDirectory = new UserAccountDirectory();
     //   organizationID = counter;
       // ++counter;
    }
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Ambulance("Ambulance Organization"), Lab("Lab Organization"), Nurse("NurseOrganization"), Patient("PatientOrganization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

  
    public abstract ArrayList<Role> getSupportedRole();
    
  
//    public int getOrganizationID() {
//        return organizationID;
//    }
//
//  
//    
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
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
}
