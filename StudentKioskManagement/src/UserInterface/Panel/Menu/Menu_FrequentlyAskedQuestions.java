package UserInterface.Panel.Menu;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author jedid
 */
public class Menu_FrequentlyAskedQuestions extends JPanel {

    private final JFrame frame;

    public Menu_FrequentlyAskedQuestions(JFrame frame) {
        this.frame = frame;
        FlatLightLaf.setup(); // Ensure FlatLaf is active
        this.setBackground(UIManager.getColor("Panel.background")); // Apply FlatLaf background

        createAndShowGUI();
    }

    private void createAndShowGUI() {
        setLayout(new BorderLayout());

        // --- FAQ CONTENT PANEL ---
        JPanel faqContentPanel = new JPanel(new MigLayout("wrap, fillx, insets 20 35 20 45", "[fill,360]"));
        faqContentPanel.setBackground(Color.WHITE);

        // Header:
        JLabel HeaderJLabel = new JLabel("FREQUENTLY ASKED QUESTIONS");
        HeaderJLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        HeaderJLabel.setForeground(new Color(11, 42, 88));
        JLabel UnderHeaderJLabel = new JLabel("Choose Department:");
        UnderHeaderJLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        faqContentPanel.add(HeaderJLabel, "wrap");
        faqContentPanel.add(UnderHeaderJLabel, "wrap");

        // Add accordions here
        String[][] faqItems = {
            {"Registration", "Q&A"},
            {"Cashier", "Q&A"},
            {"Accounting", "Q&A"},};
        for (String[] item : faqItems) {
            faqContentPanel.add(createAccordion(item[0], item[1], 0));
        }
        faqContentPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0)); // Bottom padding so content won't be flush

        JScrollPane scrollPane = new JScrollPane(faqContentPanel);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setBackground(Color.WHITE);

        // --- PARENT PANEL WITH BORDERLAYOUT ---
        JPanel parentPanel = new JPanel(new BorderLayout());
        parentPanel.add(scrollPane, BorderLayout.CENTER);

        // --- BACK BUTTON PANEL (SOUTH) ---
        JPanel backBtnPanel = new JPanel();
        backBtnPanel.setBackground(Color.WHITE);
        backBtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20)); // center horizontally, 20px top padding

        JButton backButton = new JButton("Back") {
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

            @Override
            protected void paintBorder(Graphics g) {
            } // No border
        };
        backButton.setForeground(Color.BLACK);
        backButton.setFont(new Font("Roboto", Font.BOLD, 14));
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setOpaque(false);
        backButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        backButton.setPreferredSize(new Dimension(190, 40));
        backButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                backButton.setForeground(new Color(30, 30, 30));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                backButton.setForeground(Color.BLACK);
            }
        });
        backButton.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(new Menu_main(frame), "grow");
            frame.revalidate();
            frame.repaint();
        });

        backBtnPanel.add(backButton, "Align left");
        parentPanel.add(backBtnPanel, BorderLayout.SOUTH);

        add(parentPanel, BorderLayout.CENTER);
    }

    // Track open accordions by depth
private final Map<Integer, JPanel> openAtDepth = new HashMap<>();

