/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserInterface.Panel.Menu;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author jedid
 */
public class Menu_main extends JPanel {

    private JFrame frame;

    public Menu_main(JFrame frame) {

        this.frame = frame;
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        //   setLayout(new MigLayout("wrap, fillx, insets 20 35 30 35", "[grow, fill]"));
        setLayout(new MigLayout(
                "wrap, insets 10 25 10 25, align center top", // Align to top center
                "[grow, fill]"
        ));

        // Interactive Colors
        Color normalColor = UIManager.getColor("Button.background");
        Color hoverColor = new Color(237, 246, 253);
        Color selectedColor = new Color(237, 246, 253);

        RoundedPanel HeaderJPanel = new RoundedPanel(15);
        HeaderJPanel.setLayout(new MigLayout("insets 0", "[grow]", ""));
        HeaderJPanel.setBackground(Color.WHITE);

        JLabel HeaderJLabel = new JLabel("Welcome to Student Services");
        JLabel UnderHeaderJLabel = new JLabel("Please choose an option below:");
        JButton GetaQueueNumberButton = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(new Color(255, 255, 255, 80)); // Glass effect
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
                g2.setColor(new Color(200, 200, 200, 120)); // Soft border
                g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
                g2.dispose();
                super.paintComponent(g);
            }
        };
       GetaQueueNumberButton.setForeground(Color.BLACK);
        GetaQueueNumberButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        GetaQueueNumberButton.setFocusPainted(false);
        GetaQueueNumberButton.setContentAreaFilled(false);
        GetaQueueNumberButton.setOpaque(false);
        GetaQueueNumberButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        
        RoundedButton FAQsButton = new RoundedButton(100);

        JButton[] buttons = {GetaQueueNumberButton, FAQsButton};
        final JButton[] selectedButton = {null}; // To track selected button

        // Fonts & styles
        HeaderJPanel.setBackground(Color.white);
        HeaderJLabel.setFont(new Font("Roboto", Font.BOLD, 36));
        HeaderJLabel.setForeground(new Color(11, 42, 88));
        UnderHeaderJLabel.setFont(new Font("Roboto", Font.PLAIN, 18));
        UnderHeaderJLabel.setForeground(new Color(75, 75, 75));
        for (JButton button : buttons) {
            button.setFont(new Font("Roboto", Font.BOLD, 18));
            button.setForeground(new Color(65, 65, 65));
            button.setFocusPainted(false);
            button.setContentAreaFilled(true);
            button.setOpaque(true);
            button.setBackground(normalColor);
            File file = new File("C:\\Users\\jedid\\OneDrive\\Documents\\NetBeansProjects\\StudentKioskManagement\\src\\Icon_QueueNumber.png");
            System.out.println("Exists? " + file.exists()); // Should print: true
            ImageIcon IconQN = new ImageIcon("C:\\Users\\jedid\\OneDrive\\Documents\\NetBeansProjects\\StudentKioskManagement\\src\\Icon_QueueNumber.png");
            ImageIcon IconFAQs = new ImageIcon("C:\\Users\\jedid\\OneDrive\\Documents\\NetBeansProjects\\StudentKioskManagement\\src\\Icon_FAQs.png");

            // Resize the image
            Image scaledImage = IconQN.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
            Image scaledImage2 = IconFAQs.getImage().getScaledInstance(350, 350, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(scaledImage);
            ImageIcon resizedIcon1 = new ImageIcon(scaledImage2);
            // Set the icon to the button

            GetaQueueNumberButton.setIcon(resizedIcon);
            FAQsButton.setIcon(resizedIcon1);

            // Hover effect
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    if (button != selectedButton[0]) {
                        button.setBackground(hoverColor);
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (button != selectedButton[0]) {
                        button.setBackground(normalColor);
                    }
                }
            });
        }

        // Add components to panel
        HeaderJPanel.add(HeaderJLabel, "center, wrap");
HeaderJPanel.add(UnderHeaderJLabel, "center, wrap");
add(HeaderJPanel, "dock north, center, wrap, gaptop 10");
        
        add(GetaQueueNumberButton, "split 2, h 560, grow, sg btn, gaptop 20, gapright 20");
        add(FAQsButton, "grow, sg btn, gaptop 20, wrap");

        // Action listeners with selection logic
        GetaQueueNumberButton.addActionListener(e -> {
            setSelectedButton(GetaQueueNumberButton, buttons, selectedButton, selectedColor, normalColor);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new Menu_GetQueueNumber(frame), "grow");
            frame.revalidate();
            frame.repaint();
        });

        FAQsButton.addActionListener(e -> {
            setSelectedButton(FAQsButton, buttons, selectedButton, selectedColor, normalColor);
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new Menu_FrequentlyAskedQuestions(frame), "grow");
            frame.revalidate();
            frame.repaint();
        });

    }

// Helper method to update button selection
    private void setSelectedButton(JButton selected, JButton[] allButtons, JButton[] selectedButtonRef, Color selectedColor, Color normalColor) {
        for (JButton b : allButtons) {
            b.setBackground(normalColor);
        }
        selected.setBackground(selectedColor);
        selectedButtonRef[0] = selected;
    }

}
