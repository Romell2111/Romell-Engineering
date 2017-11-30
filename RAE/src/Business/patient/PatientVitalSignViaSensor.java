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
     private int heartRate;
    private float bloodPressure;
    private float weight;
    private String captureTime;
    private String vitalSignStatus;
    private boolean emergengcyHandled = false;
    private boolean emergencyRequestRaise = false;

    
    
    public boolean isEmergencyRequestRaise() {
        return emergencyRequestRaise;
    }

    public void setEmergencyRequestRaise(boolean emergencyRequestRaise) {
        this.emergencyRequestRaise = emergencyRequestRaise;
    }

    
    public boolean isEmergengcyHandled() {
        return emergengcyHandled;
    }

    public void setEmergengcyHandled(boolean emergengcyHandled) {
        this.emergengcyHandled = emergengcyHandled;
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
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        captureTime = dateFormat.format(date);
       //return captureTime;
    }

    public String getCaptureTime(){
        
     return captureTime;   
        
    }
        

    @Override
    public String toString() {
        return captureTime;
    }

    public String getVitalSignStatus() {
        return vitalSignStatus;
    }

    public void setVitalSignStatus(String vitalSignStatus) {
        this.vitalSignStatus = vitalSignStatus;
    }

    
    
    
    
}
