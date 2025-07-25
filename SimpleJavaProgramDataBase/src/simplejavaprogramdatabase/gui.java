package simplejavaprogramdatabase;

/**
 *
 * @author jedidiah
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import simplejavaprogramdatabase.gui.MySQLConnect;

public class gui extends javax.swing.JFrame {

    public gui() {
        initComponents();
        loadProductIDs();
        loadTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPNAME = new javax.swing.JTextField();
        JPPRICE = new javax.swing.JTextField();
        JPQUANTITY = new javax.swing.JTextField();
        JPID = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JADDBUTTON = new javax.swing.JButton();
        JUPDATEBUTTON = new javax.swing.JButton();
        JDELETEBUTTON = new javax.swing.JButton();
        JNEWBUTTON = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPNAMEActionPerformed(evt);
            }
        });

        JPPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPPRICEActionPerformed(evt);
            }
        });

        JPQUANTITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPQUANTITYActionPerformed(evt);
            }
        });

        JPID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Product ID");

        jLabel2.setText("Product Name");

        jLabel3.setText("Product Price");

        jLabel4.setText("Product Qty");

        JADDBUTTON.setText("ADD");
        JADDBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JADDBUTTONActionPerformed(evt);
            }
        });

        JUPDATEBUTTON.setText("UPDATE");
        JUPDATEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUPDATEBUTTONActionPerformed(evt);
            }
        });

        JDELETEBUTTON.setText("DELETE");
        JDELETEBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDELETEBUTTONActionPerformed(evt);
            }
        });

        JNEWBUTTON.setText("NEW");
        JNEWBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNEWBUTTONActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JPNAME)
                            .addComponent(JPID, 0, 209, Short.MAX_VALUE)
                            .addComponent(JPPRICE)
                            .addComponent(JPQUANTITY)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JDELETEBUTTON, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JUPDATEBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JNEWBUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(JPNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(JPPRICE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPQUANTITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JADDBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JUPDATEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JNEWBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JDELETEBUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear old data

        try {
            Connection conn = MySQLConnect.getConnection();
            String query = "SELECT * FROM db_products.tbl_products";
            Statement stmt = conn.createStatement();
            ResultSet rs = (ResultSet) stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("pid");
                String name = rs.getString("pname");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("qty");

                model.addRow(new Object[]{id, name, price, quantity});
            }
        } catch (SQLException e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }

    private void loadProductIDs() {
        try {
            Connection conn = MySQLConnect.getConnection();
            String query = "SELECT pid FROM tbl_products";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            JPID.removeAllItems(); // Clear old items
            while (rs.next()) {
                JPID.addItem(String.valueOf(rs.getInt("pid")));
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error loading product IDs: " + e.getMessage());
        }
    }

    public class MySQLConnect {

        public static Connection getConnection() {
            Connection conn = null;
            try {
                // Update the URL with your MySQL Workbench connection details
                String url = "jdbc:mysql://localhost:3306/db_products"; // Make sure this matches your MySQL Workbench database
                String user = "root"; // Replace with your MySQL username
                String password = "Jednolimit12345"; // Replace with your MySQL password

                // Load MySQL JDBC Driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Create the connection
                conn = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return conn;
        }
    }

    private void JADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JADDBUTTONActionPerformed
        String name = JPNAME.getText().trim();
        String price = JPPRICE.getText().trim();
        String quantity = JPQUANTITY.getText().trim();

        try {
            // Input validation
            if (name.isEmpty() || price.isEmpty() || quantity.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "All fields must be filled.");
                return;
            }

            if (!name.matches("^[A-Za-z0-9 ]+$")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Product name must contain only letters, numbers, or spaces.");
                return;
            }

            if (!price.matches("\\d+(\\.\\d+)?")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Price must be a valid number.");
                return;
            }

            if (!quantity.matches("\\d+")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Quantity must be a whole number.");
                return;
            }

            // All inputs valid – proceed to insert
            Connection conn = MySQLConnect.getConnection();
            String query = "INSERT INTO tbl_products (pname, price, qty) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setDouble(2, Double.parseDouble(price));
            pst.setInt(3, Integer.parseInt(quantity));

            pst.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(this, "Product added successfully.");

            // Refresh data
            loadTableData();
            loadProductIDs(); // In case new ID is needed in the combo box
            JPNAME.setText("");
            JPPRICE.setText("");
            JPQUANTITY.setText("");
            JPID.setSelectedIndex(-1);

            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_JADDBUTTONActionPerformed

    private void JPIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPIDActionPerformed
        if (JPID.getSelectedItem() == null) {
            return;
        }

        try {
            int selectedID = Integer.parseInt(JPID.getSelectedItem().toString());
            Connection conn = MySQLConnect.getConnection();
            String query = "SELECT pname, price, qty FROM tbl_products WHERE pid = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, selectedID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JPNAME.setText(rs.getString("pname"));
                JPPRICE.setText(String.valueOf(rs.getDouble("price")));
                JPQUANTITY.setText(String.valueOf(rs.getInt("qty")));
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error fetching product data: " + e.getMessage());
        }
    }//GEN-LAST:event_JPIDActionPerformed

    private void JPNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPNAMEActionPerformed


    }//GEN-LAST:event_JPNAMEActionPerformed

    private void JPPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPPRICEActionPerformed


    }//GEN-LAST:event_JPPRICEActionPerformed

    private void JPQUANTITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPQUANTITYActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a row to update.");
            return;
        }

        int id = (int) jTable1.getValueAt(selectedRow, 0);
        String name = JPNAME.getText();
        double price = Double.parseDouble(JPPRICE.getText());
        int quantity = Integer.parseInt(JPQUANTITY.getText());

        try {
            Connection conn = MySQLConnect.getConnection();
            String query = "UPDATE dbl.products SET pname = ?, price = ?, qty = ? WHERE ProductID = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setDouble(2, price);
            pst.setInt(3, quantity);
            pst.setInt(4, id);
            pst.executeUpdate();

            javax.swing.JOptionPane.showMessageDialog(this, "Product updated.");
            loadTableData();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

    }//GEN-LAST:event_JPQUANTITYActionPerformed

    private void JUPDATEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUPDATEBUTTONActionPerformed
        if (JPID.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Select a Product ID to update.");
            return;
        }

        try {
            int id = Integer.parseInt(JPID.getSelectedItem().toString());
            String name = JPNAME.getText();
            double price = Double.parseDouble(JPPRICE.getText());
            int quantity = Integer.parseInt(JPQUANTITY.getText());

            Connection conn = MySQLConnect.getConnection();
            String query = "UPDATE tbl_products SET pname = ?, price = ?, qty = ? WHERE pid = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setDouble(2, price);
            pst.setInt(3, quantity);
            pst.setInt(4, id);

            int updated = pst.executeUpdate();

            if (updated > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Product updated successfully.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No product was updated.");
            }

            loadTableData();  // Refresh the table
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error updating product: " + e.getMessage());
        }

    }//GEN-LAST:event_JUPDATEBUTTONActionPerformed

    private void JDELETEBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDELETEBUTTONActionPerformed
        if (JPID.getSelectedItem() == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please select a Product ID to delete.");
            return;
        }

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this product?",
                "Confirm Deletion",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            try {
                int id = Integer.parseInt(JPID.getSelectedItem().toString());
                Connection conn = MySQLConnect.getConnection();
                String query = "DELETE FROM tbl_products WHERE pid = ?";
                PreparedStatement pst = conn.prepareStatement(query);
                pst.setInt(1, id);

                int deleted = pst.executeUpdate();

                if (deleted > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Product deleted successfully.");
                    loadProductIDs();  // Refresh ComboBox
                    loadTableData();   // Refresh Table
                    // Clear the fields
                    JPNAME.setText("");
                    JPPRICE.setText("");
                    JPQUANTITY.setText("");
                    JPID.setSelectedIndex(-1);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "Product not found or already deleted.");
                }

                pst.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage());
            }
        }

    }//GEN-LAST:event_JDELETEBUTTONActionPerformed

    private void JNEWBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNEWBUTTONActionPerformed
        JPNAME.setText("");
        JPPRICE.setText("");
        JPQUANTITY.setText("");
        JPID.setSelectedIndex(-1); // optional
    }//GEN-LAST:event_JNEWBUTTONActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        loadTableData();
    }//GEN-LAST:event_jTable1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JADDBUTTON;
    private javax.swing.JButton JDELETEBUTTON;
    private javax.swing.JButton JNEWBUTTON;
    private javax.swing.JComboBox<String> JPID;
    private javax.swing.JTextField JPNAME;
    private javax.swing.JTextField JPPRICE;
    private javax.swing.JTextField JPQUANTITY;
    private javax.swing.JButton JUPDATEBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
