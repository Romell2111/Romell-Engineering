/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.EcoSystem;
import Business.enterprise.Enterprise;
import Business.organization.DoctorOrganization;
import Business.organization.Organization;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.doctorrole.DoctorWorkAreaJPanel;

/**
 *
 * @author Akshay Singh
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
    }
    
    
}

