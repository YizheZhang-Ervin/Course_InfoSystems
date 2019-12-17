/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerService;

import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightSchedule;
import Business.TicketDirectory;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yizhe
 */
public class ManageMasterFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMasterFlightScheduleJPanel
     */
    private JPanel CardSequenceJPanel;
    private AirlinerDirectory airlinerdirectory;
    private FlightSchedule fs;
    private Flight flight;
    private TicketDirectory td;
    private String username;
    private JButton btnLogout;
    
    public ManageMasterFlightScheduleJPanel(JPanel CardSequenceJPanel,AirlinerDirectory airlinerdirectory,FlightSchedule fs,TicketDirectory td,String username,JButton btnLogout) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.airlinerdirectory=airlinerdirectory;
        this.fs=fs;
        this.td=td;
        this.username=username;
        this.btnLogout=btnLogout;
        
        CardSequenceJPanel.removeAll();
        try{
        populate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"agency didn't organize any flights for customers");
            btnSearchinJTB.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBflights = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        flightnoTF = new javax.swing.JTextField();
        deptLocTF = new javax.swing.JTextField();
        arrivalLocTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        timeJCB = new javax.swing.JComboBox<>();
        JCBairliner = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnChoose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSearchinJTB = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        btnSearch3 = new javax.swing.JButton();
        btnSearch4 = new javax.swing.JButton();
        dateTF1 = new javax.swing.JTextField();
        dateTF2 = new javax.swing.JTextField();
        btnMVsearch = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Flight number");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Departure location");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Arrival location");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Preferred time of day");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("DepartureDate");

        btnSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        JTBflights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight", "Dept", "Arrival"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTBflights);
        if (JTBflights.getColumnModel().getColumnCount() > 0) {
            JTBflights.getColumnModel().getColumn(0).setResizable(false);
            JTBflights.getColumnModel().getColumn(1).setResizable(false);
            JTBflights.getColumnModel().getColumn(2).setResizable(false);
            JTBflights.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Flights Schedule");

        flightnoTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        flightnoTF.setForeground(java.awt.Color.lightGray);
        flightnoTF.setText("xx000");

        deptLocTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deptLocTF.setForeground(java.awt.Color.lightGray);
        deptLocTF.setText("LA");
        deptLocTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptLocTFActionPerformed(evt);
            }
        });

        arrivalLocTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        arrivalLocTF.setForeground(java.awt.Color.lightGray);
        arrivalLocTF.setText("PVG");

        dateTF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateTF.setForeground(java.awt.Color.lightGray);
        dateTF.setText("YYYY");

        timeJCB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        timeJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "morning", "day time", "evening" }));
        timeJCB.setSelectedIndex(-1);

        JCBairliner.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JCBairliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBairlinerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Airliners:");

        jSeparator1.setForeground(java.awt.Color.black);

        btnChoose.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Directly Search");

        btnSearchinJTB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearchinJTB.setText("Search");
        btnSearchinJTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchinJTBActionPerformed(evt);
            }
        });

        btnSearch1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnSearch2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        btnSearch3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch3.setText("Search");
        btnSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch3ActionPerformed(evt);
            }
        });

        btnSearch4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSearch4.setText("Search");
        btnSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch4ActionPerformed(evt);
            }
        });

        dateTF1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateTF1.setForeground(java.awt.Color.lightGray);
        dateTF1.setText("MM");

        dateTF2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateTF2.setForeground(java.awt.Color.lightGray);
        dateTF2.setText("DD");

        btnMVsearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMVsearch.setText("Muti-Value Search");
        btnMVsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMVsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(timeJCB, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dateTF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSearch2)
                                            .addComponent(btnSearch3)
                                            .addComponent(btnSearch4)
                                            .addComponent(btnSearch1)
                                            .addComponent(btnSearch)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnMVsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(flightnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(arrivalLocTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deptLocTF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(JCBairliner, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnSearchinJTB)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnChoose))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCBairliner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchinJTB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChoose))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(btnMVsearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(deptLocTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(arrivalLocTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timeJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch4)
                    .addComponent(dateTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(329, 329, 329))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
                
                if(f.getFlightNum().equals(flightnoTF.getText())) {JOptionPane.showMessageDialog(null,"Found it by FlightNumber");flight=f;break;}
                
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void deptLocTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptLocTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptLocTFActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        // TODO add your handling code here:
        int selectedRow=JTBflights.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from table for details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Flight flight=(Flight)JTBflights.getValueAt(selectedRow,0);
            FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
            CardSequenceJPanel.add(ffjp);
            CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        }
        
        
    }//GEN-LAST:event_btnChooseActionPerformed

    private void JCBairlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBairlinerActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_JCBairlinerActionPerformed

    private void btnSearchinJTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchinJTBActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm =(DefaultTableModel)JTBflights.getModel();
        dtm.setRowCount(0);
        for(Flight f: fs.getFilterflightschedule())
        {
            if(f.getAirliner().equals(JCBairliner.getSelectedItem().toString())){
                Object row[]=new Object[4];
                row[0]=f;
                row[1]=f.getFlightNum();
                row[2]=f.getDepartLoc();
                row[3]=f.getArrivalLoc();

                dtm.addRow(row);
            }
        }
        
    }//GEN-LAST:event_btnSearchinJTBActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
               
                if(f.getDepartLoc().equals(deptLocTF.getText())) {JOptionPane.showMessageDialog(null,"Found it by Department Location");flight=f;break;}
                
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
               
                if(f.getArrivalLoc().equals(arrivalLocTF.getText())) {JOptionPane.showMessageDialog(null,"Found it by Arrival Location");flight=f;break;}
                
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch3ActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
                
                if(f.getTimePeriod().equals(timeJCB.getSelectedItem())) {JOptionPane.showMessageDialog(null,"Found it by Time Period");flight=f;break;}
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
    }//GEN-LAST:event_btnSearch3ActionPerformed

    private void btnSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch4ActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
                String x= f.getDeptDate().substring(0,4)+f.getDeptDate().substring(5,7)+f.getDeptDate().substring(8,10);
                
                if(x.equals(dateTF.getText()+dateTF1.getText()+dateTF2.getText())) {JOptionPane.showMessageDialog(null,"Found it by Department Date");flight=f;break;}
                
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
    }//GEN-LAST:event_btnSearch4ActionPerformed

    private void btnMVsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMVsearchActionPerformed
        // TODO add your handling code here:
        try{
            for(Flight f:fs.getFilterflightschedule()){
                Boolean case1=f.getFlightNum().equals(flightnoTF.getText());
                Boolean case2=f.getDepartLoc().equals(deptLocTF.getText());
                Boolean case3=f.getArrivalLoc().equals(arrivalLocTF.getText());
                Boolean case4=f.getTimePeriod().equals(timeJCB.getSelectedItem());
                String x= f.getDeptDate().substring(0,4)+f.getDeptDate().substring(5,7)+f.getDeptDate().substring(8,10);  
                Boolean case5=x.equals(dateTF.getText()+dateTF1.getText()+dateTF2.getText());        
                
                if(case1 &&case2&&case3&&case4&&case5) {
                    JOptionPane.showMessageDialog(null,"Found it by Multi-Value");flight=f;break;
                    }
                
            }
            if(flight!=null){
                FlightFoundJPanel ffjp=new FlightFoundJPanel(CardSequenceJPanel,flight,td,username);
                CardSequenceJPanel.add(ffjp);
                CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                layout.next(CardSequenceJPanel);  
            }else{
                JOptionPane.showMessageDialog(null,"no Eligible flights");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"please enter requirement");
        }
    }//GEN-LAST:event_btnMVsearchActionPerformed

    public void populate(){
        DefaultTableModel dtm =(DefaultTableModel)JTBflights.getModel();
        dtm.setRowCount(0);
        for(Flight f: fs.getFilterflightschedule())
        {
            Object row[]=new Object[4];
            row[0]=f;
            row[1]=f.getFlightNum();
            row[2]=f.getDepartLoc();
            row[3]=f.getArrivalLoc();
            
            dtm.addRow(row);
            
        }
        
        for(Flight f:fs.getFlightschedule()){
            JCBairliner.addItem(f);
        }
        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> JCBairliner;
    private javax.swing.JTable JTBflights;
    private javax.swing.JTextField arrivalLocTF;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnMVsearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JButton btnSearch4;
    private javax.swing.JButton btnSearchinJTB;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField dateTF1;
    private javax.swing.JTextField dateTF2;
    private javax.swing.JTextField deptLocTF;
    private javax.swing.JTextField flightnoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> timeJCB;
    // End of variables declaration//GEN-END:variables
}
