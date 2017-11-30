/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.applicationUser;

import Business.EcoSystem;
import Business.useraccount.UserAccount;

/**
 *
 * @author Akshay Singh
 */
public class ApplicationUser {
       private int id;
    private String name;
    private UserAccount ua;
    
//    private static int count = 1;
        private int count;
    public ApplicationUser() {
        id = EcoSystem.getInstance().getUserAccountDirectory().getUserAccountList().size();
        //count++;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
