/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.useraccount;

import Business.EcoSystem;
import Business.applicationUser.ApplicationUser;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> ual;

    public UserAccountDirectory() {
        ual = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return ual;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : ual)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, ApplicationUser applicationUser, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setApplicationUser(applicationUser);
        userAccount.setRole(role);
        ual.add(userAccount);
        // EcoSystem.getInstance().getUserAccountDirectory().createUserAccount(username, password, applicationUser, role);
         EcoSystem.getInstance().getUserAccountDirectory().userAccountAdded(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : ual){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

public void userAccountAdded(UserAccount ua){
    ual.add(ua);
}
    
}
