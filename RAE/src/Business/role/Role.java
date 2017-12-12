/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.EcoSystem;
import Business.enterprise.Enterprise;
import Business.network.Network;
import Business.organization.Organization;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Akshay Singh
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Nurse("Nurse"),
        Ambulance("Ambulance"),
        LabAssistant("Lab Assistant"),
        DistributorAdmin("DistributorAdmin"),
        Provider("Provider");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
