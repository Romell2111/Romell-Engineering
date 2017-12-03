/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.patient;

import Business.enterprise.Enterprise;
import Business.organization.Organization;
import Business.organization.PatientOrganization;
import Business.patient.Patient;
//import Business.organization.Organization.Type.Patient;
import Business.patient.PatientDirectory;
import Business.patient.PatientVitalSignViaSensor;
import Business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import userinterface.LoginScreen;



/**
 *
 * @author ravidra
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private PatientOrganization patientOrganization;
    
    
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        this.enterprise = enterprise;
        this.patientOrganization = (PatientOrganization)organization;
        
    populateTable();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientVitalSignHistoryJTable = new javax.swing.JTable();
        chartFrame = new javax.swing.JInternalFrame();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));

        patientVitalSignHistoryJTable.setForeground(new java.awt.Color(0, 51, 204));
        patientVitalSignHistoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Capture Time", "Vital Sign Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientVitalSignHistoryJTable);

        chartFrame.setVisible(true);

        javax.swing.GroupLayout chartFrameLayout = new javax.swing.GroupLayout(chartFrame.getContentPane());
        chartFrame.getContentPane().setLayout(chartFrameLayout);
        chartFrameLayout.setHorizontalGroup(
            chartFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        chartFrameLayout.setVerticalGroup(
            chartFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("View and Raise Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));

        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(0, 51, 255));
        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(21, 101, 139));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("                                            View your Vital Sign History");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(105, 105, 105)
                .addComponent(chartFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutJButton)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(logoutJButton)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
         ViewAndRaiseRequestJPanel viewAndRaiseRequestJPanel = new ViewAndRaiseRequestJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("ViewAndRaiseRequestJPanel", viewAndRaiseRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
   
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        //logoutJButton.setEnabled(true);
        //   userNameJTextField.setEnabled(true);
        //  passwordField.setEnabled(true);
        //  loginJButton.setEnabled(true);

        // userNameJTextField.setText("");
        // passwordField.setText("");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LoginScreen sysAdminwjp = (LoginScreen) component;
        //  sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        //        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame chartFrame;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JTable patientVitalSignHistoryJTable;
    // End of variables declaration//GEN-END:variables


public void populateTable()
{
    DefaultTableModel dtm = (DefaultTableModel)patientVitalSignHistoryJTable.getModel();
    dtm.setRowCount(0);
    Patient patient= (Patient)account.getApplicationUser();
    
           for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPvsh().getVitalSignHistory()){
    
        Object row[] = new Object[2];
        row[0] = patientVitalSignViaSensor;
        row[1] = patientVitalSignViaSensor.getVitalSignStatus();
        dtm.addRow(row);
        //viewVitalSignStatusDisplay(patientVitalSignViaSensor, patient);
        createChart();

    }
   if(!patient.getPvsh().getVitalSignHistory().isEmpty())
     createChart();
}



//public String viewVitalSignStatusDisplay(PatientVitalSignViaSensor patientVitalSignViaSensor, Patient patient){
//    
//    
//     //Age and Vital Sign Status Logic for Toddler:
//    
//    if(patient.getAge()>=1 && patient.getAge()<=3)
//            {
//
//                if(
//                     patientVitalSignViaSensor.getHeartRate()>=80 &&  patientVitalSignViaSensor.getHeartRate()<=130 &&
//                    patientVitalSignViaSensor.getBloodPressure()>=80 && patientVitalSignViaSensor.getBloodPressure() <=110 &&
//                    patientVitalSignViaSensor.getWeight()>=22 && patientVitalSignViaSensor.getWeight()<=31)
//                {
//                    return "Normal";}
//                else{
//                    return "Abnormal";
//                }
//
//            }
////Age and Vital Sign Status Logic for Preschooler:
//            else if(patient.getAge()==4 || patient.getAge()==5)
//            {
//                if( 
//                         patientVitalSignViaSensor.getHeartRate()>=80 &&  patientVitalSignViaSensor.getHeartRate()<=120 &&
//                     patientVitalSignViaSensor.getBloodPressure()>=80 && patientVitalSignViaSensor.getBloodPressure() <=110
//                    && patientVitalSignViaSensor.getWeight()>=31 && patientVitalSignViaSensor.getWeight()<=40)
//                {
//                    return "Normal";}
//                else{
//                    return "Abnormal";
//                }
//           }
//            //Age and Vital Sign Status Logic for School Age
//
//            else if(patient.getAge()>=6 && patient.getAge()<=12){
//                if(
//
//                      patientVitalSignViaSensor.getHeartRate()>=70 &&  patientVitalSignViaSensor.getHeartRate()<=110 &&
//                    patientVitalSignViaSensor.getBloodPressure()>=80 && patientVitalSignViaSensor.getBloodPressure()<=120
//                    && patientVitalSignViaSensor.getWeight()>=41 && patientVitalSignViaSensor.getWeight()<=92)
//                {
//                    return "Normal";}
//                else{
//                    return "Abnormal";
//                }
//           }
//            //Age and Vital Sign Status Logic for Adolescent:
//            else if(patient.getAge()>=13)
//            {
//                if(
//                      patientVitalSignViaSensor.getHeartRate()>=55 &&  patientVitalSignViaSensor.getHeartRate() <=105 &&
//                    patientVitalSignViaSensor.getBloodPressure()>=110 && patientVitalSignViaSensor.getBloodPressure() <=120
//                    && patientVitalSignViaSensor.getWeight()>110)
//                {
//                    return "Normal";}
//                else{
//                    return "Abnormal";
//                }
//           }
//
//return null;
//}
//
//    
//    
//
private void createChart(){
    
    CategoryDataset dataset = createDataset(); 
  JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
    chartFrame.setContentPane(chartPanel);
}



private CategoryDataset createDataset(){

    
        final String series1 = "Heart rate";
        final String series2 = "Blood pressure";
        final String series3 = "Weight";
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    Patient patient= (Patient)account.getApplicationUser();
           
           for(PatientVitalSignViaSensor patientVitalSignViaSensor: patient.getPvsh().getVitalSignHistory()){
            String date = patientVitalSignViaSensor.getCaptureTime();
            dataset.addValue(patientVitalSignViaSensor.getHeartRate(), series1, date);
            dataset.addValue(patientVitalSignViaSensor.getBloodPressure(), series2, date);
            dataset.addValue(patientVitalSignViaSensor.getWeight(), series3, date);
        }
    

        return dataset;

}


 private JFreeChart createChart(final CategoryDataset dataset) {

        // create the chart...
        final JFreeChart chart = ChartFactory.createLineChart(
                "Vital Chart", // chart title
                "Date", // domain axis label
                "Value", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                false // urls
        );
        
        chart.setBackgroundPaint(Color.white);

        final CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        return chart;
 }

}
