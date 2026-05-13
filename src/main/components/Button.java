package src.main.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;

public class Button extends JButton {

    public Button(String text) {
        setText(text);
        setBackground(new Color(0, 120, 215));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFont(new Font("Arial", Font.BOLD, 14));
    }

    // custom color button
    public Button(String text, Color background, Color foreground) {
        this(text);
        setBackground(background);
        setForeground(foreground);
    }
}
