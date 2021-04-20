package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Player player = new Player();

    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, tutorialTextPanel, tutorialButtonPanel, lpPanel, itemPanel, choiceButtonPanel;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel;
    private JButton startButton, inventar, startGame, choice1, choice2, choice3, choice4;
    private JTextArea tutorialTextArea, nameInputTextArea;
    private JTextField nameInput;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    private ActionListener action = new Action();

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
        startButton.addActionListener(action);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);

        choiceButtonPanel= new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanel);
        choiceButtonPanel.setVisible(true);

        choice1 = new JButton("Zum Hoehleneingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanel.add(choice1);
        choice1.addActionListener(action);
        choice1.setVisible(false);

        choice2 = new JButton("Zum Schloss");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanel.add(choice2);
        choice2.addActionListener(action);
        choice2.setVisible(false);

        choice3 = new JButton("Zu deinem Heimatdorf");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanel.add(choice3);
        choice3.addActionListener(action);
        choice3.setVisible(false);

        choice4 = new JButton("Zur Hexe");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(buttonFont);
        choiceButtonPanel.add(choice4);
        choice4.addActionListener(action);
        choice4.setVisible(false);
    }

    public void createGameScreen(){

        tutorialTextPanel = new JPanel();
        tutorialTextPanel.setBounds(100,100,600,250);
        tutorialTextPanel.setBackground(Color.BLACK);
        con.add(tutorialTextPanel);

        tutorialTextArea = new JTextArea("Kuerzlich wurde dein Dorf von einer Daemonenherde ueberrannt, wobei diese dein Dorf zerstoert haben. " +
                "Der Daemonenkoenig hat, waehrend des Angriffs, deine Geliebten getötet. Du hast dir geschworen Rache an den Daemonen zu üben und suchst" +
                " sie nun um sie und ihren König zu vernichten.");
        tutorialTextArea.setBounds(100,100,600,250);
        tutorialTextArea.setBackground(Color.BLACK);
        tutorialTextArea.setForeground(Color.WHITE);
        tutorialTextArea.setFont(normFont);
        tutorialTextArea.setLineWrap(true);
        tutorialTextArea.setWrapStyleWord(true);
        tutorialTextPanel.add(tutorialTextArea);
        tutorialTextArea.setEditable(false);
        tutorialTextArea.setVisible(true);

        tutorialButtonPanel = new JPanel();
        tutorialButtonPanel.setBounds(250,400,300,50);
        tutorialButtonPanel.setBackground(Color.BLACK);
        tutorialButtonPanel.setLayout(new GridLayout(1,1));
        con.add(tutorialButtonPanel);
        tutorialButtonPanel.setVisible(true);

        startGame = new JButton("Story starten");
        startGame.setBackground(Color.BLACK);
        startGame.setForeground(Color.WHITE);
        startGame.setFont(buttonFont);
        tutorialButtonPanel.add(startGame);
        startGame.addActionListener(action);

    }


    /**dies sind die Tutorial Screens. In diesen kann der Spieler sich noch nicht frei bewegen,
     er soll erstmal die Spielmechanik verstehen**/
    public void Tutorial1(){

        tutorialTextArea.setText("Du befindest dich auf der Kreuzung. Gehe zur Hoehle in der sich die Daemonen befinden!");
        startGame.setText("zum Hoehleneingang");

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
        int pPlayerLivePoints = player.getPlayerLivePoints();
        lpNumberLabel = new JLabel(String.valueOf(pPlayerLivePoints));
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

    public void Tutorial2(){
        tutorialTextArea.setText("Waechter: Was denkst du wohin du gehst? In dieser Hoehle befinden sich eine Menge Daemonen, " +
                "in deinem aktuellen Zustand wirst du direkt sterben! Geh dich ausruhen und hol die erst eine Ausruestung bevor ich dich eintreten lasse.");
        startGame.setText("zurueck zur Kreuzung");
    }

    public void Tutorial3(){
        tutorialTextArea.setText("Du befindest dich erneut auf der Kreuzung. Gehe zum Schloss um dich auszuruhen und um dir eine Ausruestung zu holen.");
        startGame.setText("zum Schloss");
    }

    public void Tutorial4(){
        tutorialTextArea.setText("Du stehst auf dem Marktplatz des Schlosses und siehst die Gaststaette in der du dich ausruhen kannst. Gehe hin!");
        startGame.setText("zur Gaststaette");
    }

    public void Tutorial5() {
        tutorialTextArea.setText("Wirt: Guten Tag, wie wärs mit einem erholsamen Schlaf?");
        startGame.setText("Ja bitte...");
    }

    public void Tutorial6() {
        tutorialTextArea.setText("Wirt: Guten morgen! Ich hoffe dein Aufenthalt war zufriedenstellend, beehre uns gerne wieder!");
        startGame.setText("Werde ich bestimmt!");
    }

    public void Tutorial7() {
        tutorialTextArea.setText("Gut du hast deine Lebenspunkte regeneriert. Gehe nun zum Schmied!");
        startGame.setText("Zum Schmied");
    }


    /**ab hier beginnen die freien Screen **/
    public void Kreuzung(){
        tutorialTextArea.setText("Du befindest dich auf einer Kreuzung, wo lang moechtest du gehen?");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);

    }

    public void Hoehleneingang(){
        tutorialTextArea.setText("Waechter: Ich lasse dich passieren, allerdings warne ich dich noch einmal, in dieser Hoehle" +
                "befinden sich starke Daemonen! Sicher, dass du eintreten willst?");
        choice1.setText("Hoehle betreten");
        choice2.setText("Zurueck zur Kreuzung");
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void Marktplatz(){
        tutorialTextArea.setText("Du stehst in mitten des Marktplatzes des Schlosses Tyrals. Viele Menschen laufen umher, " +
                "doch sie alle scheint etwas zu bedruecken. Du siehst den Schmied und die Gaststaette. Wohin gehst du?");
        choice3.setVisible(true);
        choice1.setText("Zum Schmied");
        choice2.setVisible(true);
        choice2.setText("Zur Gaststaette");
        choice3.setText("Zurueck zur Kreuzung");
        choice4.setVisible(false);
    }

    public void GaststaetteVor(){
        tutorialTextArea.setText("Wirt: Guten Tag, wie wärs mit einem erholsamen Schlaf?");
        choice1.setText("Gerne!");
        choice2.setText("Nein, vielen dank.");
        choice3.setVisible(false);
    }

    public void GaststaetteNach(){
        tutorialTextArea.setText("Wirt: Guten morgen! Ich hoffe dein Aufenthalt war zufriedenstellend, beehre uns gerne wieder!");
        choice1.setText("Vielen dank, bis bald!");
    }

    public void Sumpf(){
        tutorialTextArea.setText("Du bewegst dich inmitten eines Sumpfes und siehst das mysteriöse Haus der Hexe vor dir. " +
                "Moechtest du eintreten oder zurück zur Kreuzung gehen?");
        choice1.setText("Hexenhaus betreten");
        choice2.setText("Zurueck zur Kreuzung");
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void Heimat(){
        tutorialTextArea.setText("Du stehst vor deinem Heimatdorf...um dich herum siehst du zerstoerte Haeuser und verbrannte Stellen. " +
                "Wo lang willst du gehen?");
        choice1.setText("Zur Schule");
        choice2.setVisible(true);
        choice2.setText("Zur Kirche");
        choice3.setVisible(true);
        choice3.setText("Zum Park");
        choice4.setVisible(true);
        choice4.setText("Zurueck zur Kreuzung");
    }

    public void Schule(){
        tutorialTextArea.setText("Das Gebauede, in welchem du frueher unterrichtet wurdest, ist zerstört." +
                " Dein Klassenzimmer ist nicht mehr wieder zu erkennen.");
        choice1.setText("Zurueck zum Dorfeingang");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void Kirche(){
        tutorialTextArea.setText("Die einst große und praechtige Kirche ist in sich zusammengestuerzt. In den truemmern " +
                "liegen die zerbrochenen, bunten Glaesser die einst das heilige Haus geschmueckt haben.");
        choice1.setText("Zur Schule");
        choice2.setText("Zum Park");
        choice3.setText("Zu deinem Haus");
        choice4.setText("Zurueck zum Dorfeingang");
    }

    public void Park(){
        tutorialTextArea.setText("Der Platz an dem frueher viele Familien ihre Freizeit verbracht haben ist zerstoert. " +
                "Die Baeume sind verkohlt und einige Graesser brennen noch immer.");
        choice1.setText("Zurueck zum Dorfeingang");
        choice2.setVisible(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }


    /**public void createNameInput(){

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
     }**/

    public class Action implements ActionListener {

        public void actionPerformed(ActionEvent event){
            if (event.getSource()==startButton){
                Standardbefehl();
                createGameScreen();
                mainWindow.repaint();
            } else if (event.getSource()== startGame){
                choiceActionButtons(startGame.getText());
            }else if (event.getSource()== choice1){
                choiceActionButtons(choice1.getText());
                System.out.println(3);
            }else if (event.getSource()== choice2){
                choiceActionButtons(choice2.getText());
            }else if (event.getSource()== choice3){
                choiceActionButtons(choice3.getText());;
            }else if (event.getSource()== choice4){
                choiceActionButtons(choice4.getText());
            }
        }
    }

    public void choiceActionButtons(String pNextScreen){
        switch (pNextScreen){
            case "Story starten" : mainWindow.repaint(); Tutorial1(); break;
            case "zum Hoehleneingang" : Tutorial2(); break;
            case "zurueck zur Kreuzung" : Tutorial3(); break;
            case "zum Schloss" : Tutorial4(); break;
            case "zur Gaststaette" : Tutorial5(); break;
            case "Ja bitte..." : Schlafen(); Tutorial6(); break;

            /**Test Tutorial7 statt kreuzung **/
            case "Werde ich bestimmt!" : WegMitDemSchmutz(); mainWindow.repaint(); Kreuzung(); break;

            /**Kreuzung**/
            case "Zurueck zur Kreuzung" : UeberarbeitungKreuzung(); Kreuzung(); break;
            case "Zum Hoehleneingang" : Hoehleneingang(); break;
            case "Zum Schloss" : Marktplatz(); break;
            case "Zu deinem Heimatdorf" : Heimat(); break;
            case "Zur Hexe" : Sumpf(); break;

            /**Gaststaette**/
            case "Zur Gaststaette" : GaststaetteVor(); break;
            case "Gerne!" : Schlafen(); GaststaetteNach(); break;
            case "Nein, vielen dank." : Marktplatz(); break;
            case "Vielen dank, bis bald!" : Marktplatz(); break;

            /**Heimat**/
            case "Zurueck zum Dorfeingang" : Heimat(); break;
            case "Zur Schule" : Schule(); break;
            case "Zur Kirche" : Kirche(); break;
            case "Zum Park" : Park(); break;
        }
    }

    public void Standardbefehl(){
        con.remove(titleNamePanel);
        con.remove(startButtonPanel);
    }

    public void WegMitDemSchmutz(){
        con.remove(tutorialButtonPanel);
    }

    public void Schlafen(){
        player.setPlayerLivePoints(100);
        int pPlayerLivePoints = player.getPlayerLivePoints();
        lpNumberLabel.setText(String.valueOf(pPlayerLivePoints));
    }

    public void UeberarbeitungKreuzung(){
        choice1.setText("Zum Hoehleneingang");
        choice1.addActionListener(action);
        choice2.setText("Zum Schloss");
        choice3.setText("Zu deinem Heimatdorf");
        choice4.setText("Zur Hexe");
    }

}
