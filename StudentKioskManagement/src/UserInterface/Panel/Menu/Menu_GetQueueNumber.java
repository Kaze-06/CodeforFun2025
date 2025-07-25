/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.Panel.Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.miginfocom.swing.MigLayout;

public class Menu_GetQueueNumber extends JPanel {
// Form components as fields so accessible across methods

    private JToggleButton Registrar, Cashier, Accounting, TranscriptRequest, CertificateofEnrollment, ClearanceProcess, Others;
    private JLabel idTypeLabel, StudentIDJLabel;
    private JComboBox<String> idTypeComboBox;
    private JTextField StudentIDJTField;
    private JButton Submit;
    private JFrame frame;
    private boolean submitButtonColored = false;
    private boolean fadeCompleted = false;
    private int step = 0;

    public Menu_GetQueueNumber(JFrame frame) {
        this.frame = frame;
        createAndShowGUI();
    }

    private Color clampColor(int r, int g, int b) {
        return new Color(
                Math.max(0, Math.min(255, r)),
                Math.max(0, Math.min(255, g)),
                Math.max(0, Math.min(255, b))
        );
    }

    private void createAndShowGUI() {
        UIManager.put("ToggleButton.selectedBackground", new Color(11, 42, 88));
        UIManager.put("ToggleButton.selectedForeground", Color.WHITE);

        setLayout(new MigLayout("wrap, fillx, insets 20 35 20 35", "[fill,360]"));

        JPanel p = new JPanel(new MigLayout("insets 0, fillx, wrap 1", "[grow, fill]", "[]0[]0[]0[]0[]push"));
        JLabel HeaderJLabel = new JLabel("SELECT A DEPARTMENT/SERVICE");
        Registrar = new JToggleButton("Registrar");
        Cashier = new JToggleButton("Cashier");
        Accounting = new JToggleButton("Accounting");
        JLabel UnderHeaderJLabel = new JLabel("Choose a Service:");

        TranscriptRequest = new JToggleButton("Sample 1");
        CertificateofEnrollment = new JToggleButton("Sample 2");
        ClearanceProcess = new JToggleButton("Sample 3");
        Others = new JToggleButton("Sample 4");

        StudentIDJTField = new JTextField(20);
        StudentIDJLabel = new JLabel("Student ID:");
        idTypeLabel = new JLabel("Select ID Type:");
        idTypeComboBox = new JComboBox<>(new String[]{"Student Number", "Reference Number"});
        Submit = new JButton("Submit");

        JButton JBackB = new JButton("Back");

        idTypeComboBox.setFont(new Font("Roboto", Font.PLAIN, 14));
        idTypeComboBox.setBackground(Color.WHITE);
        idTypeComboBox.setForeground(new Color(65, 65, 65));

        ButtonGroup group = new ButtonGroup();
        group.add(Registrar);
        group.add(Cashier);
        group.add(Accounting);
        ButtonGroup group2 = new ButtonGroup();
        group2.add(TranscriptRequest);
        group2.add(CertificateofEnrollment);
        group2.add(ClearanceProcess);
        group2.add(Others);

        // Styling
        Font robotoBold30 = new Font("roboto", Font.BOLD, 30);
        Font robotoPlain14 = new Font("roboto", Font.PLAIN, 16);

        Color themeColor = new Color(65, 65, 65);
        HeaderJLabel.setFont(robotoBold30);
        HeaderJLabel.setForeground(new Color(11, 42, 88));
        UnderHeaderJLabel.setFont(robotoPlain14);
        //UnderHeaderJLabel.setForeground(themeColor);

        for (JToggleButton btn : new JToggleButton[]{Registrar, Cashier, Accounting,
            TranscriptRequest, CertificateofEnrollment, ClearanceProcess, Others}) {
            btn.setFont(robotoPlain14);
            btn.setForeground(themeColor);
            btn.setForeground(UIManager.getColor("ToggleButton.foreground")); // ✅ optional default
        }

        Submit.setFont(robotoPlain14);
        JBackB.setFont(robotoPlain14);
        Submit.setForeground(themeColor);
        JBackB.setForeground(Color.WHITE);
        JBackB.setBackground(Color.gray);
        idTypeLabel.setFont(robotoPlain14);
        // StudentIDJLabel.setForeground(themeColor);
        StudentIDJLabel.setFont(robotoPlain14);
        StudentIDJTField.setFont(robotoPlain14);
        StudentIDJTField.setForeground(new Color(65, 65, 65));
        StudentIDJTField.setText("ex.2024-1064255");

        Insets tightMargin = new Insets(0, 0, 0, 0);
        TranscriptRequest.setMargin(tightMargin);
        CertificateofEnrollment.setMargin(tightMargin);
        ClearanceProcess.setMargin(tightMargin);

        // Layout
        p.add(TranscriptRequest, "h 60!, growx, wrap");
        p.add(CertificateofEnrollment, "h 60!, growx, wrap");
        p.add(ClearanceProcess, "h 60!, growx, wrap");
        p.add(Others, "h 60!, growx, wrap");

        add(HeaderJLabel, "center, wrap");
        JPanel HJPanel = new JPanel(new MigLayout("insets 0, gapx 0", "[grow, fill]", "[][][]")); // no gaps between columns

        HJPanel.add(Registrar, "h 50!");
        HJPanel.add(Cashier, "h 50!");
        HJPanel.add(Accounting, "h 50!");

        add(HJPanel);

        add(UnderHeaderJLabel, "center, wrap, gaptop 25");
        add(p, "growx, gaptop 5, wrap");

        add(idTypeLabel, "wrap, gaptop 15, gapbottom 5");
        add(idTypeComboBox, "h 40!, growx, wrap");

        add(StudentIDJLabel, "wrap, growx, gaptop 30, gapright 10");
        add(StudentIDJTField, "growx, wrap, h 40!");
        add(JBackB, "gaptop 30, span, split 2, Align left, w 200!, h 50");
        add(Submit, " span, Align right, gapleft 20, w 200!, h 50");

        // Only department buttons should be visible initially
        p.setVisible(false); // panel with services
        UnderHeaderJLabel.setVisible(false);
        idTypeLabel.setVisible(false);
        idTypeComboBox.setVisible(false);
        StudentIDJLabel.setVisible(false);
        StudentIDJTField.setVisible(false);
        Submit.setVisible(false);

        ActionListener outerToggleListener = e -> {
            boolean departmentSelected = Registrar.isSelected() || Cashier.isSelected() || Accounting.isSelected();

            // Show panel + label only when a department is selected
            UnderHeaderJLabel.setVisible(departmentSelected);
            p.setVisible(departmentSelected);

            // Hide the lower form fields and reset selection if none selected
            if (!departmentSelected) {
                idTypeLabel.setVisible(false);
                idTypeComboBox.setVisible(false);
                StudentIDJLabel.setVisible(false);
                StudentIDJTField.setVisible(false);
                Submit.setVisible(false);

                // Reset service button selections
                TranscriptRequest.setSelected(false);
                CertificateofEnrollment.setSelected(false);
                ClearanceProcess.setSelected(false);
                Others.setSelected(false);
            }
            updateFormVisibility(); // <-- Add this!

        };

        ActionListener innerToggleListener = e -> updateFormVisibility();

        // Outer toggle buttons
        Registrar.addActionListener(outerToggleListener);
        Cashier.addActionListener(outerToggleListener);
        Accounting.addActionListener(outerToggleListener);

// Inner toggle buttons
        TranscriptRequest.addActionListener(innerToggleListener);
        CertificateofEnrollment.addActionListener(innerToggleListener);
        ClearanceProcess.addActionListener(innerToggleListener);
        Others.addActionListener(innerToggleListener);

        JBackB.addActionListener(e -> showBackConfirmationDialog());

        StudentIDJTField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                    e.consume(); // Ignore non-digit key
                }
            }
        });

        Submit.addActionListener(e -> {
            String selectedIdType = (String) idTypeComboBox.getSelectedItem();
            String studentId = StudentIDJTField.getText().trim();

            boolean isReference = "Reference Number".equals(selectedIdType);
            boolean isValidStudentId = !studentId.isEmpty()
                    && !studentId.equals("ex.2024-1064255")
                    && studentId.matches("\\d+");

            if (isReference || isValidStudentId) {
                QN();
            } else {
                showTopValidationMessage(frame, "⚠️ Please enter a valid numeric Student ID or select Reference Number.");
            }
        });

        // Fade Animation
        Color startColorBG = Submit.getBackground();
        Color startColorFG = Submit.getForeground();
        Color endColorBG = new Color(52, 152, 219);
        Color endColorFG = Color.WHITE;
        int animationDuration = 600;
        int steps = 15;
        int delay = animationDuration / steps;

        Timer fadeTimer = new Timer(delay, null);
        fadeTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float ratio = (float) step / steps;

                int redBG = (int) (startColorBG.getRed() + ratio * (endColorBG.getRed() - startColorBG.getRed()));
                int greenBG = (int) (startColorBG.getGreen() + ratio * (endColorBG.getGreen() - startColorBG.getGreen()));
                int blueBG = (int) (startColorBG.getBlue() + ratio * (endColorBG.getBlue() - startColorBG.getBlue()));

                int redFG = (int) (startColorFG.getRed() + ratio * (endColorFG.getRed() - startColorFG.getRed()));
                int greenFG = (int) (startColorFG.getGreen() + ratio * (endColorFG.getGreen() - startColorFG.getGreen()));
                int blueFG = (int) (startColorFG.getBlue() + ratio * (endColorFG.getBlue() - startColorFG.getBlue()));

                Submit.setBackground(clampColor(redBG, greenBG, blueBG));
                Submit.setForeground(clampColor(redFG, greenFG, blueFG));

                step++;
                if (step > steps) {
                    fadeTimer.stop();
                    Submit.setBackground(endColorBG);
                    Submit.setForeground(endColorFG);
                    fadeCompleted = true;
                }
            }
        });

        Runnable checkFormCompleted = () -> {
            boolean departmentSelected = Registrar.isSelected() || Cashier.isSelected() || Accounting.isSelected();
            boolean serviceSelected = TranscriptRequest.isSelected() || CertificateofEnrollment.isSelected()
                    || ClearanceProcess.isSelected() || Others.isSelected();

            String selectedIdType = (String) idTypeComboBox.getSelectedItem();
            String studentId = StudentIDJTField.getText().trim();

            boolean isStudentIdValid = !studentId.isEmpty() && !studentId.equals("ex.2024-1064255");
            boolean idValid = "Reference Number".equals(selectedIdType) || isStudentIdValid;

            boolean formComplete = departmentSelected && serviceSelected && idValid;

            if (formComplete && !submitButtonColored) {
                step = 0;
                fadeTimer.restart();
                fadeTimer.setInitialDelay(0);
                submitButtonColored = true;
            } else if (!formComplete && fadeCompleted) {
                fadeTimer.stop();
                submitButtonColored = false;
                fadeCompleted = false;
                Submit.setVisible(true); // force it visible even if form is incomplete
                Submit.setBackground(startColorBG);
                Submit.setForeground(startColorFG);
            }
        };

        ActionListener selectionListener = e -> checkFormCompleted.run();
        Registrar.addActionListener(selectionListener);
        Cashier.addActionListener(selectionListener);
        Accounting.addActionListener(selectionListener);
        TranscriptRequest.addActionListener(selectionListener);
        CertificateofEnrollment.addActionListener(selectionListener);
        ClearanceProcess.addActionListener(selectionListener);
        Others.addActionListener(selectionListener);

        StudentIDJTField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                updateFormVisibility();
                checkFormCompleted.run(); // 🔧 ADD THIS
            }

            public void removeUpdate(DocumentEvent e) {
                updateFormVisibility();
                checkFormCompleted.run(); // 🔧 ADD THIS
            }

            public void changedUpdate(DocumentEvent e) {
                updateFormVisibility();
                checkFormCompleted.run(); // 🔧 ADD THIS
            }
        });

        StudentIDJTField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (StudentIDJTField.getText().equals("ex.2024-1064255")) {
                    StudentIDJTField.setText("");
                    StudentIDJTField.setForeground(new Color(65, 65, 65));  // Normal text color
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (StudentIDJTField.getText().isEmpty()) {
                    StudentIDJTField.setForeground(new Color(65, 65, 65));
                    StudentIDJTField.setText("ex.2024-1064255");
                }
            }
        });

        idTypeComboBox.addActionListener(e -> {
            updateFormVisibility();
            checkFormCompleted.run(); // 🔧 ADD THIS
        });

    }

    private void updateFormVisibility() {
        boolean serviceSelected = TranscriptRequest.isSelected()
                || CertificateofEnrollment.isSelected()
                || ClearanceProcess.isSelected()
                || Others.isSelected();

        idTypeLabel.setVisible(serviceSelected);
        idTypeComboBox.setVisible(serviceSelected);

        String selectedIdType = (String) idTypeComboBox.getSelectedItem();
        String studentId = StudentIDJTField.getText().trim();

        // Show/hide student ID field based on ID type
        boolean showStudentIdField = !"Reference Number".equals(selectedIdType);
        StudentIDJLabel.setVisible(serviceSelected && showStudentIdField);
        StudentIDJTField.setVisible(serviceSelected && showStudentIdField);

        // Show submit only if:
        // - a service is selected
        // - AND EITHER: Reference Number is selected
        //       OR: Student Number is selected AND field is not empty or placeholder
        boolean isStudentIdValid = !studentId.isEmpty() && !studentId.equals("ex.2024-1064255");
        boolean showSubmit = serviceSelected && ("Reference Number".equals(selectedIdType)
                || (showStudentIdField && isStudentIdValid));

        Submit.setVisible(showSubmit);

    }

    private void showTopValidationMessage(JFrame frame, String message) {
        JWindow popup = new JWindow(frame);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(255, 204, 204)); // Light red background
        JLabel label = new JLabel(message, SwingConstants.CENTER);
        label.setForeground(Color.DARK_GRAY);
        label.setFont(new Font("Roboto", Font.BOLD, 14));
        label.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panel.add(label, BorderLayout.CENTER);
        popup.add(panel);
        popup.setSize(frame.getWidth(), 50);
        popup.setLocation(frame.getX(), frame.getY() - 50); // Start above the frame
        popup.setVisible(true);

        // Slide down animation
        Timer slideDown = new Timer(5, null);
        slideDown.addActionListener(new ActionListener() {
            int y = frame.getY() - 50;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (y < frame.getY()) {
                    y += 2;
                    popup.setLocation(frame.getX(), y);
                } else {
                    popup.setLocation(frame.getX(), frame.getY());
                    slideDown.stop();

                    // Hide after 2 seconds
                    new Timer(2000, ev -> {
                        popup.setVisible(false);
                        popup.dispose();
                    }).start();
                }
            }
        });
        slideDown.start();
    }

    private void QN() {
        // Determine the prefix based on selected department
        String prefix = "";
        String windowNumber = "";
        if (Registrar.isSelected()) {
            prefix = "RG-";
            windowNumber = "1";
        } else if (Cashier.isSelected()) {
            prefix = "CS-";
            windowNumber = "2";
        } else if (Accounting.isSelected()) {
            prefix = "AC-";
            windowNumber = "3";
        }

        String uniqueNumber = generateUnique4DigitNumber();
        String queueNumber = prefix + uniqueNumber;

        JDialog dialog = new JDialog(frame, "Your Queue Ticket", true);
        dialog.setLayout(new MigLayout("center, wrap 1, insets 20", "[center]", ""));
        dialog.setSize(350, 270);
        dialog.setLocationRelativeTo(frame);
        dialog.getContentPane().setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("🎟️ Your Queue Number");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 18));
        titleLabel.setForeground(new Color(33, 37, 41));
        JLabel queueLabel = new JLabel(queueNumber);
        queueLabel.setFont(new Font("Roboto", Font.BOLD, 32));
        queueLabel.setForeground(new Color(52, 152, 219));
        JLabel instructionLabel = new JLabel("Please proceed to Window #" + windowNumber + " when called.");
        instructionLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        instructionLabel.setForeground(new Color(60, 60, 60));
        JButton printButton = new JButton("🖨️ Print My Queue Ticket");
        printButton.setFont(new Font("Roboto", Font.PLAIN, 14));
        printButton.setBackground(new Color(52, 152, 219));
        printButton.setForeground(Color.WHITE);
        printButton.setFocusPainted(false);
        printButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        dialog.add(titleLabel, "gapbottom 10");
        dialog.add(queueLabel, "gapbottom 10");
        dialog.add(instructionLabel, "gapbottom 30");
        dialog.add(printButton, "w 80%, h 35!");

        printButton.addActionListener(e -> {
            dialog.dispose();

            // Create loading dialog (modal)
            JDialog loadingDialog = new JDialog(frame, "Printing Queue Ticket...", true);
            loadingDialog.setLayout(new BorderLayout());
            loadingDialog.setSize(300, 120);
            loadingDialog.setLocationRelativeTo(frame);
            loadingDialog.getContentPane().setBackground(Color.WHITE);

            JLabel loadingLabel = new JLabel("🕒 Printing... Please wait", SwingConstants.CENTER);
            loadingLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
            loadingDialog.add(loadingLabel, BorderLayout.CENTER);

            JProgressBar progressBar = new JProgressBar();
            progressBar.setIndeterminate(true);
            loadingDialog.add(progressBar, BorderLayout.SOUTH);

            // Use SwingWorker to simulate background printing task
            SwingWorker<Void, Void> worker = new SwingWorker<>() {
                @Override
                protected Void doInBackground() throws Exception {
                    // Simulate printing delay (15 seconds)
                    Thread.sleep(15000);
                    return null;
                }

                @Override
                protected void done() {
                    // Close loading dialog
                    loadingDialog.dispose();

                    // Show complete dialog (same code you already have)
                    showCompleteDialog();
                }
            };

            // Start worker
            worker.execute();

            // Show loading dialog (modal, blocks EDT until dispose called)
            loadingDialog.setVisible(true);
        });
        dialog.setVisible(true);
    }

    private void showCompleteDialog() {
        // Create the dialog
        JDialog completeDialog = new JDialog(frame, "✅ Print Complete", true);
        completeDialog.setUndecorated(true);

        // Load and (optionally) scale spinner GIF
        String spinnerPath = "C:\\Users\\jedid\\OneDrive\\Documents\\NetBeansProjects\\Queuing System and FAQs Kiosk for the Accounting, Cashier, and Registrar’s Office in Polytechnic University of the Philippines- Sta. Mesa, Manila (Main Campus)\\src\\Inf_Spinner.gif";
        ImageIcon spinnerIcon = new ImageIcon(spinnerPath);

        JLabel spinnerLabel = new JLabel(spinnerIcon);
        spinnerLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Create modern content panel
        JPanel contentPanel = new JPanel(new MigLayout("wrap 1, insets 20", "[center]", "[]15[]10[]"));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(52, 152, 219), 2, true),
                BorderFactory.createEmptyBorder(15, 25, 15, 25)
        ));

