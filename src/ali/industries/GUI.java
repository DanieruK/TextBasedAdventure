package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends Screens {

    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, lpPanel, itemPanel, inputPanel;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel;
    private JButton startButton, startGame,inventar;
    private JTextArea mainTextArea, nameInputTextArea;
    private JTextField nameInput;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    private ActionListener tsHandler = new TitleScreenHandler();

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

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("...einst wurde dein Dorf von einer Dämonenherde überrannt, wobei der König der Dämonen dein Dorf zerstört hat." +
                "Dabei hat er deine Heimat zerstört und deine geliebten getötet. Du hast dir geschworen Rache an den Dämonen zu üben und suchst" +
                " nun ihren König.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,400,300,50);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(1,1));
        con.add(choiceButtonPanel);

        startGame = new JButton("Story starten");
        startGame.setBackground(Color.BLACK);
        startGame.setForeground(Color.WHITE);
        startGame.setFont(buttonFont);
        choiceButtonPanel.add(startGame);

        inventar = new JButton("Inventar");
        inventar.setBounds(590,15,180,50);
        inventar.setBackground(Color.BLACK);
        inventar.setForeground(Color.WHITE);
        inventar.setFont(buttonFont);
        con.add(inventar);

        lpPanel = new JPanel();
        lpPanel.setBounds(30,15,180,50);
        lpPanel.setBackground(Color.BLACK);
        lpPanel.setLayout(new GridLayout(1,2));
        con.add(lpPanel);
        lpLabel = new JLabel("LP: ");
        lpLabel.setFont(normFont);
        lpLabel.setForeground(Color.WHITE);
        lpPanel.add(lpLabel);
        lpNumberLabel = new JLabel("100");
        lpNumberLabel.setFont(normFont);
        lpNumberLabel.setForeground(Color.WHITE);
        lpPanel.add(lpNumberLabel);

        itemPanel = new JPanel();
        itemPanel.setBounds(230,15,350,50);
        itemPanel.setBackground(Color.BLACK);
        itemPanel.setLayout(new GridLayout(1,2));
        con.add(itemPanel);
        itemLabel = new JLabel("Item: ");
        itemLabel.setFont(normFont);
        itemLabel.setForeground(Color.WHITE);
        itemPanel.add(itemLabel);
        itemNameLabel = new JLabel("Langschwert");
        itemNameLabel.setFont(normFont);
        itemNameLabel.setForeground(Color.WHITE);
        itemPanel.add(itemNameLabel);

    }

    public void createNameInput(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        nameInputTextArea = new JTextArea("Wähle deinen Heldenamen");
        nameInputTextArea.setBounds(220, 120, 350, 50);
        nameInputTextArea.setBackground(Color.BLACK);
        nameInputTextArea.setForeground(Color.white);
        nameInputTextArea.setFont(normFont);
        con.add(nameInputTextArea);

        inputPanel = new JPanel();
        inputPanel.setBounds(250,200,300,50);
        inputPanel.setBackground(Color.lightGray);
        inputPanel.setLayout(new GridLayout(1,1));
        con.add(inputPanel);

        nameInput = new JTextField();
        nameInput.setFont(normFont);
        nameInput.setBackground(Color.LIGHT_GRAY);
        nameInput.setForeground(Color.BLACK);
        inputPanel.add(nameInput);
    }

    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

            titleNamePanel.setVisible(false);
            startButtonPanel.setVisible(false);
            //TODO Dein Screen hier einfügen!!!
        }
    }

}
