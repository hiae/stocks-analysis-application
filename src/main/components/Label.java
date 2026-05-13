package src.main.components;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Label extends JLabel {

       // default label
    public Label(String text) {
        setText(text);
        setFont(new Font("Arial", Font.PLAIN, 14));
    }

    // heading label
    public Label(String text, int fontSize, boolean bold) {
        setText(text);
        setFont(new Font("Arial", bold ? Font.BOLD : Font.PLAIN, fontSize));
    }

    // custom color label
    public Label(String text, int fontSize, boolean bold, Color color) {
        this(text, fontSize, bold);
        setForeground(color);
    }
}
