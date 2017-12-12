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
import userinterface.ProviderRole.ProviderWorkSpace;
import userinterface.administrativerole.AdminWorkAreaJPanel;

/**
 *
 * @author Romell
 */
public class ProviderRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new ProviderWorkSpace(userProcessContainer, enterprise, useraccount,organization,business);
    }
    
}
