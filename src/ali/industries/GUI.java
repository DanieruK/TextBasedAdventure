package ali.industries;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JLabel item1;
    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel;
    private JLabel titleNameLabel;
    private JButton startButton;
    Font titleFont = new Font("Comic Sans MS", Font.PLAIN,60);
    Font startFont = new Font("Comic Sans MS", Font.PLAIN,50);

    public GUI(){

        mainWindow = new JFrame();
        mainWindow.setSize(800,600);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.getContentPane().setBackground(Color.BLACK);
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);
        con = mainWindow.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100,600,100);
        titleNamePanel.setBackground(Color.BLACK);
        titleNameLabel = new JLabel("TEXT ADVENTURE");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(startFont);


        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);

    }
}
