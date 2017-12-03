/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.workQueue;

/**
 *
 * @author Akshay Singh
 */
public class LabWorkRequest extends WorkRequest {
      private String testCaseResult;

    public String getTestResult() {
        return testCaseResult;
    }

    public void setTestResult(String testCaseResult) {
        this.testCaseResult = testCaseResult;
    }
    
    
    
}
