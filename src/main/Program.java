package src.main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class Program {

    boolean TRUE = true, FALSE = false;
    int fontSize = 14;
    String appLogoPath = "/src/main/resources/falogo2.png";

    public void startProgram() {

        SwingUtilities.invokeLater(() -> {
            System.out.println(getClass().getResource("/"));
            initiateProgram();
        });

    }

    private void initiateProgram() {
        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource(appLogoPath));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame appFrame = new JFrame();
        appFrame.setTitle("Fundamental Analysis");
        appFrame.setIconImage(logo);
        appFrame.setSize(screenSize);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(TRUE);
    }

}
