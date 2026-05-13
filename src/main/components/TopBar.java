package src.main.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class TopBar extends JPanel {

    public TopBar(LayoutManager layout) {
        setLayout(layout);
    }

    public TopBar(LayoutManager layout, Color bgColor) {
        setLayout(layout);
        setBackground(bgColor);
    }

    public TopBar() {
        setLayout(new FlowLayout());
       
    }

}
