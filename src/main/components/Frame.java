package src.main.components;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Frame {

    private boolean TRUE = true;
    private String appLogoPath = "/src/main/resources/falogo2.png";
   private String appTitle =  "Fundamental Analysis";

    public void programFrameLayout() {

        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource(appLogoPath));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame appFrame = new JFrame();

        appFrame.setTitle(appTitle);
        appFrame.setIconImage(logo);
        appFrame.setSize(screenSize);
        appFrame.setLayout(new BorderLayout());
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(TRUE);
        

    }
}
