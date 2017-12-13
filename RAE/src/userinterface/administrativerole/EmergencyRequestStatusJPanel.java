/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.administrativerole;

import Business.enterprise.Enterprise;
import Business.organization.AmbulanceOrganization;
import Business.organization.DoctorOrganization;
import Business.organization.LabOrganization;
import Business.organization.NurseOrganization;
import Business.organization.Organization;
import Business.organization.PatientOrganization;
import Business.patient.Patient;
import Business.patient.PatientVitalSignViaSensor;
import Business.useraccount.UserAccount;
import Business.workQueue.EmergencyWorkRequest;
import Business.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ravidra
 */
public class EmergencyRequestStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyRequestStatusJPanel
     */
    
   private JPanel userProcessContainer;
          private  Enterprise enterprise; 
          private  UserAccount account;
    
    public EmergencyRequestStatusJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        raiseRequest();
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshTestJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setForeground(new java.awt.Color(0, 51, 204));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));

        workRequestJTable1.setForeground(new java.awt.Color(0, 51, 204));
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Amb Result", "Nurse Result", "Doctor_Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);
        if (workRequestJTable1.getColumnModel().getColumnCount() > 0) {
            workRequestJTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            workRequestJTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            workRequestJTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
            workRequestJTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
            workRequestJTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 51, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                             View Emergency Status");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            EmergencyWorkRequest emergencyWorkRequest = (EmergencyWorkRequest)request;
            Object[] row = new Object[6];
            row[0] = emergencyWorkRequest.getMessage();
            row[1] = emergencyWorkRequest.getReceiver();
            row[2] = emergencyWorkRequest.getStatus();
            String ambResult = emergencyWorkRequest.getAmbulanceTestResult();
            String doctorResult = emergencyWorkRequest.getDoctorTestResult();
            String labResult = emergencyWorkRequest.getLabTestResult();
            String nurseResult = emergencyWorkRequest.getNurseTestResult();
            
            row[2] = ambResult == null ? "Request sent" : ambResult;
            row[3] = nurseResult == null ? "Request sent" : nurseResult;
//            row[4] = labResult == null ? "Request sent" : labResult;
            row[4] = doctorResult == null ? "Request sent" : doctorResult;
            
            
            model.addRow(row);
   if(!row[2].equals("Request sent") && !row[3].equals("Request sent") && !row[4].equals("Request sent") && !row[5].equals("Request sent") ){
                setVitalSignStatus();
            }
            
        }
        
    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables

private void raiseRequest(){
    
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                
                    if(organization instanceof PatientOrganization){
                        PatientOrganization org = (PatientOrganization)organization;
                        for(Patient patient: org.getPatientDirectory().getPatientDirectory()){
           
     for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPvsh().getVitalSignHistory()){
  if(patientVitalSignViaSensor.getVitalSignStatus().equalsIgnoreCase("Abnormal") && patientVitalSignViaSensor.isEmergencyraiserequest()== false){
patientVitalSignViaSensor.setEmergencyraiserequest(true);
    AmbulanceOrganization aorg = null;
    NurseOrganization norg = null;
    LabOrganization lorg = null;
    DoctorOrganization dorg = null;
    
    EmergencyWorkRequest request = new EmergencyWorkRequest();
      request.setMessage("Emergency for Patient:"+patient.getId());
//      request.setSender(account);
      request.setStatus("Waiting for response");
    
    
    for(Organization organizatn: enterprise.getOrganizationDirectory().getOrganizationList()){
      if(organizatn instanceof AmbulanceOrganization){
          aorg = (AmbulanceOrganization)organizatn;
      aorg.getWorkQueue().getWorkRequestList().add(request);
               
      }
      if(organizatn instanceof NurseOrganization){
          norg = (NurseOrganization)organizatn;
      norg.getWorkQueue().getWorkRequestList().add(request);
      }
      
        if(organizatn instanceof DoctorOrganization){
          dorg = (DoctorOrganization)organizatn;
      dorg.getWorkQueue().getWorkRequestList().add(request);
      }
      
//      if(organizatn instanceof LabOrganization){
//          lorg = (LabOrganization)organizatn;
//      lorg.getWorkQueue().getWorkRequestList().add(request);
//      account.getWorkQueue().getWorkRequestList().add(request);
//    }
    }
               
}
                    }
}
}
}
}



private void setVitalSignStatus(){
    
                for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                
                    if(organization instanceof PatientOrganization){
                        PatientOrganization org = (PatientOrganization)organization;
                        for(Patient patient: org.getPatientDirectory().getPatientDirectory()){
           
     for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPvsh().getVitalSignHistory()){
    patientVitalSignViaSensor.setVitalSignStatus("Normal");
    System.out.println(patientVitalSignViaSensor.getVitalSignStatus());
    
}
                        }
                    }
                }
}
}