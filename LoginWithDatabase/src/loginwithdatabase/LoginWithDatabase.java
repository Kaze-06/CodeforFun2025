package loginwithdatabase;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginWithDatabase {

    public static void main(String[] args) {
        Login_UI ui = new Login_UI();
        ui.setVisible(true);
        ui.pack();
        ui.setLocationRelativeTo(ui);
    }

}

class panel extends JFrame {

    public panel() {
        super("Login System");

        // Set full screen
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout for full control
        this.setLayout(new BorderLayout());

       

        // ---------- CENTER PANEL ----------
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setLayout(new GridBagLayout()); // To center the message
        JLabel successLabel = new JLabel("Login Successful!");
        successLabel.setFont(new Font("SansSerif", Font.BOLD, 48)); // Adjustable font size
        successLabel.setForeground(Color.DARK_GRAY);
        centerPanel.add(successLabel);

        // Add both panels to the frame
      
        this.add(centerPanel, BorderLayout.CENTER);

        // Show the frame
        this.setVisible(true);
    
    }
}
