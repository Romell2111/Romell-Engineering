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
public class PatientDirectory {
     private ArrayList<Patient> patientDirectory;

    
    public PatientDirectory(){
     patientDirectory = new ArrayList<>();
 }   

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }


public Patient createPatient(String name){
        Patient patient = new Patient();
        patient.setName(name);
        patientDirectory.add(patient);
        return patient;
    }
 
    public void deletePatient(Patient vs){
        patientDirectory.remove(vs);
    }
}
