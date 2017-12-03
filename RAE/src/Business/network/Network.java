/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.network;

import Business.enterprise.EnterpriseDirectory;

/**
 *
 * @author Akshay Singh
 */
public class Network {
    private String name;
    private EnterpriseDirectory ed;

    public Network() {
        ed = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return ed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