// Printed successfully label
        JLabel completeLabel = new JLabel("✔ Printed Successfully!");
        completeLabel.setFont(new Font("Roboto", Font.BOLD, 18));
        completeLabel.setForeground(new Color(40, 167, 69)); // Soft green success color
        completeLabel.setHorizontalAlignment(SwingConstants.CENTER);

// Subtle countdown label
        JLabel countdownLabel = new JLabel("Returning to menu in 3...", SwingConstants.CENTER);
        countdownLabel.setFont(new Font("Roboto", Font.PLAIN, 13));
        countdownLabel.setForeground(new Color(108, 117, 125)); // Subtle gray

// Add components
        contentPanel.add(completeLabel, "growx");
        contentPanel.add(countdownLabel, "growx");

        // Add components
        contentPanel.add(spinnerLabel);
        contentPanel.add(completeLabel);
        contentPanel.add(countdownLabel);

        completeDialog.setContentPane(contentPanel);
        completeDialog.pack();  // Fit size to content
        completeDialog.setLocationRelativeTo(frame);  // Center dialog

        // Countdown timer
        final int[] countdown = {3};
        Timer countdownTimer = new Timer(1000, null);
        countdownTimer.addActionListener(ev -> {
            countdown[0]--;
            if (countdown[0] > 0) {
                countdownLabel.setText("Returning to menu in " + countdown[0] + "...");
            } else {
                countdownTimer.stop();
                completeDialog.dispose();
                // Go back to main menu
                frame.getContentPane().removeAll();
                frame.getContentPane().add(new Menu_main(frame), "grow");
                frame.revalidate();
                frame.repaint();
            }
        });

        // Show dialog and start countdown
        countdownTimer.start();
        completeDialog.setVisible(true);
    }

