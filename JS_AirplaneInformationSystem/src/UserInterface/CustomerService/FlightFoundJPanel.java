/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import Business.Flight;
import Business.TicketDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author yizhe
 */
public class FlightFoundJPanel extends javax.swing.JPanel {

    /**
     * Creates new form flightsfoundjpanel
     */
    private JPanel CardSequenceJPanel;
    private Flight flight;
    private TicketDirectory td;
    private String username;
    public FlightFoundJPanel(JPanel CardSequenceJPanel,Flight flight,TicketDirectory td,String username) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.flight=flight;
        this.td=td;
        this.username=username;
        JLflightno.setText(flight.getFlightNum());
        populate();
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
        btnBooking = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JLflightno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewJTB = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        JCBticket = new javax.swing.JComboBox<>();
        btnChoose = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Flight Found");

        btnBooking.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBooking.setText("Click for Booking");
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("The Ideal Flight is :");

        JLflightno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLflightno.setText("Flight Number");

        ViewJTB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ViewJTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Window(L)", "Middle", "Aisle", "Aisle", "Middle", "Window(R)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewJTB);
        if (ViewJTB.getColumnModel().getColumnCount() > 0) {
            ViewJTB.getColumnModel().getColumn(0).setResizable(false);
            ViewJTB.getColumnModel().getColumn(1).setResizable(false);
            ViewJTB.getColumnModel().getColumn(2).setResizable(false);
            ViewJTB.getColumnModel().getColumn(3).setResizable(false);
            ViewJTB.getColumnModel().getColumn(4).setResizable(false);
            ViewJTB.getColumnModel().getColumn(5).setResizable(false);
            ViewJTB.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("A-K : First Class  ,  L-Y : Economy Class");

        JCBticket.setSelectedIndex(-1);

        btnChoose.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnChoose.setText("Choose Seat");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(33, 33, 33)
                            .addComponent(JLflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(173, 173, 173)
                            .addComponent(JCBticket, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnChoose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLflightno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBooking)
                    .addComponent(jButton2)
                    .addComponent(btnChoose))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        try{
            int sr=ViewJTB.getSelectedRow();
            int sc=ViewJTB.getSelectedColumn();
            if(ViewJTB.getValueAt(sr, sc).equals("0")){
                JOptionPane.showMessageDialog(null,"this is unavailable,choose again");
            }else{
 
                String x=String.valueOf(JCBticket.getSelectedItem());
                JOptionPane.showMessageDialog(null,"selected successfully!!");
                FlightDetailJPanel fdjp=new FlightDetailJPanel(CardSequenceJPanel,flight,x,td,username);
                CardSequenceJPanel.add(fdjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"click table to choose!");
        }
    }//GEN-LAST:event_btnBookingActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
        try{
            int sr=ViewJTB.getSelectedRow();
            int sc=ViewJTB.getSelectedColumn();
            flight.setSeat(sr,sc-1);
            String seatNo=(char)(sr+65)+String.valueOf(sc);
            JCBticket.setSelectedItem(seatNo);
            JCBticket.setEnabled(false);
            JOptionPane.showMessageDialog(null,"choose successfully!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"click table to choose!");
        }
    }//GEN-LAST:event_btnChooseActionPerformed
    
    public void populate(){
        String[][] a =flight.getSeat();
        for(int i=0;i<25;i++){
            for(int j=0;j<6;j++){
                ViewJTB.setValueAt(a[i][j], i, j+1);
                char cc=(char)(65+i);
                String ccc=cc+String.valueOf(j+1);
                JCBticket.addItem(ccc);
            }
        }
        for(int k=0;k<25;k++){
            char c=(char)(65+k);
            ViewJTB.setValueAt(c, k, 0);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBticket;
    private javax.swing.JLabel JLflightno;
    private javax.swing.JTable ViewJTB;
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
