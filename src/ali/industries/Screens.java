package ali.industries;

import javax.swing.*;
import java.awt.*;

public class Screens {

    protected JPanel textPanel;
    protected JButton[] choiceButton;
    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel;
    private JButton startButton, choice1, choice2, choice3, choice4, inventar;
    private JTextArea mainTextArea, locTextArea;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    public void KreuzungScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du befindest dich auf einer Kreuzung, wo lang moechtest du gehen?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Kreuzung");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zum Hoehleneingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zum Schloss");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Zu deinem Heimatsdorf");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Zur Hexe");
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



    public void HoehleneingangScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du stehst vor dem Hoehleneingang, doch vor diesem steht ein Waechter aus dem Schloss");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Hoehleneingang");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Mit dem Waechter sprechen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zurueck zur Kreuzung");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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

    public void WaechterScreenEins(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Waechter: Moment mal. Was denkst du wo du hingehst? Diese Hoehle wurde von dem" +
                "Koenigreich Tyralgesperrt, da sich in der Höhle die unheiligen Daemonen befinden, so kannst du nicht eintreten.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Hoehleneingang");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zurueck zur Kreuzung");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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
    } /**wird einmalig aufgerufen**/

    public void WaechterScreenZwei(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Na das sieht doch schon besser aus! Moechtest du eintreten?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Hoehleneingang");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Hoehle betreten");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zurueck zur Kreuzung");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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



    /**Schloss-Marktplatz**/
    public void MarktplatzScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du stehst in mitten des Marktplatzes des Schlosses Tyrals. Viele Menschen laufen umher," +
                "doch sie alle scheint etwas zu bedruecken. Du siehst einen Schmied und eine Gaststaette. Wohin gehst du?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Marktplatz");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zum Schmied");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zur Gaststaette");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Zurueck zur Kreuzung");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

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



    /**Schloss-Schmied**/
    public void SchmiedScreenEins(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Schmied: Na mein Freund, bist du neu hier? Leider befindet sich das Koenigreich in" +
                "schlechten Zeiten, die Daemonen haben erst vor kurzem das naheliegende Dorf Phylia zerstört.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Schmied");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Deine Geschichte erzaehlen...");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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
    } /**wird einmalig aufgerufen**/

    public void SchmiedScreenZwei(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Schmied: Scheint als haettest du einiges durchmachen muessen, wenn du Rache ueben" +
                "willst werde ich dir allerdings zur Seite stehen, hier nimm dieses Schwert an dich, es ist ein Geschenk.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Schmied");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Eisenschwert annehmen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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
    } /**wird einmalig aufgerufen**/

    public void SchmiedScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Schmied: Na mein Freund, was kann ich fuer dich tun? Sieh dich gerne um in meinem Laden!");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Schmied");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Waffen und Ruestungen ansehen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zurueck zum Marktplatz");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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

    public void SchmiedLadenScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        /**
        mainTextArea = new JTextArea("Schmied: Na mein Freund, was kann ich fuer dich tun? Sieh dich gerne um in meinem Laden!");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);
        **/

        /**location**/
        locTextArea = new JTextArea("Schloss-Schmied");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Stahlschwert (20 Dmg) = 10 Juwelen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("leichte Ruestung (-15% Dmg) = 4 Juwelen");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("normale Ruestung (-50% Dmg) = 10 Juwelen");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("starke Ruestung (-75% Dmg) = 20 Juwelen");
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



    /**Schloss-Gaststaette**/
    public void GaststaetteScreenVor(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Wirt: Guten Tag, wie wärs mit einem erholenden Schlaf?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Gaststaette");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Gerne!");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Nein vielen dank.");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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

    public void GaststaetteScreenNach(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Wirt: Guten morgen! Ich hoffe euer Aufenthalt war zufriedenstellend, " +
                "beehre uns gerne wieder!");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Schloss-Gaststaette");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Bis bald!");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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



    /**Hexenhaus-Sumpf**/
    public void SumpfScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du bewegst dich inmitten eines Sumpfes und siehst das Haus der Hexe vor dir. Möchtest" +
                "du eintreten oder zurück zur Kreuzung gehen?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Sumpf");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Hexenhaus betreten");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zurueck zur Kreuzung");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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


    /**Hexenhaus**/
    public void HexenScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Hexe: Hallo, was kann ich für dich tun?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Hexenhaus");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Tränke ansehen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zurueck zur Kreuzung");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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

    public void HexeLadenScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        /**
         mainTextArea = new JTextArea("Schmied: Na mein Freund, was kann ich fuer dich tun? Sieh dich gerne um in meinem Laden!");
         mainTextArea.setBounds(100,100,600,250);
         mainTextArea.setBackground(Color.BLACK);
         mainTextArea.setForeground(Color.WHITE);
         mainTextArea.setFont(normFont);
         mainTextArea.setLineWrap(true);
         mainTextArea.setWrapStyleWord(true);
         mainTextPanel.add(mainTextArea);
         mainTextArea.setEditable(false);
         **/

        /**location**/
        locTextArea = new JTextArea("Hexenhaus");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("2x kleine Traenke (+20 Lp) = 2 Juwelen");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("großer Trank (+40 Lp) = 3 Juwelen");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

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



    /**Heimatdorf**/
    public void HeimatScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du betrittst dein Heimatdorf...um dich herum siehst du zerstörte Haeuser. Wo lang willst du gehen?");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Phylia");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zur Schule");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zur Kirche");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Zum Park");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Zurueck zur Kreuzung");
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

    public void SchuleScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Das Gebauede in welchem du frueher unterrichtet wurdest ist zerstört, dein Klassenzimmer" +
                "ist nicht mehr wieder zu erkennen.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Phylia-Schule");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zurueck zum Dorfeingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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

    public void KircheScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Die einst große und praechtige Kirche ist in sich zusammengestuerzt. In den truemmern" +
                "liegen die zerbrochenen bunten Glaesser die einst das heilige Haus geschmueckt haben.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Phylia-Kirche");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zurueck zum Dorfeingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zur Schule");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Zum Park");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Zur deinem Haus");
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

    public void ParkScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Der Platz an dem frueher viele Familien ihre Freizeit verbracht haben ist zerstoert." +
                "Die Baeume sind verkohlt und einige Graesser brennen noch immer.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Phylia-Schule");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zurueck zum Dorfeingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

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

    public void DeinHausScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.BLACK);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Du stehst in den ueberresten deines Hauses und siehst voller Wut auf den Boden.");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(normFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextPanel.add(mainTextArea);
        mainTextArea.setEditable(false);

        /**location**/
        locTextArea = new JTextArea("Phylia-Dein Haus");
        locTextArea.setBounds(400,0,600,250);
        locTextArea.setBackground(Color.BLACK);
        locTextArea.setForeground(Color.WHITE);
        locTextArea.setFont(normFont);
        locTextArea.setLineWrap(true);
        locTextArea.setWrapStyleWord(true);
        /**locTextPanel.add(locTextArea);**/
        locTextArea.setEditable(false);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Zur Schule");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Zum Park");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Zur Kirche");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("...");
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


}

