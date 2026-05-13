package src.main.components;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
public class TextInputs extends JTextField{

      public TextInputs(int columns) {
        super(columns);
        setFont(new Font("Arial", Font.PLAIN, 14));
        setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200)),
            BorderFactory.createEmptyBorder(5, 10, 5, 10) // padding
        ));
    }

    public TextInputs(String placeholder, int columns) {
        this(columns);
        setText(placeholder);
        setForeground(Color.GRAY);
    }
}
