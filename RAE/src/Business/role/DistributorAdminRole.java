/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.enterprise.Enterprise;
import Business.organization.Organization;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.DistributorAdminWorkAreaJPanel;

/**
 *
 * @author Akshay Singh
 */
public class DistributorAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }
    
}
