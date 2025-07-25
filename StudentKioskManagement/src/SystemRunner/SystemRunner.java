package SystemRunner;

import UserInterface.Panel.Menu.Menu_main;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author jedid
 */
public class SystemRunner {

    public static void main(String[] args) {
        FlatLightLaf.setup();
        JFrame frame = new JFrame("PUP TESTER PHASE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 610);
        // frame.setResizable(false);  // Prevent resizing
        frame.setLocationRelativeTo(null);
        frame.setLayout(new MigLayout("fill, center"));  // Let panels fill the frame

        // Add initial panel
        frame.add(new Menu_main(frame), "grow");  // Use grow to fill

        frame.setUndecorated(true); // removes title bar
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // maximize to full screen

        frame.setVisible(true);

        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(e -> {
            if (e.getID() == KeyEvent.KEY_PRESSED && e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }
            return false;
        });

    }
}
