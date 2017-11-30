/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.workQueue;

import Business.useraccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Akshay Singh
 */
public abstract class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private ArrayList<UserAccount> receiverList;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
       receiverList = new ArrayList<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }


   

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public ArrayList<UserAccount> getReceiverList() {
        return receiverList;
    }

    public void setReceiverList(ArrayList<UserAccount> receiverList) {
        this.receiverList = receiverList;
    }

    
public UserAccount addReceiver(String name){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(name);
        receiverList.add(userAccount);
        return userAccount;
    }
    
}
