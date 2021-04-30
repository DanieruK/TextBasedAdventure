package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Player player = new Player();

    public JFrame getMainWindow() {
        return mainWindow;
    }

    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, tutorialTextPanel, tutorialButtonPanel, lpPanel, itemPanel, choiceButtonPanel,
            mPanel;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel, mLabel, mNumberLabel;
    private JButton startButton;
    private JButton inventar;

    public JButton getStartButton() {
        return startButton;
    }

    public JButton getStartGame() {
        return startGame;
    }

    public JButton getChoice1() {
        return choice1;
    }

    public JButton getChoice2() {
        return choice2;
    }

    public JButton getChoice3() {
        return choice3;
    }

    public JButton getChoice4() {
        return choice4;
    }

    private JButton startGame;
    private JButton choice1;
    private JButton choice2;
    private JButton choice3;
    private JButton choice4;
    private JTextArea tutorialTextArea, nameInputTextArea;
    private JTextField nameInput;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    private ActionListener action;

    public void setAction(ActionListener action) {
        this.action = action;
    }

    public GUI(){

        ScreenControl sc = new ScreenControl(this);

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
                "Der Daemonenkoenig hat, waehrend des Angriffs, deine Geliebten getoetet. Du hast dir geschworen Rache an den Daemonen zu ueben und suchst sie nun um sie und ihren Koenig zu vernichten.");
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

    public void Inventar(){

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
        inventar.addActionListener(action);

        mPanel = new JPanel();
        mPanel.setBounds(30, 50, 100, 50);
        mPanel.setBackground(Color.BLACK);
        mPanel.setLayout(new GridLayout(1,2));
        con.add(mPanel);
        mLabel = new JLabel("Juwelen: ");
        mLabel.setFont(normFont);
        mLabel.setForeground(Color.WHITE);
        mPanel.add(mLabel);
        int pPlayerMoney = player.getPlayerMoney();
        mNumberLabel = new JLabel(String.valueOf(pPlayerMoney));
        mNumberLabel.setFont(normFont);
        mNumberLabel.setForeground(Color.WHITE);
        mPanel.add(mNumberLabel);

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
        startGame.setText("zum Schmied");
    }

    public void Tutorial8(){
        tutorialTextArea.setText("Schmied: Na mein Freund, bist du neu hier? Leider befindet sich das Koenigreich in " +
                "schlechten Zeiten, die Daemonen haben erst vor kurzem das naheliegende Dorf Phylia zerstört.");
        tutorialButtonPanel.setBounds(200,400,400,50);
        startGame.setText("Deine Geschichte erzaehlen...");
    }

    public void Tutorial9(){
        tutorialTextArea.setText("Scheint als haettest du einiges durchmachen muessen. Wenn du Rache ueben " +
                "willst werde ich dir allerdings zur Seite stehen, hier nimm dieses Schwert und diese Ruestung" +
                " an dich, es ist ein Geschenk!");
        tutorialButtonPanel.setBounds(250,400,300,50);
        startGame.setText("Geschenk annehmen");
    }

    public void Tutorial10(){
        tutorialTextArea.setText("Nun gehe hinaus in die Welt und befreie die Buerger Tyrals von den Daemonen, die uns in " +
                "Angst und Schrecken versetzen!");
        startGame.setText("Zurueck zur Kreuzung");
    }


    /**ab hier beginnt das freie Spiel **/
    public void Kreuzung(){
        startGame.setVisible(false);
        tutorialTextArea.setText("Du befindest dich auf einer Kreuzung, wo lang moechtest du gehen?");
        choice1.setVisible(true);
        choice1.setText("Zum Hoehleneingang");
        choice1.addActionListener(action);
        choice2.setVisible(true);
        choice2.setText("Zum Schloss");
        choice3.setVisible(true);
        choice3.setText("Zu deinem Heimatdorf");
        choice4.setVisible(true);
        choice4.setText("Zur Hexe");

    }

    public void Hoehleneingang(){
        tutorialTextArea.setText("Waechter: Ich lasse dich passieren, allerdings warne ich dich noch einmal, in dieser Hoehle" +
                "befinden sich starke Daemonen! Sicher, dass du eintreten willst?");
        choice1.setVisible(true);
        choice1.setText("Hoehle betreten");
        choice2.setText("Zurueck zur Kreuzung");
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void Hoehle(){
        tutorialTextArea.setText("Du befindest dich in der Hoehle. Du siehst drei Wege denen du folgen kannst. " +
                "In welche Richtung gehst du?");
        choice1.setText("Links");
        choice2.setText("Geradeaus");
        choice3.setVisible(true);
        choice3.setText("Rechts");
        choice4.setVisible(true);
        choice4.setText("Zurueck zur Kreuzung");
    }

    public void Marktplatz(){
        tutorialTextArea.setText("Du stehst in mitten des Marktplatzes des Schlosses Tyrals. Viele Menschen laufen umher, " +
                "doch sie alle scheint etwas zu bedruecken. Du siehst den Schmied und die Gaststaette. Wohin gehst du?");
        choice1.setText("Zum Schmied");
        choice2.setVisible(true);
        choice2.setText("Zur Gaststaette");
        choice3.setVisible(true);
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
        choice2.setVisible(false);
    }

    public void Sumpf(){
        tutorialTextArea.setText("Du bewegst dich inmitten eines Sumpfes und siehst das mysteriöse Haus der Hexe vor dir. " +
                "Moechtest du eintreten oder zurück zur Kreuzung gehen?");
        choice1.setText("Hexenhaus betreten");
        choice2.setText("Zurueck zur Kreuzung");
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void Hexe(){
        tutorialTextArea.setText("Hexe: Hallo junger reisender, was kann ich für dich tun?");
        choice1.setText("kl. Trank = 1 Juwel");
        choice2.setVisible(true);
        choice2.setText("gr. Trank = 3 Juwelen");
        choice3.setVisible(true);
        choice3.setText("Trankinformationen");
        choice4.setVisible(true);
        choice4.setText("Zurueck zur Kreuzung");
    }

    public void Trankinformationen(){
        tutorialTextArea.setText("Hexe: Der kleine Trank regeneriert 20 deiner Lebenspunkte in einem Kampf und der " +
                "große Trank 40 Lebenspunkte. Zwar kostet der kleine Trank weniger Juwelen, allerdings verbraucht das benutzen " +
                "jedes Trankes deinen Angriffszug im Kampf.");
        choice1.setText("Zurueck");
        choice2.setVisible(false);
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

}
