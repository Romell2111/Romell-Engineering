/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.workQueue;

import Business.useraccount.UserAccount;

/**
 *
 * @author Akshay Singh
 */
public class LabWorkRequest extends WorkRequest {
      private String testCaseResult;
      private UserAccount sent;

    public String getTestCaseResult() {
        return testCaseResult;
    }

    public void setTestCaseResult(String testCaseResult) {
        this.testCaseResult = testCaseResult;
    }

    public UserAccount getSent() {
        return sent;
    }

    public void setSent(UserAccount sent) {
        this.sent = sent;
    }

    public String getTestResult() {
        return testCaseResult;
    }

    public void setTestResult(String testCaseResult) {
        this.testCaseResult = testCaseResult;
    }
    
    
    
}
