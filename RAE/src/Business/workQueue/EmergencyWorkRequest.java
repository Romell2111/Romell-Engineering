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
public class EmergencyWorkRequest extends WorkRequest{
     private String docResult;
    private String nurResult;
    private String labResult;
    private String ambResult;
private double latitude;
private double longitude;
private String city;

    public String getDocResult() {
        return docResult;
    }

    public void setDocResult(String docResult) {
        this.docResult = docResult;
    }

    public String getNurResult() {
        return nurResult;
    }

    public void setNurResult(String nurResult) {
        this.nurResult = nurResult;
    }

    public String getLabResult() {
        return labResult;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public String getAmbResult() {
        return ambResult;
    }

    public void setAmbResult(String ambResult) {
        this.ambResult = ambResult;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

   

    public String getDoctorTestResult() {
        return docResult;
    }

    public void setDoctorTestResult(String doctorTestResult) {
        this.docResult = doctorTestResult;
    }

    public String getNurseTestResult() {
        return nurResult;
    }

    public void setNurseTestResult(String nurseTestResult) {
        this.nurResult = nurseTestResult;
    }

    public String getLabTestResult() {
        return labResult;
    }

    public void setLabTestResult(String labTestResult) {
        this.labResult = labTestResult;
    }

    public String getAmbulanceTestResult() {
        return ambResult;
    }

    public void setAmbulanceTestResult(String ambulanceTestResult) {
        this.ambResult = ambulanceTestResult;
    }

    @Override
    public String toString() {
        return getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
        
       
    

}
