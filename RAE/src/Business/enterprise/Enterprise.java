/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.enterprise;

import Business.organization.EmployeeOrganization;
import Business.organization.OrganizationDirectory;

/**
 *
 * @author Akshay Singh
 */
public abstract class Enterprise extends EmployeeOrganization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String xyz;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),Distributor("Distributor");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
