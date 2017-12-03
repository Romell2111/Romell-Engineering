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
    private String patientRelativeContact1;
    private String DoctorContact;
    private String Pharmacy;
    private PatientVitalSignHistory pvsh;
    private int Age;
    private String DoctorName;

    
    
    
    
    public Patient(){
    pvsh = new PatientVitalSignHistory();
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

    public String getPatientRelativeContact1() {
        return patientRelativeContact1;
    }

    public void setPatientRelativeContact1(String patientRelativeContact1) {
        this.patientRelativeContact1 = patientRelativeContact1;
    }

    public String getDoctorContact() {
        return DoctorContact;
    }

    public void setDoctorContact(String DoctorContact) {
        this.DoctorContact = DoctorContact;
    }

    public String getPharmacy() {
        return Pharmacy;
    }

    public void setPharmacy(String Pharmacy) {
        this.Pharmacy = Pharmacy;
    }

    public PatientVitalSignHistory getPvsh() {
        return pvsh;
    }

    public void setPvsh(PatientVitalSignHistory pvsh) {
        this.pvsh = pvsh;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

  
    
    
@Override
    public String toString() {
        return this.getName();
    }    
    
}
