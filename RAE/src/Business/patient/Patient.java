/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.patient;

import Business.applicationUser.ApplicationUser;

/**
 *
 * @author Akshay Singh
 */
public class Patient extends ApplicationUser {
    private String patientLocation;
    private String patientContact;
    private String patientRelativeContact;
    private String patientRelativeContact2;
    private int age;
    private String primaryDoctorName;
    private String primaryDoctorContact;
    private String preferredePharmacy;
    private PatientVitalSignHistory patientVitalSignHistory;
    
    
    
    public Patient(){
        patientVitalSignHistory = new PatientVitalSignHistory();
    }

    public PatientVitalSignHistory getPatientVitalSignHistory() {
        return patientVitalSignHistory;
    }

    public void setPatientVitalSignHistory(PatientVitalSignHistory patientVitalSignHistory) {
        this.patientVitalSignHistory = patientVitalSignHistory;
    }

    public String getPatientRelativeContact2() {
        return patientRelativeContact2;
    }

    public void setPatientRelativeContact2(String patientRelativeContact2) {
        this.patientRelativeContact2 = patientRelativeContact2;
    }

    
    
    public String getPrimaryDoctorContact() {
        return primaryDoctorContact;
    }

    public void setPrimaryDoctorContact(String primaryDoctorContact) {
        this.primaryDoctorContact = primaryDoctorContact;
    }
    

    public String getPatientLocation() {
        return patientLocation;
    }

    public void setPatientLocation(String patientLocation) {
        this.patientLocation = patientLocation;
    }



    public String getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(String patientContact) {
        this.patientContact = patientContact;
    }

    public String getPatientRelativeContact() {
        return patientRelativeContact;
    }

    public void setPatientRelativeContact(String patientRelativeContact) {
        this.patientRelativeContact = patientRelativeContact;
    }

  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPreferredePharmacy() {
        return preferredePharmacy;
    }

    public void setPreferredePharmacy(String preferredePharmacy) {
        this.preferredePharmacy = preferredePharmacy;
    }

    
    
    
@Override
    public String toString() {
        return this.getName();
    }    
    
}
