/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.patient;

import java.util.ArrayList;

/**
 *
 * @author Akshay Singh
 */
public class PatientVitalSignHistory {
     private ArrayList<PatientVitalSignViaSensor> patientVitalSignHistory;
    
 public PatientVitalSignHistory(){
     patientVitalSignHistory = new ArrayList<>();
 }   

    public ArrayList<PatientVitalSignViaSensor> getVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<PatientVitalSignViaSensor> patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }
 
    public PatientVitalSignViaSensor addVitalSign(){
        PatientVitalSignViaSensor pvsh = new PatientVitalSignViaSensor();
        patientVitalSignHistory.add(pvsh);
        return pvsh;
        
    }
 
    public void deleteVitalSign(PatientVitalSignViaSensor vitalsign){
        patientVitalSignHistory.remove(vitalsign);
    }
    
}
