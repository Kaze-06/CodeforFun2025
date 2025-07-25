package studentrecord;

import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class RECORD extends javax.swing.JFrame {

    public RECORD() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JTXTSR = new javax.swing.JLabel();
        UPDATEBUTTON = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        JPANELINS = new javax.swing.JPanel();
        JTYPENAME = new javax.swing.JTextField();
        JSELPROG = new javax.swing.JComboBox<>();
        JSELYEAR = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JPROG = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JCLEARBUTTON = new javax.swing.JButton();
        JADDBUTTON = new javax.swing.JButton();
        ENGLISHTXT = new javax.swing.JTextField();
        MATHTXT = new javax.swing.JTextField();
        SCIENCETXT = new javax.swing.JTextField();
        JSELSEC = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JRECORD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(53, 64, 142));

        jPanel3.setBackground(new java.awt.Color(255, 215, 28));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STUDENT RECORD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        JTXTSR.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        JTXTSR.setForeground(new java.awt.Color(255, 255, 255));
        JTXTSR.setText("NATIONAL UNIVERSITY");

        UPDATEBUTTON.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        UPDATEBUTTON.setText("↻");
        UPDATEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEBUTTONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(JTXTSR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UPDATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTXTSR)
                    .addComponent(UPDATEBUTTON))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JTYPENAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTYPENAMEActionPerformed(evt);
            }
        });

        JSELPROG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select a Program-", "GAS - General Academic Strand", "HUMSS - Humanity in Social Sciences", "STEM - Science Technology Engineering and Mathematic", "ICT - Information and Communication Technology" }));
        JSELPROG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSELPROGActionPerformed(evt);
            }
        });

        JSELYEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSELYEARActionPerformed(evt);
            }
        });

        jLabel1.setText("Student Name");

        jLabel2.setText("Program");

        JPROG.setText("Year");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("English");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Math");

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Science");

        JCLEARBUTTON.setText("CLEAR");
        JCLEARBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCLEARBUTTONActionPerformed(evt);
            }
        });

        JADDBUTTON.setText("ADD");
        JADDBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JADDBUTTONActionPerformed(evt);
            }
        });

        ENGLISHTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENGLISHTXTActionPerformed(evt);
            }
        });

        MATHTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATHTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MATHTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(ENGLISHTXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SCIENCETXT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(JCLEARBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(JADDBUTTON)
                        .addGap(29, 29, 29))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ENGLISHTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MATHTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SCIENCETXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCLEARBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        JSELSEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSELSECActionPerformed(evt);
            }
        });

        jLabel8.setText("Section");

        javax.swing.GroupLayout JPANELINSLayout = new javax.swing.GroupLayout(JPANELINS);
        JPANELINS.setLayout(JPANELINSLayout);
        JPANELINSLayout.setHorizontalGroup(
            JPANELINSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPANELINSLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(JPANELINSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JPROG)
                    .addComponent(jLabel2)
                    .addGroup(JPANELINSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JTYPENAME)
                        .addComponent(JSELPROG, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JSELYEAR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JSELSEC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        JPANELINSLayout.setVerticalGroup(
            JPANELINSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPANELINSLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPANELINSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPANELINSLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTYPENAME, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSELPROG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPROG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSELYEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JSELSEC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Layout", JPANELINS);

        JRECORD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Program", "Section", "English", "Math", "Science", "GWA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JRECORD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JRECORDMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JRECORDMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JRECORD);
        if (JRECORD.getColumnModel().getColumnCount() > 0) {
            JRECORD.getColumnModel().getColumn(0).setResizable(false);
            JRECORD.getColumnModel().getColumn(1).setResizable(false);
            JRECORD.getColumnModel().getColumn(2).setResizable(false);
            JRECORD.getColumnModel().getColumn(3).setResizable(false);
            JRECORD.getColumnModel().getColumn(4).setResizable(false);
            JRECORD.getColumnModel().getColumn(5).setResizable(false);
            JRECORD.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane2.addTab("Record", jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTYPENAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTYPENAMEActionPerformed

    }//GEN-LAST:event_JTYPENAMEActionPerformed

    // This method writes the table's data back to the notepad file
    private void updateNotepadFromTable() {
        // Get the data from the table
        DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();
        StringBuilder sb = new StringBuilder();

        // Iterate through the rows and columns of the table
        for (int row = 0; row < model.getRowCount(); row++) {
            String name = (String) model.getValueAt(row, 0);
            String program = (String) model.getValueAt(row, 1);
            String section = (String) model.getValueAt(row, 2);
            String english = (String) model.getValueAt(row, 3);
            String math = (String) model.getValueAt(row, 4);
            String science = (String) model.getValueAt(row, 5);
            String gwa = (String) model.getValueAt(row, 6);

            // Format the data as needed for the notepad file
            sb.append("Name: ").append(name).append(", ")
                    .append("Program: ").append(program).append(", ")
                    .append("Section: ").append(section).append(", ")
                    .append("English: ").append(english).append(", ")
                    .append("Math: ").append(math).append(", ")
                    .append("Science: ").append(science).append(", ")
                    .append("GWA: ").append(gwa).append("\n");
        }

        // Now write the updated data to the notepad file
        try {
            String path = "C:\\Users\\jedid\\OneDrive\\Documents\\Notedata.txt";
            FileWriter writer = new FileWriter(path);
            writer.write(sb.toString()); // Write the updated data to the file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void JRECORDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRECORDMouseClicked

        // Check if it's a right-click (button 3)
        if (evt.getButton() == MouseEvent.BUTTON3) {
            // Get the row where the mouse was clicked
            int row = JRECORD.rowAtPoint(evt.getPoint());
            if (row >= 0) {
                JRECORD.setRowSelectionInterval(row, row); // Select the row on right-click
                // Confirmation dialog
                Object[] options = {"YES", "NO"};
                int choice = JOptionPane.showOptionDialog(this,
                        "Are you sure you want to delete this record?",
                        "Delete record",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, options, options[0]);
                if (choice == JOptionPane.YES_OPTION) {
                    // Delete selected record
                    DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();
                    model.removeRow(row); // Remove the row from the model

                    // After deleting, update the notepad file
                    updateNotepadFromTable();
                }
            }
        }


    }//GEN-LAST:event_JRECORDMouseClicked


    private void JSELPROGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSELPROGActionPerformed

        // Check if an item is selected
        Object selectedProgramObj = JSELPROG.getSelectedItem();

        // If no item is selected, handle it accordingly
        if (selectedProgramObj == null) {
            System.out.println("No program selected!");
            return; // exit the method early to avoid null pointer exception
        }

        // Convert selected item to string
        String selectedProgram = selectedProgramObj.toString();

        // Clear previous year and section items
        JSELYEAR.removeAllItems();
        JSELSEC.removeAllItems();

        // Add years based on the selected program
        switch (selectedProgram) {
            case "GAS - General Academic Strand":
                JSELYEAR.addItem("11th grade");
                JSELYEAR.addItem("12th grade");
                break;
            case "HUMSS - Humanity in Social Sciences":
                JSELYEAR.addItem("11th grade");
                JSELYEAR.addItem("12th grade");
                break;
            case "STEM - Science Technology Engineering and Mathematic":
                JSELYEAR.addItem("11th grade");
                JSELYEAR.addItem("12th grade");
                break;
            case "ICT - Information and Communication Technology":
                JSELYEAR.addItem("11th grade");
                JSELYEAR.addItem("12th grade");
                break;
            default:
                JSELYEAR.addItem("-Select a Year level-");
                break;
        }
    }//GEN-LAST:event_JSELPROGActionPerformed

    private void JADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JADDBUTTONActionPerformed

        String name = JTYPENAME.getText();

        // Check if the selected item in the combo boxes is null
        String selectedProg = (String) JSELPROG.getSelectedItem();
        String selectedSec = (String) JSELSEC.getSelectedItem();

        // First, get the text from the text fields
        String englishScoreText = ENGLISHTXT.getText();
        String mathScoreText = MATHTXT.getText();
        String scienceScoreText = SCIENCETXT.getText();

        // Initialize variables to hold the actual scores, assuming "0" if blank
        String englishScore = "0", mathScore = "0", scienceScore = "0";
        // Counter for valid scores
        float valid = 3;

        // Validation regex for grade format (either two digits or a float like 97.5, 99.9)
        String gradeRegex = "^(?:[0-9]{1,2}(?:\\.\\d{1})?)$";  // Matches numbers between 0-99 or 0-99.9

        // Check if each score is not empty or null, and validate format
        if (englishScoreText != null && !englishScoreText.isEmpty()) {
            if (englishScoreText.matches(gradeRegex)) {
                float score = Float.parseFloat(englishScoreText);
                if (score <= 99) {
                    englishScore = englishScoreText;  // Store the score if valid
                } else {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for English (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please input a valid grade for English (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (mathScoreText != null && !mathScoreText.isEmpty()) {
            if (mathScoreText.matches(gradeRegex)) {
                float score = Float.parseFloat(mathScoreText);
                if (score <= 99) {
                    mathScore = mathScoreText;  // Store the score if valid
                } else {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for Math (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please input a valid grade for Math (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        if (scienceScoreText != null && !scienceScoreText.isEmpty()) {
            if (scienceScoreText.matches(gradeRegex)) {
                float score = Float.parseFloat(scienceScoreText);
                if (score <= 99) {
                    scienceScore = scienceScoreText;  // Store the score if valid
                } else {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for Science (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please input a valid grade for Science (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Initialize float variables for computing GWA
        float englishFloat = 0f, mathFloat = 0f, scienceFloat = 0f;

        // Convert valid scores to float, otherwise treat as "INC"
        if (!englishScore.equals("0")) {
            englishFloat = Float.parseFloat(englishScore);
        }
        if (!mathScore.equals("0")) {
            mathFloat = Float.parseFloat(mathScore);
        }
        if (!scienceScore.equals("0")) {
            scienceFloat = Float.parseFloat(scienceScore);
        }

        if (name.isEmpty() || selectedProg.equals("-Select a Program-")) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields before proceeding.", "Try again", JOptionPane.ERROR_MESSAGE);
            return; // Exit early if any required field is missing
        } // Validate name format (allows letters, spaces, and optional middle initial with dot)
        else if (!name.matches("^[A-Za-z]+(?: [A-Za-z]+(?: [A-Za-z]+)*| [A-Za-z]\\\\.)+$")) {
            JOptionPane.showMessageDialog(this, "Please input a correct name. Only letters, spaces, and a dot for middle initials are allowed.", "Try again", JOptionPane.ERROR_MESSAGE);
            return; // Exit early if name is invalid
        } // Proceed with valid input
        else if (valid > 0 && !selectedProg.equals("-Select a Program-") && name.matches("^[A-Za-z]+(?: [A-Za-z]+(?: [A-Za-z]+)*| [A-Za-z]\\\\.)+$")) {
            float sum = englishFloat + mathFloat + scienceFloat;
            float gwa = sum / valid;  // Divide by the number of valid scores

            // Add the student's record to the table
            DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();
            model.addRow(new Object[]{name, selectedProg, selectedSec, englishScore, mathScore, scienceScore, gwa});

            JOptionPane.showMessageDialog(this, "Student Record successfully!");
        }
    }//GEN-LAST:event_JADDBUTTONActionPerformed

    private void readFromNotepad() {
        try {
            String path = "C:\\Users\\jedid\\OneDrive\\Documents\\Notedata.txt";

            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();

            // Clear the table before loading new data
            model.setRowCount(0);

            // Set column headers
            model.setColumnIdentifiers(new Object[]{"Name", "Program", "Section", "English", "Math", "Science", "GWA"});

            // Read each line from the notepad and process it
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line for debugging to ensure format is as expected
                System.out.println("Processing line: " + line);

                // Check if the line is empty or malformed
                if (line.trim().isEmpty()) {
                    continue; // Skip empty lines
                }

                // Split the line by ", " (comma and space)
                String[] data = line.split(", ");

                // If the data is malformed, skip this line
                if (data.length != 7) {
                    System.out.println("Skipping malformed line: " + line);
                    continue; // Skip lines that do not have the expected number of parts
                }

                try {
                    String name = data[0].split(": ")[1].trim();
                    String program = data[1].split(": ")[1].trim();
                    String section = data[2].split(": ")[1].trim();
                    String english = data[3].split(": ")[1].trim();
                    String math = data[4].split(": ")[1].trim();
                    String science = data[5].split(": ")[1].trim();
                    String gwa = data[6].split(": ")[1].trim();

                    // Check if the student already exists in the table
                    boolean updated = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        String existingName = (String) model.getValueAt(i, 0);
                        String existingProgram = (String) model.getValueAt(i, 1);
                        String existingSection = (String) model.getValueAt(i, 2);

                        // If the record exists, update the grades and GWA
                        if (existingName.equals(name) && existingProgram.equals(program) && existingSection.equals(section)) {
                            // Remove the old record (this is where we remove the old record)
                            model.removeRow(i);

                            // Recalculate GWA
                            float englishFloat = Float.parseFloat(english);
                            float mathFloat = Float.parseFloat(math);
                            float scienceFloat = Float.parseFloat(science);
                            float gwaFloat = (englishFloat + mathFloat + scienceFloat) / 3; // Assuming equal weight for the subjects

                            // Add the updated row
                            model.insertRow(i, new Object[]{name, program, section, english, math, science, String.format("%.2f", gwaFloat)});
                            updated = true;
                            break;
                        }
                    }

                    // If the student is not found in the table, add a new row
                    if (!updated) {
                        model.addRow(new Object[]{name, program, section, english, math, science, gwa});
                    }

                } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                    System.out.println("Skipping malformed data in line: " + line);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// Call the method to read the table data from the notepad file
        readFromNotepad();
    }//GEN-LAST:event_formWindowOpened

    private void writeToNotepad(String data) {
        try {
            String path = "C:\\Users\\jedid\\OneDrive\\Documents\\Notedata.txt";
            FileWriter writer = new FileWriter(path, true); // true to append to the file
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);  // Write the data to the file
            bufferedWriter.newLine();  // Insert a newline after writing
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //save data of the table when window is closing
        //read the data on the table
        DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();
        Vector<Vector> tableData = model.getDataVector();

        // Save each row of the table to the notepad
        for (int row = 0; row < tableData.size(); row++) {
            Vector rowData = tableData.get(row);
            String name = (String) rowData.get(0);
            String selectedProg = (String) rowData.get(1);
            String selectedSec = (String) rowData.get(2);
            String englishScore = (String) rowData.get(3);
            String mathScore = (String) rowData.get(4);
            String scienceScore = (String) rowData.get(5);
            String gwa = (String) rowData.get(6);

            // Format data as a string and write it to the notepad
            String data = String.format("Name: %s, Program: %s, Section: %s, English: %s, Math: %s, Science: %s, GWA: %s",
                    name, selectedProg, selectedSec, englishScore, mathScore, scienceScore, gwa);
            writeToNotepad(data);  // Append to notepad
        }
    }//GEN-LAST:event_formWindowClosing

    private void JRECORDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JRECORDMousePressed

    }//GEN-LAST:event_JRECORDMousePressed

    private void JSELSECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSELSECActionPerformed

    }//GEN-LAST:event_JSELSECActionPerformed

    private void JSELYEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSELYEARActionPerformed
        // Get the selected program
        Object selectedprogObj = JSELPROG.getSelectedItem();
        // Get the selected year
        Object selectedYearObj = JSELYEAR.getSelectedItem();

        // Check if either selected program or selected year is null
        if (selectedprogObj == null || selectedYearObj == null) {
            System.out.println("No program or year selected!");
            return; // exit the method early to avoid null pointer exception
        }

        // Convert selected program and selected year to strings
        String selectedprog = selectedprogObj.toString();
        String selectedyear = selectedYearObj.toString();

        // Clear previous section items
        JSELSEC.removeAllItems();

        // Add sections based on the selected program and year
        switch (selectedprog) {
            case "GAS - General Academic Strand":
                if (selectedyear.equals("11th grade")) {
                    JSELSEC.addItem("SHS-127");
                    JSELSEC.addItem("SHS-128");
                    JSELSEC.addItem("SHS-129");
                    JSELSEC.addItem("SHS-130");
                } else if (selectedyear.equals("12th grade")) {
                    JSELSEC.addItem("SHS-111");
                    JSELSEC.addItem("SHS-112");
                }
                break;

            case "HUMSS - Humanity in Social Sciences":
                if (selectedyear.equals("11th grade")) {
                    JSELSEC.addItem("SHS-121");
                    JSELSEC.addItem("SHS-122");
                } else if (selectedyear.equals("12th grade")) {
                    JSELSEC.addItem("SHS-113");
                    JSELSEC.addItem("SHS-114");
                }
                break;
            case "STEM - Science Technology Engineering and Mathematic":
                if (selectedyear.equals("11th grade")) {
                    JSELSEC.addItem("SHS-123");
                    JSELSEC.addItem("SHS-124");
                } else if (selectedyear.equals("12th grade")) {
                    JSELSEC.addItem("SHS-115");
                    JSELSEC.addItem("SHS-116");
                }
                break;
            case "ICT - Information and Communication Technology":
                if (selectedyear.equals("11th grade")) {
                    JSELSEC.addItem("SHS-125");
                    JSELSEC.addItem("SHS-126");
                } else if (selectedyear.equals("12th grade")) {
                    JSELSEC.addItem("SHS-117");
                    JSELSEC.addItem("SHS-118");
                }
                break;
            default:
                JSELSEC.addItem("-Select a Section-");
                break;
        }
    }//GEN-LAST:event_JSELYEARActionPerformed

    private void JCLEARBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCLEARBUTTONActionPerformed
        JTYPENAME.setText("");
        JSELPROG.setSelectedIndex(0);
        SCIENCETXT.setText("");
        MATHTXT.setText("");
        ENGLISHTXT.setText("");
    }//GEN-LAST:event_JCLEARBUTTONActionPerformed

    private void MATHTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATHTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATHTXTActionPerformed

    private void UPDATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEBUTTONActionPerformed
        // Loop through each row in the table and update the GWA if grades were modified
        DefaultTableModel model = (DefaultTableModel) JRECORD.getModel();
        for (int row = 0; row < model.getRowCount(); row++) {
            // Get the values from the row
            String name = (String) model.getValueAt(row, 0);
            String selectedProg = (String) model.getValueAt(row, 1);
            String selectedSec = (String) model.getValueAt(row, 2);
            String englishScoreText = (String) model.getValueAt(row, 3);
            String mathScoreText = (String) model.getValueAt(row, 4);
            String scienceScoreText = (String) model.getValueAt(row, 5);

            // Initialize variables for the scores
            float englishFloat = 0f, mathFloat = 0f, scienceFloat = 0f;
            float valid = 3;  // Default valid score count

            // Validation and conversion of the grades
            if (englishScoreText != null && !englishScoreText.isEmpty() && englishScoreText.matches("^(?:[0-9]{1,2}(?:\\.\\d{1})?)$")) {
                englishFloat = Float.parseFloat(englishScoreText);
                if (englishFloat > 99) {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for English (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                englishFloat = 0f; // Invalid score, treat as 0
                valid--;  // Invalid score, so reduce valid count for GWA calculation
            }

            if (mathScoreText != null && !mathScoreText.isEmpty() && mathScoreText.matches("^(?:[0-9]{1,2}(?:\\.\\d{1})?)$")) {
                mathFloat = Float.parseFloat(mathScoreText);
                if (mathFloat > 99) {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for Math (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                mathFloat = 0f;
                valid--;
            }

            if (scienceScoreText != null && !scienceScoreText.isEmpty() && scienceScoreText.matches("^(?:[0-9]{1,2}(?:\\.\\d{1})?)$")) {
                scienceFloat = Float.parseFloat(scienceScoreText);
                if (scienceFloat > 99) {
                    JOptionPane.showMessageDialog(this, "Please input a valid grade for Science (0-99 or 0-99.9).", "Invalid Grade", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                scienceFloat = 0f;
                valid--;
            }

            // Calculate the GWA (General Weighted Average)
            float sum = englishFloat + mathFloat + scienceFloat;
            float gwa = valid > 0 ? sum / valid : 0;  // Avoid division by zero

            // Update the GWA in the table (assuming the GWA column is the 7th column, index 6)
            model.setValueAt(String.format("%.2f", gwa), row, 6);  // Set the GWA with two decimal points

            // Write the updated data to the notepad file
            String updatedData = String.format("Name: %s, Program: %s, Section: %s, English: %s, Math: %s, Science: %s, GWA: %.2f",
                    name, selectedProg, selectedSec, englishScoreText, mathScoreText, scienceScoreText, gwa);
            writeToNotepad(updatedData);  // Append to notepad
        }

        JOptionPane.showMessageDialog(this, "Grades and GWA updated successfully!");
    }//GEN-LAST:event_UPDATEBUTTONActionPerformed

    private void ENGLISHTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENGLISHTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENGLISHTXTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ENGLISHTXT;
    private javax.swing.JButton JADDBUTTON;
    private javax.swing.JButton JCLEARBUTTON;
    private javax.swing.JPanel JPANELINS;
    private javax.swing.JLabel JPROG;
    private javax.swing.JTable JRECORD;
    private javax.swing.JComboBox<String> JSELPROG;
    private javax.swing.JComboBox<String> JSELSEC;
    private javax.swing.JComboBox<String> JSELYEAR;
    private javax.swing.JLabel JTXTSR;
    private javax.swing.JTextField JTYPENAME;
    private javax.swing.JTextField MATHTXT;
    private javax.swing.JTextField SCIENCETXT;
    private javax.swing.JButton UPDATEBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
