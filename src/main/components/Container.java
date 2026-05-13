package src.main.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Container extends JPanel{

    public Container(LayoutManager layout) {
        setLayout(layout);
    }

   public Container(LayoutManager layout, Color background) {
        setLayout(layout);
        setBackground(background);
    }

    public Container() {
        setLayout(new FlowLayout());
    }
    
}
