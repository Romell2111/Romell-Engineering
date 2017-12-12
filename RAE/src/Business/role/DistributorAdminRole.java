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
import userinterface.DistributorAdmin.DistributorAdminWorkArea;
import userinterface.ProviderRole.ProviderWorkSpace;

/**
 *
 * @author Romell
 */
public class DistributorAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
         return new DistributorAdminWorkArea(userProcessContainer, enterprise, account,business);
    }
    
}
