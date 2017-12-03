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
public class PatientRelativeDirectory {
    private ArrayList<PatientRelative> patientRelativeDirectory;

    public ArrayList<PatientRelative> getPatientRelativeDirectory() {
        return patientRelativeDirectory;
    }

    public void setPatientRelativeDirectory(ArrayList<PatientRelative> patientRelativeDirectory) {
        this.patientRelativeDirectory = patientRelativeDirectory;
    }
     public PatientRelativeDirectory(){
     patientRelativeDirectory = new ArrayList<>();
 }  
     public PatientRelative addPatientRealative(){
        PatientRelative patientrelative = new PatientRelative();
        patientRelativeDirectory.add(patientrelative);
        return patientrelative;
        
    }
    
}
