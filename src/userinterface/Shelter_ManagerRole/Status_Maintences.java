/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Shelter_ManagerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Maintainance_Workrequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nares
 */
public class Status_Maintences extends javax.swing.JPanel {

    /**
     * Creates new form Status_Maintences
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private ShelterOrganization shelterOrganization;
    private Enterprise enterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance(); 
       

    Status_Maintences(JPanel userProcessContainer, UserAccount userAccount, ShelterOrganization shelterOrganization, Enterprise enterprise, EcoSystem system) {
      initComponents();
      
       this.userProcessContainer = userProcessContainer;
       this.userAccount = userAccount;
       this.system = system;
       this.shelterOrganization = shelterOrganization;
       this.enterprise=enterprise;
       populatetable2();
      
    }
     public void populatetable2(){
             DefaultTableModel model = (DefaultTableModel)maintainRequestTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if(request.getRole().equalsIgnoreCase("Maintainance")){
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = ((Maintainance_Workrequest)request).getMaintainancetype();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getRequestDate();
            row[5] = request.getResolveDate();
            row[6] = request.getStatus();
            row[7] = ((Maintainance_Workrequest)request).getText();
            model.addRow(row);
        }
        }
            
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        maintainRequestTable = new javax.swing.JTable();
        btnBack2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        maintainRequestTable.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        maintainRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Type", "Sender", "Receiver", "Request Date", "Resolve Date", "Status", "Staff"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(maintainRequestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 966, 121));

        btnBack2.setBackground(new java.awt.Color(102, 102, 102));
        btnBack2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(255, 255, 255));
        btnBack2.setText("<<Back");
        btnBack2.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 130, 80, 40));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel1.setText("Maintenance Request Status ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 35, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable maintainRequestTable;
    // End of variables declaration//GEN-END:variables
}