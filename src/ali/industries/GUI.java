package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Player player = new Player();
    private JFrame mainWindow;
    private Container con;
    private JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, choiceButtonPanelKreuzung, lpPanel, itemPanel, inputPanel,
            kreuzungTextPanel, hoehlenEingangTextPanel, choiceButtonPanelHoehlenEingang, marktplatzTextPanel, choiceButtonPanelMarktplatz,
            SumpfTextPanel, choiceButtonPanelSumpf, heimatTextPanel, choiceButtonPanelHeimat, schuleTextPanel, choiceButtonPanelSchule,
            kircheTextPanel, choiceButtonPanelKirche, parkTextPanel, choiceButtonPanelPark, gaststaetteVorTextPanel, choiceButtonPanelGaststaetteVor,
            gaststaetteNachTextPanel, choiceButtonPanelGaststaetteNach;
    private JLabel titleNameLabel, lpLabel, lpNumberLabel, itemLabel, itemNameLabel;
    private JButton startButton, startGame,inventar, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9,
            choice10, choice11, choice12, choice13, choice14, choice15, choice16, choice17, choice18, choice19, choice20, choice21,
            choice22, choice23, choice24;
    private JTextArea mainTextArea, nameInputTextArea, kreuzungTextArea, hoehlenEingangTextArea, MarktplatzTextArea, SumpfTextArea,
            heimatTextArea, schuleTextArea, kircheTextArea, parkTextArea, gaststaetteVorTextArea, gaststaetteNachTextArea;
    private JTextField nameInput;
    Font titleFont = new Font("Algerian", Font.PLAIN,60);
    Font startFont = new Font("Algerian", Font.PLAIN,50);
    Font normFont = new Font("Comic Sans MS", Font.PLAIN,28);
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 24);

    private ActionListener tsHandler = new TitleScreenHandler();
    private ActionListener gsHandler = new GameScreenHandler();
    private ActionListener hoehleneingangHandler = new HoehlenEingangHandler();
    private ActionListener zkHandler = new ZurueckZurKreuzungHandler();
    private ActionListener zk1Handler = new ZurueckZurKreuzung1Handler();
    private ActionListener zk2Handler = new ZurueckZurKreuzung2Handler();
    private ActionListener zk3Handler = new ZurueckZurKreuzung3Handler();
    private ActionListener schlossHandler = new SchlossHandler();
    private ActionListener gaststaetteHandler = new GaststaetteHandler();
    private ActionListener gaststaetteNachHandler = new GaststaetteNachHandler();
    private ActionListener mp1Handler = new Marktplatz1Handler();
    private ActionListener mp2Handler = new Marktplatz2Handler();
    private ActionListener sumpfHandler = new SumpfHandler();
    private ActionListener heimatHandler = new HeimatHandler();
    private ActionListener zdHandler = new ZurueckZumDorfeingangHandler();
    private ActionListener zd1Handler = new ZurueckZumDorfeingang1Handler();
    private ActionListener zd2Handler = new ZurueckZumDorfeingang2Handler();
    private ActionListener schuleHandler = new SchuleHandler();
    private ActionListener schule1Handler = new Schule1Handler();
    private ActionListener kircheHandler = new KircheHandler();
    private ActionListener parkHandler = new ParkHandler();
    private ActionListener park1Handler = new Park1Handler();

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
        mainTextArea.setVisible(true);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,400,300,50);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(1,1));
        con.add(choiceButtonPanel);
        choiceButtonPanel.setVisible(true);

        startGame = new JButton("Story starten");
        startGame.setBackground(Color.BLACK);
        startGame.setForeground(Color.WHITE);
        startGame.setFont(buttonFont);
        choiceButtonPanel.add(startGame);
        startGame.addActionListener(gsHandler);

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
        lpNumberLabel = new JLabel(player.getPlayerLivePoints());
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

        choiceButtonPanel.setVisible(true);
        mainTextArea.setVisible(true);
    }

    public void KreuzungsScreen(){
        startGame.setVisible(false);
        mainTextArea.setVisible(false);

        kreuzungTextPanel = new JPanel();
        kreuzungTextPanel.setBounds(100,100,600,250);
        kreuzungTextPanel.setBackground(Color.BLACK);
        con.add(kreuzungTextPanel);


        kreuzungTextArea = new JTextArea("Du befindest dich auf einer Kreuzung, wo lang moechtest du gehen?");
        kreuzungTextArea.setBounds(100,100,600,250);
        kreuzungTextArea.setBackground(Color.BLACK);
        kreuzungTextArea.setForeground(Color.WHITE);
        kreuzungTextArea.setFont(normFont);
        kreuzungTextArea.setLineWrap(true);
        kreuzungTextArea.setWrapStyleWord(true);
        kreuzungTextPanel.add(kreuzungTextArea);
        kreuzungTextArea.setEditable(false);
        kreuzungTextArea.setVisible(true);

        choiceButtonPanelKreuzung = new JPanel();
        choiceButtonPanelKreuzung.setBounds(250,350,300,150);
        choiceButtonPanelKreuzung.setBackground(Color.BLACK);
        choiceButtonPanelKreuzung.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelKreuzung);
        choiceButtonPanelKreuzung.setVisible(true);

        choice1 = new JButton("Zum Hoehleneingang");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.WHITE);
        choice1.setFont(buttonFont);
        choiceButtonPanelKreuzung.add(choice1);
        choice1.addActionListener(hoehleneingangHandler);

        choice2 = new JButton("Zum Schloss");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.WHITE);
        choice2.setFont(buttonFont);
        choiceButtonPanelKreuzung.add(choice2);
        choice2.addActionListener(schlossHandler);

        choice3 = new JButton("Zu deinem Heimatdorf");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.WHITE);
        choice3.setFont(buttonFont);
        choiceButtonPanelKreuzung.add(choice3);
        choice3.addActionListener(heimatHandler);

        choice4 = new JButton("Zur Hexe");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.WHITE);
        choice4.setFont(buttonFont);
        choiceButtonPanelKreuzung.add(choice4);
        choice4.addActionListener(sumpfHandler);
    }

    public void HoehleneingangScreen(){

        hoehlenEingangTextPanel = new JPanel();
        hoehlenEingangTextPanel.setBounds(100,100,600,250);
        hoehlenEingangTextPanel.setBackground(Color.BLACK);
        con.add(hoehlenEingangTextPanel);

        hoehlenEingangTextArea = new JTextArea("Du stehst vor dem Hoehleneingang, doch vor diesem steht ein Waechter aus dem Schloss.");
        hoehlenEingangTextArea.setBounds(100,100,600,250);
        hoehlenEingangTextArea.setBackground(Color.BLACK);
        hoehlenEingangTextArea.setForeground(Color.WHITE);
        hoehlenEingangTextArea.setFont(normFont);
        hoehlenEingangTextArea.setLineWrap(true);
        hoehlenEingangTextArea.setWrapStyleWord(true);
        hoehlenEingangTextPanel.add(hoehlenEingangTextArea);
        hoehlenEingangTextArea.setEditable(false);
        hoehlenEingangTextArea.setVisible(true);

        choiceButtonPanelHoehlenEingang = new JPanel();
        choiceButtonPanelHoehlenEingang.setBounds(250,350,300,150);
        choiceButtonPanelHoehlenEingang.setBackground(Color.BLACK);
        choiceButtonPanelHoehlenEingang.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelHoehlenEingang);

        choice5 = new JButton("Mit dem Waechter sprechen");
        choice5.setBackground(Color.BLACK);
        choice5.setForeground(Color.WHITE);
        choice5.setFont(buttonFont);
        choiceButtonPanelHoehlenEingang.add(choice5);

        choice6 = new JButton("Zurueck zur Kreuzung");
        choice6.setBackground(Color.BLACK);
        choice6.setForeground(Color.WHITE);
        choice6.setFont(buttonFont);
        choiceButtonPanelHoehlenEingang.add(choice6);
        choice6.addActionListener(zkHandler);

    }

    public void MarktplatzScreen(){
        marktplatzTextPanel = new JPanel();
        marktplatzTextPanel.setBounds(100,100,600,250);
        marktplatzTextPanel.setBackground(Color.BLACK);
        con.add(marktplatzTextPanel);

        MarktplatzTextArea = new JTextArea("Du stehst in mitten des Marktplatzes des Schlosses Tyrals. Viele Menschen laufen umher, " +
                "doch sie alle scheint etwas zu bedruecken. Du siehst einen Schmied und eine Gaststaette. Wohin gehst du?");
        MarktplatzTextArea.setBounds(100,100,600,250);
        MarktplatzTextArea.setBackground(Color.BLACK);
        MarktplatzTextArea.setForeground(Color.WHITE);
        MarktplatzTextArea.setFont(normFont);
        MarktplatzTextArea.setLineWrap(true);
        MarktplatzTextArea.setWrapStyleWord(true);
        marktplatzTextPanel.add(MarktplatzTextArea);
        MarktplatzTextArea.setEditable(false);
        MarktplatzTextArea.setVisible(true);

        choiceButtonPanelMarktplatz = new JPanel();
        choiceButtonPanelMarktplatz.setBounds(250,350,300,150);
        choiceButtonPanelMarktplatz.setBackground(Color.BLACK);
        choiceButtonPanelMarktplatz.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelMarktplatz);
        choiceButtonPanelMarktplatz.setVisible(true);

        choice7 = new JButton("Zum Schmied");
        choice7.setBackground(Color.BLACK);
        choice7.setForeground(Color.WHITE);
        choice7.setFont(buttonFont);
        choiceButtonPanelMarktplatz.add(choice7);

        choice8 = new JButton("Zur Gaststaette");
        choice8.setBackground(Color.BLACK);
        choice8.setForeground(Color.WHITE);
        choice8.setFont(buttonFont);
        choiceButtonPanelMarktplatz.add(choice8);
        choice8.addActionListener(gaststaetteHandler);
    }

    public void GaststaetteScreenVor(){
        gaststaetteVorTextPanel = new JPanel();
        gaststaetteVorTextPanel.setBounds(100,100,600,250);
        gaststaetteVorTextPanel.setBackground(Color.BLACK);
        con.add(gaststaetteVorTextPanel);

        gaststaetteVorTextArea = new JTextArea("Wirt: Guten Tag, wie wärs mit einem erholenden Schlaf?");
        gaststaetteVorTextArea.setBounds(100,100,600,250);
        gaststaetteVorTextArea.setBackground(Color.BLACK);
        gaststaetteVorTextArea.setForeground(Color.WHITE);
        gaststaetteVorTextArea.setFont(normFont);
        gaststaetteVorTextArea.setLineWrap(true);
        gaststaetteVorTextArea.setWrapStyleWord(true);
        gaststaetteVorTextPanel.add(gaststaetteVorTextArea);
        gaststaetteVorTextArea.setEditable(false);
        gaststaetteVorTextArea.setVisible(true);

        choiceButtonPanelGaststaetteVor = new JPanel();
        choiceButtonPanelGaststaetteVor.setBounds(250,350,300,150);
        choiceButtonPanelGaststaetteVor.setBackground(Color.BLACK);
        choiceButtonPanelGaststaetteVor.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelGaststaetteVor);
        choiceButtonPanelGaststaetteVor.setVisible(true);

        choice22 = new JButton("Gerne!");
        choice22.setBackground(Color.BLACK);
        choice22.setForeground(Color.WHITE);
        choice22.setFont(buttonFont);
        choiceButtonPanelGaststaetteVor.add(choice22);
        choice22.addActionListener(gaststaetteNachHandler);

        choice23 = new JButton("Nein, vielen dank.");
        choice23.setBackground(Color.BLACK);
        choice23.setForeground(Color.WHITE);
        choice23.setFont(buttonFont);
        choiceButtonPanelGaststaetteVor.add(choice23);
        choice23.addActionListener(mp1Handler);
    }

    public void GaststaetteScreenNach(){
        gaststaetteNachTextPanel = new JPanel();
        gaststaetteNachTextPanel.setBounds(100,100,600,250);
        gaststaetteNachTextPanel.setBackground(Color.BLACK);
        con.add(gaststaetteNachTextPanel);

        gaststaetteNachTextArea = new JTextArea("Wirt: Guten morgen! Ich hoffe dein Aufenthalt war zufriedenstellend," +
                "beehre uns gerne wieder!");
        gaststaetteNachTextArea.setBounds(100,100,600,250);
        gaststaetteNachTextArea.setBackground(Color.BLACK);
        gaststaetteNachTextArea.setForeground(Color.WHITE);
        gaststaetteNachTextArea.setFont(normFont);
        gaststaetteNachTextArea.setLineWrap(true);
        gaststaetteNachTextArea.setWrapStyleWord(true);
        gaststaetteNachTextPanel.add(gaststaetteNachTextArea);
        gaststaetteNachTextArea.setEditable(false);
        gaststaetteNachTextArea.setVisible(true);

        choiceButtonPanelGaststaetteNach = new JPanel();
        choiceButtonPanelGaststaetteNach.setBounds(250,350,300,150);
        choiceButtonPanelGaststaetteNach.setBackground(Color.BLACK);
        choiceButtonPanelGaststaetteNach.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelGaststaetteNach);
        choiceButtonPanelGaststaetteNach.setVisible(true);

        choice24 = new JButton("Vielen dank, bis bald!");
        choice24.setBackground(Color.BLACK);
        choice24.setForeground(Color.WHITE);
        choice24.setFont(buttonFont);
        choiceButtonPanelGaststaetteNach.add(choice24);
        choice24.addActionListener(mp2Handler);
    }

    public void SumpfScreen(){
        choiceButtonPanelKreuzung.setVisible(false);
        kreuzungTextArea.setVisible(false);

        SumpfTextPanel = new JPanel();
        SumpfTextPanel.setBounds(100,100,600,250);
        SumpfTextPanel.setBackground(Color.BLACK);
        con.add(SumpfTextPanel);

        SumpfTextArea = new JTextArea("Du bewegst dich inmitten eines Sumpfes und siehst das Haus der Hexe vor dir. Möchtes " +
                "du eintreten oder zurück zur Kreuzung gehen?");
        SumpfTextArea.setBounds(100,100,600,250);
        SumpfTextArea.setBackground(Color.BLACK);
        SumpfTextArea.setForeground(Color.WHITE);
        SumpfTextArea.setFont(normFont);
        SumpfTextArea.setLineWrap(true);
        SumpfTextArea.setWrapStyleWord(true);
        SumpfTextPanel.add(SumpfTextArea);
        SumpfTextArea.setEditable(false);
        SumpfTextArea.setVisible(true);

        choiceButtonPanelSumpf = new JPanel();
        choiceButtonPanelSumpf.setBounds(250,350,300,150);
        choiceButtonPanelSumpf.setBackground(Color.BLACK);
        choiceButtonPanelSumpf.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelSumpf);

        choice10 = new JButton("Hexenhaus betreten");
        choice10.setBackground(Color.BLACK);
        choice10.setForeground(Color.WHITE);
        choice10.setFont(buttonFont);
        choiceButtonPanelSumpf.add(choice10);

        choice11 = new JButton("Zurueck zur Kreuzung");
        choice11.setBackground(Color.BLACK);
        choice11.setForeground(Color.WHITE);
        choice11.setFont(buttonFont);
        choiceButtonPanelSumpf.add(choice11);
        choice11.addActionListener(zk2Handler);
    }

    public void HeimatScreen(){
        heimatTextPanel = new JPanel();
        heimatTextPanel.setBounds(100,100,600,250);
        heimatTextPanel.setBackground(Color.BLACK);
        con.add(heimatTextPanel);

        heimatTextArea = new JTextArea("Du stehst vor deinem Heimatdorf...um dich herum siehst du zerstoerte Haeuser und verbrannte Stellen." +
                "Wo lang willst du gehen?");
        heimatTextArea.setBounds(100,100,600,250);
        heimatTextArea.setBackground(Color.BLACK);
        heimatTextArea.setForeground(Color.WHITE);
        heimatTextArea.setFont(normFont);
        heimatTextArea.setLineWrap(true);
        heimatTextArea.setWrapStyleWord(true);
        heimatTextPanel.add(heimatTextArea);
        heimatTextArea.setEditable(false);
        heimatTextArea.setVisible(true);

        choiceButtonPanelHeimat = new JPanel();
        choiceButtonPanelHeimat.setBounds(250,350,300,150);
        choiceButtonPanelHeimat.setBackground(Color.BLACK);
        choiceButtonPanelHeimat.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelHeimat);
        choiceButtonPanelHeimat.setVisible(true);

        choice12 = new JButton("Zur Schule");
        choice12.setBackground(Color.BLACK);
        choice12.setForeground(Color.WHITE);
        choice12.setFont(buttonFont);
        choiceButtonPanelHeimat.add(choice12);
        choice12.addActionListener(schuleHandler);

        choice13 = new JButton("Zur Kirche");
        choice13.setBackground(Color.BLACK);
        choice13.setForeground(Color.WHITE);
        choice13.setFont(buttonFont);
        choiceButtonPanelHeimat.add(choice13);
        choice13.addActionListener(kircheHandler);

        choice14 = new JButton("Zum Park");
        choice14.setBackground(Color.BLACK);
        choice14.setForeground(Color.WHITE);
        choice14.setFont(buttonFont);
        choiceButtonPanelHeimat.add(choice14);
        choice14.addActionListener(parkHandler);

        choice15 = new JButton("Zurueck zur Kreuzung");
        choice15.setBackground(Color.BLACK);
        choice15.setForeground(Color.WHITE);
        choice15.setFont(buttonFont);
        choiceButtonPanelHeimat.add(choice15);
        choice15.addActionListener(zk3Handler);
    }

    public void SchuleScreen(){
        schuleTextPanel = new JPanel();
        schuleTextPanel.setBounds(100,100,600,250);
        schuleTextPanel.setBackground(Color.BLACK);
        con.add(schuleTextPanel);

        schuleTextArea = new JTextArea("Das Gebauede, in welchem du frueher unterrichtet wurdest, ist zerstört, dein Klassenzimmer" +
                "ist nicht mehr wieder zu erkennen.");
        schuleTextArea.setBounds(100,100,600,250);
        schuleTextArea.setBackground(Color.BLACK);
        schuleTextArea.setForeground(Color.WHITE);
        schuleTextArea.setFont(normFont);
        schuleTextArea.setLineWrap(true);
        schuleTextArea.setWrapStyleWord(true);
        schuleTextPanel.add(schuleTextArea);
        schuleTextArea.setEditable(false);
        schuleTextArea.setVisible(true);

        choiceButtonPanelSchule = new JPanel();
        choiceButtonPanelSchule.setBounds(250,350,300,150);
        choiceButtonPanelSchule.setBackground(Color.BLACK);
        choiceButtonPanelSchule.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelSchule);
        choiceButtonPanelSchule.setVisible(true);

        choice16 = new JButton("Zurueck zum Dorfeingang");
        choice16.setBackground(Color.BLACK);
        choice16.setForeground(Color.WHITE);
        choice16.setFont(buttonFont);
        choiceButtonPanelSchule.add(choice16);
        choice16.addActionListener(zdHandler);
    }

    public void KircheScreen(){
        kircheTextPanel = new JPanel();
        kircheTextPanel.setBounds(100,100,600,250);
        kircheTextPanel.setBackground(Color.BLACK);
        con.add(kircheTextPanel);

        kircheTextArea = new JTextArea("Die einst große und praechtige Kirche ist in sich zusammengestuerzt. In den truemmern " +
                "liegen die zerbrochenen bunten Glaesser die einst das heilige Haus geschmueckt haben.");
        kircheTextArea.setBounds(100,100,600,250);
        kircheTextArea.setBackground(Color.BLACK);
        kircheTextArea.setForeground(Color.WHITE);
        kircheTextArea.setFont(normFont);
        kircheTextArea.setLineWrap(true);
        kircheTextArea.setWrapStyleWord(true);
        kircheTextPanel.add(kircheTextArea);
        kircheTextArea.setEditable(false);
        kircheTextArea.setVisible(true);

        choiceButtonPanelKirche = new JPanel();
        choiceButtonPanelKirche.setBounds(250,350,300,150);
        choiceButtonPanelKirche.setBackground(Color.BLACK);
        choiceButtonPanelKirche.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelKirche);
        choiceButtonPanelKirche.setVisible(true);

        choice17 = new JButton("Zur Schule");
        choice17.setBackground(Color.BLACK);
        choice17.setForeground(Color.WHITE);
        choice17.setFont(buttonFont);
        choiceButtonPanelKirche.add(choice17);
        choice17.addActionListener(schule1Handler);

        choice18 = new JButton("Zum Park");
        choice18.setBackground(Color.BLACK);
        choice18.setForeground(Color.WHITE);
        choice18.setFont(buttonFont);
        choiceButtonPanelKirche.add(choice18);
        choice18.addActionListener(park1Handler);

        choice19 = new JButton("Zu deinem Haus");
        choice19.setBackground(Color.BLACK);
        choice19.setForeground(Color.WHITE);
        choice19.setFont(buttonFont);
        choiceButtonPanelKirche.add(choice19);

        choice20 = new JButton("Zurueck zum Dorfeingang");
        choice20.setBackground(Color.BLACK);
        choice20.setForeground(Color.WHITE);
        choice20.setFont(buttonFont);
        choiceButtonPanelKirche.add(choice20);
        choice20.addActionListener(zd1Handler);
    }

    public void ParkScreen(){
        parkTextPanel = new JPanel();
        parkTextPanel.setBounds(100,100,600,250);
        parkTextPanel.setBackground(Color.BLACK);
        con.add(parkTextPanel);

        parkTextArea = new JTextArea("Der Platz an dem frueher viele Familien ihre Freizeit verbracht haben ist zerstoert. " +
                "Die Baeume sind verkohlt und einige Graesser brennen noch immer.");
        parkTextArea.setBounds(100,100,600,250);
        parkTextArea.setBackground(Color.BLACK);
        parkTextArea.setForeground(Color.WHITE);
        parkTextArea.setFont(normFont);
        parkTextArea.setLineWrap(true);
        parkTextArea.setWrapStyleWord(true);
        parkTextPanel.add(parkTextArea);
        parkTextArea.setEditable(false);
        parkTextArea.setVisible(true);

        choiceButtonPanelPark = new JPanel();
        choiceButtonPanelPark.setBounds(250,350,300,150);
        choiceButtonPanelPark.setBackground(Color.BLACK);
        choiceButtonPanelPark.setLayout(new GridLayout(4,1));
        con.add(choiceButtonPanelPark);
        choiceButtonPanelPark.setVisible(true);

        choice21 = new JButton("Zurueck zum Dorfeingang");
        choice21.setBackground(Color.BLACK);
        choice21.setForeground(Color.WHITE);
        choice21.setFont(buttonFont);
        choiceButtonPanelPark.add(choice21);
        choice21.addActionListener(zd2Handler);
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

    /**
   public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

            titleNamePanel.setVisible(false);
            startButtonPanel.setVisible(false);
            //TODO Dein Screen hier einfügen!!!
        }
    }
    **/
    public class TitleScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            Standardbefehl();
            createGameScreen();
            mainWindow.repaint();
        }
    }

    public class GameScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(mainTextPanel);
            con.remove(choiceButtonPanel);
            KreuzungsScreen();
            mainWindow.repaint();
        }
    }

    public class HoehlenEingangHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kreuzungTextPanel);
            con.remove(choiceButtonPanelKreuzung);
            HoehleneingangScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZurKreuzungHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(hoehlenEingangTextPanel);
            con.remove(choiceButtonPanelHoehlenEingang);
            KreuzungsScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZurKreuzung1Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(marktplatzTextPanel);
            con.remove(choiceButtonPanelMarktplatz);
            KreuzungsScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZurKreuzung2Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(SumpfTextPanel);
            con.remove(choiceButtonPanelSumpf);
            KreuzungsScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZurKreuzung3Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(heimatTextPanel);
            con.remove(choiceButtonPanelHeimat);
            KreuzungsScreen();
            mainWindow.repaint();
        }
    }

    public class SchlossHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kreuzungTextPanel);
            con.remove(choiceButtonPanelKreuzung);
            MarktplatzScreen();
            mainWindow.repaint();
        }
    }

    public class GaststaetteHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(marktplatzTextPanel);
            con.remove(choiceButtonPanelMarktplatz);
            GaststaetteScreenVor();
            mainWindow.repaint();
        }
    }

    public class GaststaetteNachHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(gaststaetteVorTextPanel);
            con.remove(choiceButtonPanelGaststaetteVor);
            player.setPlayerLivePoints(100);
            GaststaetteScreenNach();
            mainWindow.repaint();
        }
    }

    public class Marktplatz1Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(gaststaetteVorTextPanel);
            con.remove(choiceButtonPanelGaststaetteVor);
            MarktplatzScreen();
            mainWindow.repaint();
        }
    }

    public class Marktplatz2Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(gaststaetteNachTextPanel);
            con.remove(choiceButtonPanelGaststaetteNach);
            MarktplatzScreen();
            mainWindow.repaint();
        }
    }

    public class SumpfHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kreuzungTextPanel);
            con.remove(choiceButtonPanelKreuzung);
            SumpfScreen();
            mainWindow.repaint();
        }
    }

    public class HeimatHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kreuzungTextPanel);
            con.remove(choiceButtonPanelKreuzung);
            HeimatScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZumDorfeingangHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(schuleTextPanel);
            con.remove(choiceButtonPanelSchule);
            HeimatScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZumDorfeingang1Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kircheTextPanel);
            con.remove(choiceButtonPanelKirche);
            HeimatScreen();
            mainWindow.repaint();
        }
    }

    public class ZurueckZumDorfeingang2Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(parkTextPanel);
            con.remove(choiceButtonPanelPark);
            HeimatScreen();
            mainWindow.repaint();
        }
    }

    public class SchuleHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(heimatTextPanel);
            con.remove(choiceButtonPanelHeimat);
            SchuleScreen();
            mainWindow.repaint();
        }
    }

    public class Schule1Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kircheTextPanel);
            con.remove(choiceButtonPanelKirche);
            SchuleScreen();
            mainWindow.repaint();
        }
    }

    public class KircheHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(heimatTextPanel);
            con.remove(choiceButtonPanelHeimat);
            KircheScreen();
            mainWindow.repaint();
        }
    }

    public class ParkHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(heimatTextPanel);
            con.remove(choiceButtonPanelHeimat);
            ParkScreen();
            mainWindow.repaint();
        }
    }

    public class Park1Handler implements ActionListener {

        public void actionPerformed(ActionEvent event){
            con.remove(kircheTextPanel);
            con.remove(choiceButtonPanelKirche);
            ParkScreen();
            mainWindow.repaint();
        }
    }


    public void Standardbefehl(){
        con.remove(titleNamePanel);
        con.remove(startButtonPanel);
    }
}