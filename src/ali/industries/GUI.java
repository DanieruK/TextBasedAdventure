package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel;
    private JButton startButton, choice1, choice2, choice3, choice4, inventar;
    private JTextArea mainTextArea;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    private ActionListener tsHandler = new TitleScreenHandler();
    private ActionListener sc1Handler = new Screen1();

    public GUI(){

        mainWindow = new JFrame("Text Adventure");
        mainWindow.setSize(800,600);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.getContentPane().setBackground(Color.BLACK);
        mainWindow.setLayout(null);
        mainWindow.setResizable(false);
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

        mainTextArea = new JTextArea("...einst wurde dein Dorf von einer Dämonenherde überrannt, wobei der König der Dämonen dein Dorf zerstört hat" +
                " haben dabei deine" +
                " Heimat zerstört und geliebten getötet. Du hast dir geschworen Rache an den Dämonen zu üben und suchst" +
                " nun den König der Dämonen um Vergeltung zu üben.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Auswahl Nr.1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Auswahl Nr.2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Auswahl Nr.3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Auswahl Nr.4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(buttonFont);
        choiceButtonPanel.add(choice4);

        inventar = new JButton("Inventar");
        inventar.setBackground(Color.BLACK);
        inventar.setForeground(Color.WHITE);
        inventar.setFont(buttonFont);

        playerPanel = new JPanel();
        playerPanel.setBounds(30,15,680,50);
        playerPanel.setBackground(Color.BLACK);
        playerPanel.setLayout(new GridLayout(1,5));
        con.add(playerPanel);
        lpLabel = new JLabel("LP: ");
        lpLabel.setFont(normFont);
        lpLabel.setForeground(Color.WHITE);
        playerPanel.add(lpLabel);
        lpNumberLabel = new JLabel("100");
        lpNumberLabel.setFont(normFont);
        lpNumberLabel.setForeground(Color.WHITE);
        playerPanel.add(lpNumberLabel);
        itemLabel = new JLabel("Item: ");
        itemLabel.setFont(normFont);
        itemLabel.setForeground(Color.WHITE);
        playerPanel.add(itemLabel);
        itemNameLabel = new JLabel("Langschwert");
        itemNameLabel.setFont(normFont);
        itemNameLabel.setForeground(Color.WHITE);
        playerPanel.add(itemNameLabel);
        playerPanel.add(inventar);
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
