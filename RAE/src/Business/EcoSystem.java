/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.network.Network;
import Business.organization.EmployeeOrganization;
import Business.role.Role;
import Business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class EcoSystem extends EmployeeOrganization{
    private static EcoSystem ecosys;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (ecosys == null) {
            ecosys = new EcoSystem();
        }
        return ecosys;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
}
