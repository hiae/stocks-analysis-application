package src.main.components;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class InitiateApp {

    private boolean TRUE = true;
    private int fontSize = 14;
    private String appLogoPath = "/src/main/resources/falogo2.png",
            appTitle = "Fundamental Analysis",
            navigationBarTitle = "Dashboard";

    private Color mainColor = new Color(238, 217, 196);

    public void start() {

        SwingUtilities.invokeLater(() -> {
            createUserInterface();
        });

    }

    private void createUserInterface() {

        Image logo = Toolkit.getDefaultToolkit().getImage(getClass().getResource(appLogoPath));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame appFrame = new JFrame();
        File stepOneInvestement = new File("src/main/resources/files/Macroeconoics-analysis.txt");
        System.out.println("path here : " + stepOneInvestement.getAbsolutePath());

        appFrame.setTitle(appTitle);
        appFrame.setIconImage(logo);
        appFrame.setSize(screenSize);
        appFrame.setLayout(new BorderLayout());
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NavigationBar navBar = new NavigationBar(navigationBarTitle, mainColor);
        Container mainContainer = new Container(new BorderLayout());
        Container bodyContainer = new Container();
        Label usernameLabel = new Label("username");
        TextInputs usernameInput = new TextInputs(1);
        Label passwordLabel = new Label("password");
        TextInputs passwordInput = new TextInputs(4);

        Button loginButton = new Button("Login");
        Button cancelButton = new Button("Cancel");

        bodyContainer.add(usernameLabel);
        bodyContainer.add(usernameInput);
        bodyContainer.add(passwordLabel);
        bodyContainer.add(passwordInput);

        appFrame.add(navBar, BorderLayout.NORTH);
        appFrame.add(mainContainer.add(bodyContainer), BorderLayout.CENTER);
        appFrame.setVisible(TRUE);

    }

}
