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
     private String doctorTestResult;
    private String nurseTestResult;
    private String labTestResult;
    private String ambulanceTestResult;
private double latitude;
private double longitude;

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
        return doctorTestResult;
    }

    public void setDoctorTestResult(String doctorTestResult) {
        this.doctorTestResult = doctorTestResult;
    }

    public String getNurseTestResult() {
        return nurseTestResult;
    }

    public void setNurseTestResult(String nurseTestResult) {
        this.nurseTestResult = nurseTestResult;
    }

    public String getLabTestResult() {
        return labTestResult;
    }

    public void setLabTestResult(String labTestResult) {
        this.labTestResult = labTestResult;
    }

    public String getAmbulanceTestResult() {
        return ambulanceTestResult;
    }

    public void setAmbulanceTestResult(String ambulanceTestResult) {
        this.ambulanceTestResult = ambulanceTestResult;
    }

    @Override
    public String toString() {
        return getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
        
       
    

}
