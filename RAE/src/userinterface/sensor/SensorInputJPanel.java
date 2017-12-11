/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.sensor;

import javax.swing.JPanel;
import Business.EcoSystem;
import Business.applicationUser.ApplicationUser;
import Business.enterprise.Enterprise;
import Business.network.Network;
import Business.organization.AmbulanceOrganization;
import Business.organization.LabOrganization;
import Business.organization.NurseOrganization;
import Business.organization.Organization;
import static Business.organization.Organization.Type.Patient;
import Business.organization.PatientOrganization;
import Business.patient.Patient;
import Business.patient.PatientVitalSignViaSensor;
import Business.useraccount.UserAccount;
import Business.validation.ValidationMethods;
import Business.workQueue.EmergencyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import userinterface.LoginScreen;
import Business.Email.SendMailUsingAuthentication;
import Business.GeoLocation.GeoLocation;
import Business.GeoLocation.ServerLocation.ServerLocation;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
/**
 *
 * @author ravidra
 */
public class SensorInputJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SensorInputJPanel
     */
    
   private EcoSystem system;
   private JPanel container;
   public String message="EMEREGENCY FOR YOUR RELATIVE";
   public String sender="romellsegaran2111@gmail.com";
   public String []patientRelative =new String[2];
   public String Ipaddress;
   public double latitude;
   public double longitude;
   public String city;
  
    
    public SensorInputJPanel(JPanel container, EcoSystem system) {
        initComponents();
        this.system  = system;
        this.container = container;
        populatePatientComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        heartRateTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        bloodPressureTextField = new javax.swing.JTextField();
        vitalSignStatusTextField = new javax.swing.JTextField();
        patientComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ipAddressTxtField = new javax.swing.JTextField();
        txtlat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtlon = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Patient ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Heart Rate:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Weight:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Blood Pressure:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Vital Sign Status:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        heartRateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartRateTextFieldActionPerformed(evt);
            }
        });

        vitalSignStatusTextField.setEditable(false);

        patientComboBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        patientComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientComboBoxActionPerformed(evt);
            }
        });

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                                   Input from Sensors");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("IP Address");

        jLabel5.setText("Latitude");

        jLabel9.setText("Longitude");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtlat)
                                    .addComponent(weightTextField)
                                    .addComponent(heartRateTextField)
                                    .addComponent(bloodPressureTextField)
                                    .addComponent(vitalSignStatusTextField)
                                    .addComponent(ipAddressTxtField)
                                    .addComponent(patientComboBox, 0, 112, Short.MAX_VALUE)
                                    .addComponent(txtlon)))
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton)
                        .addGap(356, 356, 356))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(patientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(heartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(bloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(vitalSignStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ipAddressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtlon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(saveButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void heartRateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartRateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heartRateTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
       container.remove(this);
     Component[] componentArray = container.getComponents();
      Component component = componentArray[componentArray.length - 1];
       LoginScreen sysAdminwjp = (LoginScreen) component;
       CardLayout layout = (CardLayout) container.getLayout();
    layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void patientComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientComboBoxActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_patientComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Patient patient= (Patient)patientComboBox.getSelectedItem();
       // resetFields();
       //PatientVitalSignViaSensor patientVitalSignViaSensor = patient.getPatientVitalSignViaSensor();
           
PatientVitalSignViaSensor patientVitalSignViaSensor = patient.getPvsh().addVitalSign();
   
if(ValidationMethods.isIntegerPositive(heartRateTextField.getText()) == false){
    JOptionPane.showMessageDialog(null, "Please enter valid input", "Info", JOptionPane.ERROR_MESSAGE);
return;
}
if(ValidationMethods.isIntegerPositive(bloodPressureTextField.getText()) == false){
    JOptionPane.showMessageDialog(null, "Please enter valid input", "Info", JOptionPane.ERROR_MESSAGE);
return;
}
if(ValidationMethods.isIntegerPositive(weightTextField.getText()) == false){
    JOptionPane.showMessageDialog(null, "Please enter valid input", "Info", JOptionPane.ERROR_MESSAGE);
return;
}

      int a = Integer.parseInt(heartRateTextField.getText());
      float b = Float.parseFloat(bloodPressureTextField.getText());
      float c = Float.parseFloat(weightTextField.getText());
      int d = patient.getAge();
       patientVitalSignViaSensor.setHeartRate(a);
        patientVitalSignViaSensor.setBloodPressure(b);
        patientVitalSignViaSensor.setWeight(c);
        patientVitalSignViaSensor.setCaptureTime();

        
        //Age and Vital Sign Status Logic for Toddler:
            if(d>=1 && d<=3)
            {

                if(
                    (a>=80 && a<=130) &&
                    (b>=80 && b <=110 )&&
                    (c>=22 && c<=31))
                {
                    vitalSignStatusTextField.setText("Abnormal");
                    patientVitalSignViaSensor.setVitalSignStatus("Abnormal");
                
                }
                else{
                    vitalSignStatusTextField.setText("Normal");
                    patientVitalSignViaSensor.setVitalSignStatus("Normal");
                }
            }

            //Age and Vital Sign Status Logic for Preschooler:
            else if(d==4 || d==5)
            {
                if( 
                        (a>=80 && a<=120) &&
                    (b>=80 && b <=110)
                    && (c>=31 && c<=40))
                {
                    vitalSignStatusTextField.setText("Abnormal");
                     patientVitalSignViaSensor.setVitalSignStatus("Abnormal");
                emergency(patient);
               
                patientRelative[0]=patient.getPatientRelativeContact();
                patientRelative[1]=patient.getPatientRelativeContact1();
                    try {
                        SendMailUsingAuthentication.postMail(patientRelative, message, sender);
                    } catch (MessagingException ex) {
                        Logger.getLogger(SensorInputJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   geolocation();;
                    
                    
                 
                
                }
                else{
                    vitalSignStatusTextField.setText("Normal");
                     patientVitalSignViaSensor.setVitalSignStatus("Normal");
                }
            }
            //Age and Vital Sign Status Logic for School Age

            else if(d>=6 && d<=12){
                if(

                     (a>=70 && a <=110) &&
                    (b>=80 && b<=120)
                    && (c>=41 && c<=92))
                {
                    vitalSignStatusTextField.setText("Abnormal");
                 patientVitalSignViaSensor.setVitalSignStatus("Abnormal");
                emergency(patient);
                 patientRelative[0]=patient.getPatientRelativeContact();
                patientRelative[1]=patient.getPatientRelativeContact1();
                    try {
                        SendMailUsingAuthentication.postMail(patientRelative, message, sender);
                    } catch (MessagingException ex) {
                        Logger.getLogger(SensorInputJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    geolocation();
               
                }
                else{
                    vitalSignStatusTextField.setText("Normal");
                     patientVitalSignViaSensor.setVitalSignStatus("Normal");
                }
            }
            //Age and Vital Sign Status Logic for Adolescent:
            else if(d>=13)
            {
                if(
                     (a>=55 && a <=105) &&
                    (b>=110 && b <=120)
                    && c>110)
                {
                    vitalSignStatusTextField.setText("Abnormal");
                 patientVitalSignViaSensor.setVitalSignStatus("Abnormal");
                emergency(patient);
                 patientRelative[0]=patient.getPatientRelativeContact();
                patientRelative[1]=patient.getPatientRelativeContact1();
                    try {
                        SendMailUsingAuthentication.postMail(patientRelative, message, sender);
                    } catch (MessagingException ex) {
                        Logger.getLogger(SensorInputJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    geolocation();
               
                }
                else{
                    vitalSignStatusTextField.setText("Normal");
                     patientVitalSignViaSensor.setVitalSignStatus("Normal");
                }

            }
     
   
            
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureTextField;
    private javax.swing.JTextField heartRateTextField;
    private javax.swing.JTextField ipAddressTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox patientComboBox;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtlat;
    private javax.swing.JTextField txtlon;
    private javax.swing.JTextField vitalSignStatusTextField;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables

private void populatePatientComboBox(){
    

            patientComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                    if(organization instanceof PatientOrganization){
                        PatientOrganization org = (PatientOrganization)organization;
                        for(Patient patient: org.getPatientDirectory().getPatientDirectory()){
                           patientComboBox.addItem(patient);
                        }
                    }
            

    
}
}
//
private void emergency(Patient patient){
    System.out.println("hello");
    
      AmbulanceOrganization aorg = null;
    NurseOrganization norg = null;
    LabOrganization lorg = null;
    
            
    
    EmergencyWorkRequest request = new EmergencyWorkRequest();
      request.setMessage("Emergency for Patient:"+patient.getId());
//      request.setSender(account);
      request.setStatus("Waiting for other Team's response");
      request.setLatitude(latitude);
      request.setLongitude(longitude);
    
    for(Network network: system.getNetworkList()){
        
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
            
    for(Organization organizatn: enterprise.getOrganizationDirectory().getOrganizationList()){
      if(organizatn instanceof AmbulanceOrganization){
          System.out.println("hello1");
          aorg = (AmbulanceOrganization)organizatn;
      aorg.getWorkQueue().getWorkRequestList().add(request);
      System.out.println("bc");
               
      }
      if(organizatn instanceof NurseOrganization){
          System.out.println("ab");
          norg = (NurseOrganization)organizatn;
      norg.getWorkQueue().getWorkRequestList().add(request);
      System.out.println("pq");
      }
      
      if(organizatn instanceof LabOrganization){
          lorg = (LabOrganization)organizatn;
      lorg.getWorkQueue().getWorkRequestList().add(request);
      
      
}
    }
        }
}
}

//
private void resetFields(){
    
    heartRateTextField.setText("");
    bloodPressureTextField.setText("");
    weightTextField.setText("");
    vitalSignStatusTextField.setText("");
    
    
}
public void geolocation()
{
     Ipaddress=ipAddressTxtField.getText();
                    try {
                      ServerLocation serverLocation=  GeoLocation.getLocation(Ipaddress);
                       
                     latitude=Double.parseDouble(serverLocation.getLatitude());
                     longitude=Double.parseDouble(serverLocation.getLongitude());
                     city=serverLocation.getCity();
                     System.out.println(latitude);
                     System.out.println(longitude);
                     txtlat.setText(String.valueOf(latitude));
                     txtlon.setText(String.valueOf(longitude));
                    } catch (IOException ex) {
                        Logger.getLogger(SensorInputJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
}


    

}