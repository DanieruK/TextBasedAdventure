package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JLabel item1;
    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    private JLabel titleNameLabel;
    private JButton startButton, choice1, choice2, choice3;
    JTextArea mainTextArea;
    Font titleFont = new Font("Comic Sans MS", Font.PLAIN,60);
    Font startFont = new Font("Comic Sans MS", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,30);

    private ActionListener tsHandler = new TitleScreenHandler();
    private ActionListener sc1Handler = new Screen1();

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
        startButton.addActionListener(tsHandler);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the Main Text Area. Das wird das beste Spiel das ich jemals programmiert habe. Das wird bestimmt was ziemlich gutes");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(3,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Auswahl Nr.1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(normFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Auswahl Nr.2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(normFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Auswahl Nr.3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(normFont);
        choiceButtonPanel.add(choice3);
    }

    public void Screen1 (){

    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

            createGameScreen();
        }
    }
    public class Screen1 implements ActionListener {

        public void actionPerformed(ActionEvent event){

            Screen1();
        }
    }

}
