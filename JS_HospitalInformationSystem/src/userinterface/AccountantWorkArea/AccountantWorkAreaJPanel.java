/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AccountantWorkArea;

import Business.Enterprise.Enterprise;
import Business.HIS;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedPurchaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author yizhe
 */
public class AccountantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountantWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    HIS system;
    Network network;
    Organization org;

    public AccountantWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount account,HIS system,Network network,Organization org) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.account = account;
        this.system=system;
         this.org=org;
         this.network=network;

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

        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addJButton2 = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        purchaseJTable = new javax.swing.JTable();
        btnViewStorage = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel3.setBackground(new java.awt.Color(224, 224, 224));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Hospital Information System - Accountant WorkArea ");

        btnBack.setBackground(new java.awt.Color(224, 224, 224));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(224, 224, 224));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText("Work Load Area");

        addJButton2.setBackground(new java.awt.Color(224, 224, 224));
        addJButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addJButton2.setText("Refresh");
        addJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButton2ActionPerformed(evt);
            }
        });

        btnPurchase.setBackground(new java.awt.Color(224, 224, 224));
        btnPurchase.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPurchase.setText("Purchase Medicine");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });

        purchaseJTable.setBackground(new java.awt.Color(224, 224, 224));
        purchaseJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        purchaseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Price", "Quantity", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        purchaseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        purchaseJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        purchaseJTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane4.setViewportView(purchaseJTable);
        if (purchaseJTable.getColumnModel().getColumnCount() > 0) {
            purchaseJTable.getColumnModel().getColumn(0).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(1).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(2).setResizable(false);
            purchaseJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        btnViewStorage.setBackground(new java.awt.Color(224, 224, 224));
        btnViewStorage.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnViewStorage.setText("View Storage");
        btnViewStorage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStorageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(459, 459, 459)
                                .addComponent(addJButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPurchase)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewStorage, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack))))
                        .addGap(1856, 1856, 1856))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addJButton2))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPurchase)
                .addGap(42, 42, 42)
                .addComponent(btnViewStorage)
                .addGap(41, 41, 41)
                .addComponent(btnBack)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
         
        DefaultTableModel dtm = (DefaultTableModel) purchaseJTable.getModel();
        dtm.setRowCount(0);
    
        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
            for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList()){
                MedPurchaseWorkRequest mpwr=(MedPurchaseWorkRequest)wr;
                Medicine m=mpwr.getMedicine();
                Object[] row = new Object[4];
                row[0] = m;
                row[1] = m.getPrice();
                row[2] = m.getQuantity();
                row[3] = m.getStatus();
                dtm.addRow(row);
            }
            
                           
        }
                    
    }
          


    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void addJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButton2ActionPerformed
        populateTable();
    }//GEN-LAST:event_addJButton2ActionPerformed

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PruchaseRequestJPanel", new PurchaseRequestJPanel(userProcessContainer, account, enterprise,network,org,system));
        layout.next(userProcessContainer);     
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnViewStorageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStorageActionPerformed
        // TODO add your handling code here:
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewStorageJPanel",new ViewStorageJPanel(userProcessContainer,enterprise,account,system,network,org));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewStorageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnViewStorage;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable purchaseJTable;
    // End of variables declaration//GEN-END:variables
}
