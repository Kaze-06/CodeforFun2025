package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JFrame {

    private Attribute account;

    public Menu() {
        initComponents();
        account = new Attribute();
        //Pangalan na may hi
        String customername = account.getCustomername();
        JNAMECLIENT.setText(String.format("Hi, " + customername + "!"));

        //CLIENT PROFILE
        account.setCustomername("Jedidiah Sean Dave M. Davila");
        String customerfullname = account.getCustomername();
       JFULLN.setText(String.format(customerfullname));
        
        String id = account.getId();
        JID.setText(String.format(id));

        String email = account.getEmail();
        JE.setText(String.format(email));
        
        String phone = account.getPhonenum();
        JP.setText(String.format(phone));
        //Balanse ng monemoneyey
        double balance = account.getBalance();
        JBALANCE.setText(String.format("%.2f", balance));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPANELBG = new javax.swing.JPanel();
        JNAMECLIENT = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTABLEBALANCE = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JFULLN = new javax.swing.JTextField();
        JP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JDEPOSIT = new javax.swing.JButton();
        JWITHDRAW = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JBALANCE = new javax.swing.JTextField();
        JAMOUNT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPANELBG.setBackground(new java.awt.Color(246, 243, 247));

        JNAMECLIENT.setEditable(false);
        JNAMECLIENT.setBackground(new java.awt.Color(246, 243, 247));
        JNAMECLIENT.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JNAMECLIENT.setAutoscrolls(false);
        JNAMECLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JNAMECLIENTMouseClicked(evt);
            }
        });
        JNAMECLIENT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JNAMECLIENTKeyTyped(evt);
            }
        });

        jTabbedPane2.setBackground(new java.awt.Color(184, 216, 254));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 0));

        JTABLEBALANCE.setBackground(new java.awt.Color(255, 255, 255));
        JTABLEBALANCE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Activity", "Amount", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTABLEBALANCE.getTableHeader().setReorderingAllowed(false);
        JTABLEBALANCE.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTABLEBALANCEAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(JTABLEBALANCE);
        if (JTABLEBALANCE.getColumnModel().getColumnCount() > 0) {
            JTABLEBALANCE.getColumnModel().getColumn(0).setResizable(false);
            JTABLEBALANCE.getColumnModel().getColumn(1).setResizable(false);
            JTABLEBALANCE.getColumnModel().getColumn(2).setResizable(false);
            JTABLEBALANCE.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Transactions", jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JFULLN.setEditable(false);
        JFULLN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JFULLN.setAutoscrolls(false);
        JFULLN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFULLNMouseClicked(evt);
            }
        });
        JFULLN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JFULLNKeyTyped(evt);
            }
        });

        JP.setEditable(false);
        JP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JP.setAutoscrolls(false);
        JP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPMouseClicked(evt);
            }
        });
        JP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Full name");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Phone Number");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Account Number");

        JID.setEditable(false);
        JID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JID.setAutoscrolls(false);
        JID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JIDMouseClicked(evt);
            }
        });
        JID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JIDKeyTyped(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Email");

        JE.setEditable(false);
        JE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JE.setAutoscrolls(false);
        JE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JEMouseClicked(evt);
            }
        });
        JE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JFULLN, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JE, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JFULLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("Client profile", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JDEPOSIT.setBackground(new java.awt.Color(255, 255, 255));
        JDEPOSIT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JDEPOSIT.setForeground(new java.awt.Color(102, 102, 102));
        JDEPOSIT.setText("Deposit");
        JDEPOSIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDEPOSITActionPerformed(evt);
            }
        });

        JWITHDRAW.setBackground(new java.awt.Color(255, 255, 255));
        JWITHDRAW.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JWITHDRAW.setForeground(new java.awt.Color(102, 102, 102));
        JWITHDRAW.setText("Withdraw");
        JWITHDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JWITHDRAWActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(184, 216, 254));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentHidden(evt);
            }
        });

        JBALANCE.setEditable(false);
        JBALANCE.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        JBALANCE.setAutoscrolls(false);
        JBALANCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBALANCEMouseClicked(evt);
            }
        });
        JBALANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBALANCEActionPerformed(evt);
            }
        });
        JBALANCE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JBALANCEKeyTyped(evt);
            }
        });
        jTabbedPane1.addTab("Total balance", JBALANCE);

        JAMOUNT.setBackground(new java.awt.Color(184, 216, 254));
        JAMOUNT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JAMOUNT.setForeground(new java.awt.Color(255, 255, 255));
        JAMOUNT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JAMOUNTMouseClicked(evt);
            }
        });
        JAMOUNT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JAMOUNTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(JWITHDRAW)
                        .addGap(30, 30, 30)
                        .addComponent(JDEPOSIT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JWITHDRAW, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JDEPOSIT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JAMOUNT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("JDK.BANK");

        javax.swing.GroupLayout JPANELBGLayout = new javax.swing.GroupLayout(JPANELBG);
        JPANELBG.setLayout(JPANELBGLayout);
        JPANELBGLayout.setHorizontalGroup(
            JPANELBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANELBGLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPANELBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPANELBGLayout.createSequentialGroup()
                        .addComponent(jTabbedPane2)
                        .addContainerGap())
                    .addGroup(JPANELBGLayout.createSequentialGroup()
                        .addGroup(JPANELBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPANELBGLayout.createSequentialGroup()
                                .addComponent(JNAMECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        JPANELBGLayout.setVerticalGroup(
            JPANELBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANELBGLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(JPANELBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JNAMECLIENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPANELBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPANELBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDEPOSITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDEPOSITActionPerformed
        String amount = JAMOUNT.getText();

        if (amount.matches("^[0-9]*\\.?[0-9]+$")) {
            double numericAmount = Double.parseDouble(amount);
            if (numericAmount > 0) {
                double newBalance = account.getBalance() + numericAmount;
                account.setBalance(newBalance);

                System.out.println("Deposit of " + numericAmount + " made. New balance = " + newBalance);

                // Format of Date & Time 
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

                // Conversion
                LocalDateTime currentTime = LocalDateTime.now(); // Get current date and time
                String Date = currentTime.format(dateFormatter); // Format the current date
                String Time = currentTime.format(timeFormatter); // Format the current time

                DefaultTableModel model = (DefaultTableModel) JTABLEBALANCE.getModel();
                model.addRow(new Object[]{"               Deposit",
                    "              +" + numericAmount,
                    "             " + Date,
                    "               " + Time});
                JBALANCE.setText(String.format("%.2f", newBalance));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JDEPOSITActionPerformed

    private void jTabbedPane1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentHidden

    private void JWITHDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JWITHDRAWActionPerformed
        String amount = JAMOUNT.getText();

        if (amount.matches("^[0-9]*\\.?[0-9]+$")) {
            float numericAmount = Float.parseFloat(amount);
            if (numericAmount > 0) {
                double currentBalance = account.getBalance();

                if (numericAmount <= currentBalance) {
                    double newBalance = currentBalance - numericAmount;
                    account.setBalance(newBalance);

                    System.out.println("Withdrawal of " + numericAmount + " proceed, Remaining balance = " + newBalance);
                    // Format of Date & Time 
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");

                    // Conversion
                    LocalDateTime currentTime = LocalDateTime.now(); // Get current date and time
                    String Date = currentTime.format(dateFormatter); // Format the current date
                    String Time = currentTime.format(timeFormatter); // Format the current time

                    DefaultTableModel model = (DefaultTableModel) JTABLEBALANCE.getModel();
                    model.addRow(new Object[]{"              Withdraw",
                        "              -" + numericAmount,
                        "             " + Date,
                        "               " + Time});
                    JBALANCE.setText(String.format("%.2f", newBalance));
                    JBALANCE.setText(String.format("%.2f", newBalance));
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for amount.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JWITHDRAWActionPerformed

    private void JAMOUNTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JAMOUNTKeyTyped

    }//GEN-LAST:event_JAMOUNTKeyTyped

    private void JAMOUNTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JAMOUNTMouseClicked
//JAMOUNT.removeAll();
    }//GEN-LAST:event_JAMOUNTMouseClicked

    private void JTABLEBALANCEAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTABLEBALANCEAncestorAdded

    }//GEN-LAST:event_JTABLEBALANCEAncestorAdded

    private void JBALANCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBALANCEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBALANCEMouseClicked

    private void JBALANCEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JBALANCEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JBALANCEKeyTyped

    private void JNAMECLIENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JNAMECLIENTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JNAMECLIENTMouseClicked

    private void JNAMECLIENTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JNAMECLIENTKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JNAMECLIENTKeyTyped

    private void JBALANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBALANCEActionPerformed
        /* Attribute account = new Attribute(); // shared instance
        double balance = account.getBalance();
        JBALANCE.setText(String.format("%.2f", balance));
         */
    }//GEN-LAST:event_JBALANCEActionPerformed

    private void JFULLNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JFULLNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JFULLNMouseClicked

    private void JFULLNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JFULLNKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JFULLNKeyTyped

    private void JPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JPMouseClicked

    private void JPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JPKeyTyped

    private void JIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JIDMouseClicked

    private void JIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JIDKeyTyped

    private void JEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JEMouseClicked

    private void JEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JEKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JAMOUNT;
    private javax.swing.JTextField JBALANCE;
    private javax.swing.JButton JDEPOSIT;
    private javax.swing.JTextField JE;
    private javax.swing.JTextField JFULLN;
    private javax.swing.JTextField JID;
    private javax.swing.JTextField JNAMECLIENT;
    private javax.swing.JTextField JP;
    private javax.swing.JPanel JPANELBG;
    private javax.swing.JTable JTABLEBALANCE;
    private javax.swing.JButton JWITHDRAW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
