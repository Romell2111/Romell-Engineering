/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.patient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Akshay Singh
 */
public class PatientVitalSignViaSensor {
    private boolean isemergencyhandled = false;
    private boolean emergencyraiserequest = false;
     private int heartRate;
    private String time;
    private String vitalSignStatus;
    private float bloodPressure;
    private float weight;


    public boolean isIsemergencyhandled() {
        return isemergencyhandled;
    }

    public void setIsemergencyhandled(boolean isemergencyhandled) {
        this.isemergencyhandled = isemergencyhandled;
    }

    public boolean isEmergencyraiserequest() {
        return emergencyraiserequest;
    }

    public void setEmergencyraiserequest(boolean emergencyraiserequest) {
        this.emergencyraiserequest = emergencyraiserequest;
    }
    
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public float getbloodPressure() {
        return bloodPressure;
    }

    public void setbloodPressure(float systolicBloodPressure) {
        this.bloodPressure = systolicBloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setCaptureTime() {
        DateFormat dF= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        time = dF.format(date);
       //return captureTime;
    }

    public String getCaptureTime(){
        
     return time;   
        
    }
        

    @Override
    public String toString() {
        return time;
    }

    public String getVitalSignStatus() {
        return vitalSignStatus;
    }

    public void setVitalSignStatus(String vitalSignStatus) {
        this.vitalSignStatus = vitalSignStatus;
    }

    
    
    
    
}