// Helper method to generate unique 4-digit number as String (1000-9999)
    private String generateUnique4DigitNumber() {
        Random rand = new Random();
        int number = 1000 + rand.nextInt(9000); // random int from 1000 to 9999 inclusive
        return String.valueOf(number);
    }

    private void showBackConfirmationDialog() {

        JDialog dialog = new JDialog(frame, "Confirmation", true);
        dialog.setLayout(new MigLayout("center, wrap, insets 20", "[center]", ""));
        dialog.setSize(320, 200);
        dialog.setLocationRelativeTo(frame);
        dialog.getContentPane().setBackground(Color.WHITE);

        // Message Label
        JLabel titleLabel = new JLabel("⚠️ Are you sure?");
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 18));
        titleLabel.setForeground(new Color(220, 53, 69)); // Warning Red

        JLabel messageLabel = new JLabel("Your queue ticket will be lost.");
        messageLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        messageLabel.setForeground(new Color(60, 60, 60));

        // Buttons
        JButton yesButton = new JButton("Yes, Go Back");
        yesButton.setFont(new Font("Roboto", Font.PLAIN, 14));
        yesButton.setBackground(new Color(220, 53, 69)); // Red
        yesButton.setForeground(Color.WHITE);
        yesButton.setFocusPainted(false);
        yesButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font("Roboto", Font.PLAIN, 14));
        cancelButton.setBackground(new Color(108, 117, 125)); // Gray
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFocusPainted(false);
        cancelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Button actions
        yesButton.addActionListener(e -> {
            dialog.dispose();
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new Menu_main(frame), "grow");
            frame.revalidate();
            frame.repaint();
        });

        cancelButton.addActionListener(e -> dialog.dispose());

        // Add components
        dialog.add(titleLabel, "gapbottom 10");
        dialog.add(messageLabel, "gapbottom 20");
        dialog.add(yesButton, "split 2, span, w 45%, h 35!");
        dialog.add(cancelButton, "w 45%, h 35!");

        dialog.setVisible(true);
    }

}