private JPanel createAccordion(String question, String answer, int depth) {
    JPanel container = new JPanel(new MigLayout("wrap 1, fillx, insets 0", "[grow]", "[]0[]"));
    container.setBackground(Color.WHITE);

    JPanel headerPanel = new JPanel(new BorderLayout());
    headerPanel.setBackground(Color.WHITE);
    headerPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(220, 220, 220)));

    JLabel titleLabel = new JLabel(question);
    titleLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
    titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 0));

    ArrowIcon arrowIcon = new ArrowIcon(12, 0);
    JButton toggleButton = new JButton(arrowIcon);
    toggleButton.setFocusPainted(false);
    toggleButton.setContentAreaFilled(false);
    toggleButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    toggleButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    headerPanel.add(titleLabel, BorderLayout.WEST);
    headerPanel.add(toggleButton, BorderLayout.EAST);

    JPanel contentPanel = new JPanel(new MigLayout("insets 0, wrap", "[grow]"));
    contentPanel.setBackground(Color.WHITE);

    JLabel contentLabel = new JLabel("<html><p style='width:300px;'>" + answer + "</p></html>");
    contentLabel.setFont(new Font("SansSerif", Font.PLAIN, 13));
    contentLabel.setForeground(Color.DARK_GRAY);

    JPanel innerContent = new JPanel(new MigLayout("wrap, insets 10 20 10 20", "[grow, fill]"));
    innerContent.setBackground(Color.WHITE);
    innerContent.add(contentLabel);

    if (depth < 1) {
        if ("Registration".equals(question)) {
            innerContent.add(createAccordion("Question A", "Answer A", depth + 1));
            innerContent.add(createAccordion("Question B", "Answer B", depth + 1));
            innerContent.add(createAccordion("Question C", "Answer C", depth + 1));
            innerContent.add(createAccordion("Question D", "Answer D", depth + 1));
            innerContent.add(createAccordion("Question E", "Answer E", depth + 1));
        } else if ("Cashier".equals(question)) {
            innerContent.add(createAccordion("Question 1", "Answer 1", depth + 1));
            innerContent.add(createAccordion("Question 2", "Answer 2", depth + 1));
            innerContent.add(createAccordion("Question 3", "Answer 3", depth + 1));
            innerContent.add(createAccordion("Question 4", "Answer 4", depth + 1));
            innerContent.add(createAccordion("Question 5", "Answer 5", depth + 1));
        }
        else if ("Accounting".equals(question)) {
            innerContent.add(createAccordion("Question I", "Answer 1", depth + 1));
            innerContent.add(createAccordion("Question II", "Answer 2", depth + 1));
            innerContent.add(createAccordion("Question III", "Answer 3", depth + 1));
            innerContent.add(createAccordion("Question IV", "Answer 4", depth + 1));
            innerContent.add(createAccordion("Question V", "Answer 5", depth + 1));
        }
    }

    contentPanel.add(innerContent, "growx");

    JPanel contentWrapper = new JPanel(new MigLayout("insets 0, wrap", "[grow]"));
    contentWrapper.setBackground(Color.WHITE);

    Timer timer = new Timer(15, null); // 60fps-like refresh rate
    timer.setRepeats(true);

  toggleButton.addActionListener(e -> {
    if (timer.isRunning()) return;
    boolean expanding = !contentWrapper.isAncestorOf(contentPanel);

    JPanel openPanel = openAtDepth.get(depth);
    if (expanding && openPanel != null && openPanel != container) {
        JButton openButton = (JButton) ((JPanel) openPanel.getComponent(0)).getComponent(1);
        openButton.doClick();
    }

    if (expanding) {
        contentPanel.setVisible(true);
        contentPanel.setPreferredSize(null);
        contentWrapper.add(contentPanel, "growx");
        openAtDepth.put(depth, container);
    } else {
        openAtDepth.remove(depth);
    }

    Dimension fullSize = contentPanel.getPreferredSize();
    int fullHeight = fullSize.height;

    final int animationDuration = 250; // ms
    final long startTime = System.currentTimeMillis();

    int startHeight = expanding ? 0 : fullHeight;
    int endHeight = expanding ? fullHeight : 0;

    int startAngle = arrowIcon.getAngle();
    int endAngle = expanding ? 90 : 0;

    for (ActionListener al : timer.getActionListeners()) {
        timer.removeActionListener(al);
    }

    timer.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ev) {
            long elapsed = System.currentTimeMillis() - startTime;
            float progress = Math.min(1f, elapsed / (float) animationDuration);

            // Ease-out interpolation (quadratic)
            float eased = (float) (1 - Math.pow(1 - progress, 2));

            int currentHeight = (int) (startHeight + (endHeight - startHeight) * eased);
            int currentAngle = (int) (startAngle + (endAngle - startAngle) * eased);

            contentPanel.setPreferredSize(new Dimension(fullSize.width, currentHeight));
            arrowIcon.setAngle(currentAngle);
            toggleButton.repaint();
            container.revalidate();
            container.repaint();

            if (progress >= 1f) {
                if (!expanding) {
                    contentWrapper.remove(contentPanel);
                    contentPanel.setVisible(false);
                }
                timer.stop();
            }
        }
    });

    timer.start();
});

    container.add(headerPanel, "growx");
    container.add(contentWrapper, "growx");
    return container;
}

    class ArrowIcon implements Icon {

        private final int size;
        private int angle;

        public ArrowIcon(int size, int angle) {
            this.size = size;
            this.angle = angle;
        }

        public void setAngle(int angle) {
            this.angle = angle;
        }

        public int getAngle() {
            return angle;
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.translate(x + size / 2, y + size / 2);
            g2.rotate(Math.toRadians(angle));
            Polygon triangle = new Polygon(new int[]{-4, 4, 0}, new int[]{-2, -2, 4}, 3);
            g2.setColor(Color.DARK_GRAY);
            g2.fill(triangle);
            g2.dispose();
        }
    }
}
