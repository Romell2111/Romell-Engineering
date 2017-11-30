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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        refreshTestJButton.setForeground(new java.awt.Color(0, 51, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        backJButton.setForeground(new java.awt.Color(0, 51, 204));
        backJButton.setText("Back");
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Last Updated By", "Amb Result", "Nurse Result", "Lab Result", "Doctor Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            workRequestJTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(21, 101, 139));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                        Raise And View Emergency Request Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(backJButton)))
                        .addGap(0, 761, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(88, 88, 88)
                .addComponent(refreshTestJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
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
           // row[2] = emergencyWorkRequest.getStatus();
            String ambResult = emergencyWorkRequest.getAmbulanceTestResult();
            String doctorResult = emergencyWorkRequest.getDoctorTestResult();
            String labResult = emergencyWorkRequest.getLabTestResult();
            String nurseResult = emergencyWorkRequest.getNurseTestResult();
            
            row[2] = ambResult == null ? "Request sent" : ambResult;
            row[3] = nurseResult == null ? "Request sent" : nurseResult;
            row[4] = labResult == null ? "Request sent" : labResult;
            row[5] = doctorResult == null ? "Request sent" : doctorResult;
            
            
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel2;
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
           
     for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPatientVitalSignHistory().getVitalSignHistory()){
  if(patientVitalSignViaSensor.getVitalSignStatus().equalsIgnoreCase("Abnormal") && patientVitalSignViaSensor.isEmergencyRequestRaise() == false){
patientVitalSignViaSensor.setEmergencyRequestRaise(true);
    AmbulanceOrganization aorg = null;
    NurseOrganization norg = null;
    LabOrganization lorg = null;
    DoctorOrganization dorg = null;
    
    EmergencyWorkRequest request = new EmergencyWorkRequest();
      request.setMessage("Emergency for Patient:"+patient.getId());
      request.setSender(account);
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
      
      if(organizatn instanceof LabOrganization){
          lorg = (LabOrganization)organizatn;
      lorg.getWorkQueue().getWorkRequestList().add(request);
      account.getWorkQueue().getWorkRequestList().add(request);
    }
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
           
     for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPatientVitalSignHistory().getVitalSignHistory()){
    patientVitalSignViaSensor.setVitalSignStatus("Normal");
    System.out.println(patientVitalSignViaSensor.getVitalSignStatus());
    
}
                        }
                    }
                }
}
}