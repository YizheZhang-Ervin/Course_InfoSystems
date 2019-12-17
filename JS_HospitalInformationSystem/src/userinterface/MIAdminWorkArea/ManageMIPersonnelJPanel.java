/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MIAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.People.People;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cheny
 */
public class ManageMIPersonnelJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMIPersonnelJPanel
     */
   JPanel userProcessContainer;
    Enterprise enterprise;
    public ManageMIPersonnelJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        populateOrganizationComboBox();
        
    }
    public void populateOrganizationComboBox(){
        OrgJCB.removeAllItems();
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            OrgJCB.addItem(organization);
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

        jLabel8 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        OrgJCB = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        delJB = new javax.swing.JButton();

        setBackground(new java.awt.Color(224, 224, 224));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel8.setBackground(new java.awt.Color(224, 224, 224));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Hospital Information System-Hospital Organization Personnel");

        nameJTextField.setBackground(new java.awt.Color(224, 224, 224));
        nameJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(224, 224, 224));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        addJButton.setBackground(new java.awt.Color(224, 224, 224));
        addJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addJButton.setText("Create Personnel");
        addJButton.setMaximumSize(new java.awt.Dimension(95, 35));
        addJButton.setMinimumSize(new java.awt.Dimension(95, 35));
        addJButton.setPreferredSize(new java.awt.Dimension(95, 35));
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(224, 224, 224));

        organizationJTable.setBackground(new java.awt.Color(224, 224, 224));
        organizationJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setGridColor(new java.awt.Color(0, 0, 0));
        organizationJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        organizationJTable.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(organizationJTable);

        jLabel3.setBackground(new java.awt.Color(224, 224, 224));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Organization");

        OrgJCB.setBackground(new java.awt.Color(224, 224, 224));
        OrgJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        OrgJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OrgJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrgJCBActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(224, 224, 224));
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        delJB.setBackground(new java.awt.Color(224, 224, 224));
        delJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delJB.setText("Delete Personnel");
        delJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(843, 843, 843)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delJB)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(889, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(107, 107, 107)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameJTextField)
                                .addComponent(OrgJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(delJB)
                .addGap(287, 287, 287)
                .addComponent(backJButton)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8)
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(OrgJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) OrgJCB.getSelectedItem();
        String name = nameJTextField.getText();

        organization.getPeopleDirectory().createPeople(name);
        populateTable(organization);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void OrgJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrgJCBActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) OrgJCB.getSelectedItem();
        if(organization!=null)
        populateTable(organization);
    }//GEN-LAST:event_OrgJCBActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void delJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delJBActionPerformed
        // TODO add your handling code here:
        int selectedrow=organizationJTable.getSelectedRow();
        Organization organization = (Organization) OrgJCB.getSelectedItem();
        if(selectedrow>=0){
            People p =(People)organizationJTable.getValueAt(selectedrow,0);
            organization.getPeopleDirectory().deletePeople(p);
            JOptionPane.showMessageDialog(null,"delete successfully");
            nameJTextField.setText("");
            populateTable(organization);
        }
    }//GEN-LAST:event_delJBActionPerformed
 private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (People people : organization.getPeopleDirectory().getPeopleList()){
            Object[] row = new Object[2];
            row[0] = people;
            row[1] = people.getName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrgJCB;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delJB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
