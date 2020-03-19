/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO_ManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author nares
 */
public class NGO_ManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGO_ManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private NGOOrganization ngoOrganization;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Enterprise enterprise;
   

    public NGO_ManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, NGOOrganization ngoOrganization, Enterprise enterprise, EcoSystem business) {
        
        initComponents();
    
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
        this.ngoOrganization = ngoOrganization;
        this.enterprise=enterprise;
        jLabel2.setText(enterprise.getName());
        dB4OUtil.storeSystem(system);
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
        btnViewRequest = new javax.swing.JButton();
        btnRaiseRequest = new javax.swing.JButton();
        comboView = new javax.swing.JComboBox<>();
        comboRaise = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        StatusButton = new javax.swing.JButton();
        txtAnalytics = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText("Enterprise");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel3.setText("NGO Manager DashBoard");

        btnViewRequest.setBackground(new java.awt.Color(204, 255, 255));
        btnViewRequest.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnViewRequest.setText("View Request");
        btnViewRequest.setBorder(new javax.swing.border.MatteBorder(null));
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnRaiseRequest.setBackground(new java.awt.Color(204, 255, 255));
        btnRaiseRequest.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnRaiseRequest.setText("Raise Request");
        btnRaiseRequest.setBorder(new javax.swing.border.MatteBorder(null));
        btnRaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaiseRequestActionPerformed(evt);
            }
        });

        comboView.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        comboView.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Field Worker Request", "Recruiter Request" }));

        comboRaise.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        comboRaise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shelter Manager" }));

        jComboBox1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Shelter Manager", "Homless Person" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        StatusButton.setBackground(new java.awt.Color(204, 255, 255));
        StatusButton.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        StatusButton.setText("Status");
        StatusButton.setBorder(new javax.swing.border.MatteBorder(null));
        StatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusButtonActionPerformed(evt);
            }
        });

        txtAnalytics.setBackground(new java.awt.Color(204, 255, 255));
        txtAnalytics.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        txtAnalytics.setText("Analytics");
        txtAnalytics.setBorder(new javax.swing.border.MatteBorder(null));
        txtAnalytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnalyticsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboView, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboRaise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(btnRaiseRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(txtAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRaise, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiseRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(txtAnalytics, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        String s =(String) comboView.getSelectedItem();
        
        if(s.equals("Field Worker Request")){
            NgotoFieldWorkerView view1 = new NgotoFieldWorkerView (userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("ViewRequest", view1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
        }
        
         if(s.equals("Recruiter Request")){
            NgotoRecruiterView view2 = new NgotoRecruiterView (userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("ViewRequest", view2);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnRaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaiseRequestActionPerformed
        // TODO add your handling code here:
        String s =(String) comboRaise.getSelectedItem();
        
        
        
        if(s.equals("Shelter Manager")){
            NGOtoShelterSelection raise2 = new NGOtoShelterSelection (userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("ngotoshelterselection", raise2);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
        }
    }//GEN-LAST:event_btnRaiseRequestActionPerformed

    private void StatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusButtonActionPerformed
        // TODO add your handling code here:
         
         String s =(String) jComboBox1.getSelectedItem();
        
            if(s.equals("Doctor")){
            StatusRaiseDoctor raise1 = new  StatusRaiseDoctor (userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("doctorstatus", raise1);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
            
        }
           
        
        if(s.equals("Shelter Manager")){
           StatusRaiseShelter raise2 = new StatusRaiseShelter (userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("shelterstatus", raise2);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
        }
        
         if(s.equals("Homless Person")){
          StatusHomeless raise3 = new StatusHomeless(userProcessContainer, userAccount,ngoOrganization, enterprise, system);
            userProcessContainer.add("Homelessstatus", raise3);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            dB4OUtil.storeSystem(system);
        }
       
    }//GEN-LAST:event_StatusButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtAnalyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnalyticsActionPerformed
        // TODO add your handling code here:
        AnalysisChartsJPanel analysisCharts = new AnalysisChartsJPanel(userProcessContainer, system);
        userProcessContainer.add("AnalysisChartsJPanel", analysisCharts);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_txtAnalyticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StatusButton;
    private javax.swing.JButton btnRaiseRequest;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JComboBox<String> comboRaise;
    private javax.swing.JComboBox<String> comboView;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton txtAnalytics;
    // End of variables declaration//GEN-END:variables
}