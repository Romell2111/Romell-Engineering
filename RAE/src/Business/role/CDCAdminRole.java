/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.enterprise.Enterprise;
import Business.Organization.CDCManagerOrganization;
import Business.Organization.ClinicOrganization;
import Business.organization.Organization;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CDC.CDCAdminWorkAreaJPanel;

/**
 *
 * @author Akshay Singh
 */
public class CDCAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CDCAdminWorkAreaJPanel(userProcessContainer, enterprise, business);
    }
}
