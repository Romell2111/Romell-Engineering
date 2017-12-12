/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.organization.Organization;

import Business.Organization.SupplierOrganization;
import Business.Supplier.Supplier;
import Business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Distributor.Supplier.SupplierAdminWorkAreaJPanel;
import userinterface.Hospital.Clinic.ClinicAdminWorkAreaJPanel;

/**
 *
 * @author Akshay Singh
 */
public class SupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SupplierAdminWorkAreaJPanel(userProcessContainer,  account, (SupplierOrganization) organization,  enterprise,  business);
    }
    
}
