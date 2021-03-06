/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositwithdraw;

import java.util.*;

/**
 *
 * @author Armagnus
 */
public class PaymentList extends javax.swing.JFrame {

    /**
     * Creates new form PaymentList
     */
    public PaymentList() {
        initComponents();
        setLocationRelativeTo(null);
    }
    int xMouse;
    int yMouse;
    String accname;
    int accnum;
    String paymentlim;
    double accbalance;
    
    public void setAccname(String saccname){
        accname = saccname;
    }
    public void setAccnum(int saccnum){
        accnum = saccnum;
    }
    public void setBalance(double saccbalance){
        accbalance = saccbalance;
    }
    String setpayment(int uplim,int downlim) {
        Random rand = new Random();
        double paymentset = rand.nextInt(uplim) + downlim;
        this.paymentlim = Double.toString(paymentset);
        return paymentlim;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Lists = new javax.swing.JLabel();
        PDAM = new javax.swing.JButton();
        PGN = new javax.swing.JButton();
        PLN = new javax.swing.JButton();
        PLNToken = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(20, 70, 50));

        jPanel1.setBackground(new java.awt.Color(242, 181, 55));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Welcome to ATM Simulator");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("-");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("PAYMENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Lists.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lists.setForeground(new java.awt.Color(250, 250, 250));
        Lists.setText("Company Lists:");

        PDAM.setText("PT. PDAM Indonesia");
        PDAM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PDAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDAMActionPerformed(evt);
            }
        });

        PGN.setText("PT. PGN Indonesia");
        PGN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PGN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGNActionPerformed(evt);
            }
        });

        PLN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PLN.setLabel("PT. PLN");
        PLN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLNActionPerformed(evt);
            }
        });

        PLNToken.setText("PT. PLN (Electricity Token)");
        PLNToken.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PLNToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLNTokenActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Please choose one of the companies to continue");

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Lists, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PDAM, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(PGN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PLNToken, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(Lists)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PDAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PGN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PLN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PLNToken)
                .addGap(18, 18, 18)
                .addComponent(Cancel)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLNActionPerformed
        PaymentConfirm second = new PaymentConfirm();
        String command = evt.getActionCommand();
        double pay = Double.parseDouble(setpayment(100000,200000));
        second.setFormat(accbalance, pay);
        second.setAccname(accname);
        second.setAccnum(accnum);
        second.setBalance(accbalance);
        second.setPay(pay);
        Random rand = new Random();
        int paymentcodee = rand.nextInt(999999999) + 100000000;
        String paymentcodee2 = Integer.toString(paymentcodee);
        PaymentConfirm.company.setText(this.PLN.getText());
        PaymentConfirm.setfieldp.setText(paymentcodee2);
        setLocationRelativeTo(null);
        second.setVisible(true);
        this.dispose();
        if(command.equals("LEFTMOUSECLICK"))
        {
            PLN.setEnabled(false);
        }
    }//GEN-LAST:event_PLNActionPerformed

    private void PDAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDAMActionPerformed
        PaymentConfirm second = new PaymentConfirm();
        String command = evt.getActionCommand();
        double pay = Double.parseDouble(setpayment(200000,300000));
        second.setFormat(accbalance, pay);
        second.setAccname(accname);
        second.setAccnum(accnum);
        second.setBalance(accbalance);
        second.setPay(pay);
        Random rand = new Random();
        int paymentcodee = rand.nextInt(999999999) + 100000000;
        String paymentcodee2 = Integer.toString(paymentcodee);
        PaymentConfirm.company.setText(this.PDAM.getText());
        PaymentConfirm.setfieldp.setText(paymentcodee2);
        setLocationRelativeTo(null);
        second.setVisible(true);
        this.dispose();
        if(command.equals("LEFTMOUSECLICK"))
        {
            PDAM.setEnabled(false);
        }
    }//GEN-LAST:event_PDAMActionPerformed

    private void PGNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGNActionPerformed
        PaymentConfirm second = new PaymentConfirm();
        String command = evt.getActionCommand();
        double pay = Double.parseDouble(setpayment(3500000,5999999));
        second.setFormat(accbalance, pay);
        second.setAccname(accname);
        second.setAccnum(accnum);
        second.setBalance(accbalance);
        second.setPay(pay);
        
        Random rand = new Random();
        int paymentcodee = rand.nextInt(999999999) + 100000000;
        String paymentcodee2 = Integer.toString(paymentcodee);
        PaymentConfirm.company.setText(this.PGN.getText());
        PaymentConfirm.setfieldp.setText(paymentcodee2);
        setLocationRelativeTo(null);
        second.setVisible(true);
        this.dispose();
        if(command.equals("LEFTMOUSECLICK"))
        {
            PGN.setEnabled(false);
        }
    }//GEN-LAST:event_PGNActionPerformed

    private void PLNTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLNTokenActionPerformed
        PaymentConfirm second = new PaymentConfirm();
        String command = evt.getActionCommand();
        double pay = Double.parseDouble(setpayment(600000,900000));
        second.setFormat(accbalance, pay);
        second.setAccname(accname);
        second.setAccnum(accnum);
        second.setBalance(accbalance);
        second.setPay(pay);
        
        Random rand = new Random();
        int paymentcodee = rand.nextInt(999999999) + 100000000;
        String paymentcodee2 = Integer.toString(paymentcodee);
        PaymentConfirm.company.setText(this.PLNToken.getText());
        PaymentConfirm.setfieldp.setText(paymentcodee2);
        setLocationRelativeTo(null);
        second.setVisible(true);
        this.dispose();
        if(command.equals("LEFTMOUSECLICK"))
        {
            PLNToken.setEnabled(false);
        }
    }//GEN-LAST:event_PLNTokenActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        Interface inf = new Interface();
        inf.setName(accname);
        inf.setLogged(accnum);
        inf.setBalance(accbalance);
        inf.setFormat(accbalance);
        inf.setVisible(true);
        inf.pack();
        inf.setLocationRelativeTo(null);
        inf.setDefaultCloseOperation(LoginForm.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation((x-xMouse),(y-yMouse));
    }//GEN-LAST:event_jPanel1MouseDragged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Lists;
    public javax.swing.JButton PDAM;
    public javax.swing.JButton PGN;
    public javax.swing.JButton PLN;
    public javax.swing.JButton PLNToken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
