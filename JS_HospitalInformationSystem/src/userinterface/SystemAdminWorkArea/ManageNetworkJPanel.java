/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.HIS;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EZ
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HIS system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, HIS system) {
        initComponents();
        Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();
        model.setRowCount(0);
        
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        renameJTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        renameJB = new javax.swing.JButton();
        delnameJTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        delJB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(224, 224, 224));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        networkJTable.setAutoCreateRowSorter(true);
        networkJTable.setBackground(new java.awt.Color(224, 224, 224));
        networkJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        networkJTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setToolTipText("");
        networkJTable.setColumnSelectionAllowed(true);
        networkJTable.setGridColor(new java.awt.Color(0, 0, 0));
        networkJTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        networkJTable.setSelectionForeground(new java.awt.Color(255, 255, 102));
        networkJTable.getTableHeader().setReorderingAllowed(false);
        networkJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(networkJTable);
        networkJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (networkJTable.getColumnModel().getColumnCount() > 0) {
            networkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setBackground(getBackground());
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        submitJButton.setBackground(getBackground());
        submitJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        nameJTextField.setBackground(getBackground());
        nameJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        backJButton.setBackground(getBackground());
        backJButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(118, 138, 168));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Hospital Information System Network");

        jLabel3.setBackground(getBackground());
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Rename Selected Network:");

        jLabel4.setBackground(getBackground());
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Create New Network:");

        renameJTF.setBackground(getBackground());
        renameJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel5.setBackground(getBackground());
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("ReName");

        renameJB.setBackground(getBackground());
        renameJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        renameJB.setText("Submit");
        renameJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameJBActionPerformed(evt);
            }
        });

        delnameJTF.setEditable(false);
        delnameJTF.setBackground(getBackground());
        delnameJTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setBackground(getBackground());
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Name");

        delJB.setBackground(getBackground());
        delJB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        delJB.setText("Delete");
        delJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delJBActionPerformed(evt);
            }
        });

        jLabel7.setBackground(getBackground());
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Delete Selected Network:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(backJButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(renameJTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(delnameJTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(renameJB, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(submitJButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(delJB, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(jLabel7)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(727, 727, 727))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backJButton, delJB, renameJB, submitJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(submitJButton)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(renameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(renameJB))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delnameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(delJB))
                        .addGap(44, 44, 44)
                        .addComponent(backJButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean CheckNameFromSystem(String name){
        for(Network n:system.getNetworkList()){
            if(n.getName().equals(name)) return false;
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(name)) return false;
                for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                    if(o.getName().equals(name)) return false;
                }
            }
        }
        return true;
    }
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Boolean unique=null;
        String name = nameJTextField.getText();
        unique=CheckNameFromSystem(name);

        if(unique==true){
            Network network = system.createAndAddNetwork(name);
            populateNetworkTable();
            JOptionPane.showMessageDialog(null,"Create successfully");
            nameJTextField.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"duplicate name,change name please");
        }
        
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void renameJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameJBActionPerformed
        // TODO add your handling code here:
        int selectedrow=networkJTable.getSelectedRow();
        Boolean unique=false;
        if(selectedrow >=0){
            Network nw=(Network)networkJTable.getValueAt(selectedrow,0);
            String name =renameJTF.getText();
            unique=CheckNameFromSystem(name);
            if(unique==true){
            nw.setName(name);
            populateNetworkTable();
            JOptionPane.showMessageDialog(null,"Rename successfully");
            renameJTF.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"duplicate name,change name please");
            }
        }
        
    }//GEN-LAST:event_renameJBActionPerformed

    private void delJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delJBActionPerformed
        // TODO add your handling code here:
        int selectedrow=networkJTable.getSelectedRow();
        if(selectedrow >=0){
            Network nw=(Network)networkJTable.getValueAt(selectedrow,0);
            system.removeNetwork(nw);
            JOptionPane.showMessageDialog(null,"Delete successfully");
            populateNetworkTable();
        }
        
    }//GEN-LAST:event_delJBActionPerformed

    private void networkJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_networkJTableMouseClicked
        // TODO add your handling code here:
        int selectedrow=networkJTable.getSelectedRow();
        if(selectedrow >=0){
            Network nw=(Network)networkJTable.getValueAt(selectedrow,0);
            delnameJTF.setText(nw.getName());
        }
    }//GEN-LAST:event_networkJTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delJB;
    private javax.swing.JTextField delnameJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton renameJB;
    private javax.swing.JTextField renameJTF;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
