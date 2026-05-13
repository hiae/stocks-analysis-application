package src.main.components;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class NavigationBar extends JPanel {

    public NavigationBar(String title, Color background) {
        setLayout(new BorderLayout());
        setBackground(background);
        setPreferredSize(new Dimension(0, 60));

        JLabel titleLabel = new JLabel(title);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        add(titleLabel, BorderLayout.WEST);
    }

          // with buttons on the right
    public NavigationBar(String title, Color background, JButton... buttons) {
        this(title, background);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(background);

        for (JButton btn : buttons) {
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.EAST);
    }
    }
