package ali.industries;

import jdk.jfr.Enabled;

import javax.swing.*;
import java.awt.*;

public class Inventory extends Player{
    Player aPlayer;

    private String[] slot = new String[4];
    private int slotCounter = 0;
    protected int anzKleineTraenke = 0;
    protected int anzGroßeTraenke = 0;
    private String currentWeapon;
    private String currenAromoury;
    private String currentScreen;
    private JPanel inventarPanel;
    private JFrame inventoryWindow;
    private JLabel feuerStein, eisStein, blitzStein;
    protected JButton waffe1, waffe2, waffe3, ruestung1, ruestung2, ruestung3, kleinerHeiltrank, grosserHeiltrank, juwelen;
    Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);

    public Inventory(){
        inventoryWindow = new JFrame("Inventar");
        inventoryWindow.setSize(800,600);
        inventoryWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        inventoryWindow.getContentPane().setBackground(Color.WHITE);
        inventoryWindow.setLayout(null);
        inventoryWindow.setResizable(false);
        inventoryWindow.setVisible(false);

        inventarPanel= new JPanel();
        inventarPanel.setBounds(50,150,700,200);
        inventarPanel.setBackground(Color.BLACK);
        inventarPanel.setLayout(new GridLayout(3,3));
        inventarPanel.setVisible(true);
        inventoryWindow.add(inventarPanel);

        ImageIcon icon = new ImageIcon("Bilder/FeuersteinXXX.png");
        feuerStein = new JLabel(icon);
        feuerStein.setBounds(0, 300, 300, 300);
        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
        inventoryWindow.add(feuerStein);

        ImageIcon icon2 = new ImageIcon("Bilder/EissteinXXX.png");
        eisStein = new JLabel(icon2);
        eisStein.setBounds(250, 300, 300, 300);
        icon2.setImage(icon2.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
        inventoryWindow.add(eisStein);

        ImageIcon icon3 = new ImageIcon("Bilder/BlitzSteinXXX.png");
        blitzStein = new JLabel(icon3);
        blitzStein.setBounds(480, 280, 300, 300);
        icon3.setImage(icon3.getImage().getScaledInstance(220,220,Image.SCALE_DEFAULT));
        inventoryWindow.add(blitzStein);

        waffe1 = new JButton("???");
        waffe1.setBackground(Color.BLACK);
        waffe1.setForeground(Color.WHITE);
        waffe1.setFont(buttonFont);
        inventarPanel.add(waffe1);
        waffe1.setVisible(true);
        waffe1.setEnabled(false);

        waffe2 = new JButton("???");
        waffe2.setBackground(Color.BLACK);
        waffe2.setForeground(Color.WHITE);
        waffe2.setFont(buttonFont);
        inventarPanel.add(waffe2);
        waffe2.setVisible(true);
        waffe2.setEnabled(false);

        waffe3 = new JButton("???");
        waffe3.setBackground(Color.BLACK);
        waffe3.setForeground(Color.WHITE);
        waffe3.setFont(buttonFont);
        inventarPanel.add(waffe3);
        waffe3.setVisible(true);
        waffe3.setEnabled(false);

        ruestung1 = new JButton("???");
        ruestung1.setBackground(Color.BLACK);
        ruestung1.setForeground(Color.WHITE);
        ruestung1.setFont(buttonFont);
        inventarPanel.add(ruestung1);
        ruestung1.setVisible(true);
        ruestung1.setEnabled(false);

        ruestung2 = new JButton("???");
        ruestung2.setBackground(Color.BLACK);
        ruestung2.setForeground(Color.WHITE);
        ruestung2.setFont(buttonFont);
        inventarPanel.add(ruestung2);
        ruestung2.setVisible(true);
        ruestung2.setEnabled(false);

        ruestung3 = new JButton("???");
        ruestung3.setBackground(Color.BLACK);
        ruestung3.setForeground(Color.WHITE);
        ruestung3.setFont(buttonFont);
        inventarPanel.add(ruestung3);
        ruestung3.setVisible(true);
        ruestung3.setEnabled(false);

        kleinerHeiltrank = new JButton("Anz. kl. Heiltrank: " + anzKleineTraenke);
        kleinerHeiltrank.setBackground(Color.BLACK);
        kleinerHeiltrank.setForeground(Color.WHITE);
        kleinerHeiltrank.setFont(buttonFont);
        inventarPanel.add(kleinerHeiltrank);
        kleinerHeiltrank.setVisible(true);
        kleinerHeiltrank.setEnabled(false);

        grosserHeiltrank = new JButton("Anz. gr. Heiltrank: " + anzGroßeTraenke);
        grosserHeiltrank.setBackground(Color.BLACK);
        grosserHeiltrank.setForeground(Color.WHITE);
        grosserHeiltrank.setFont(buttonFont);
        inventarPanel.add(grosserHeiltrank);
        grosserHeiltrank.setVisible(true);
        grosserHeiltrank.setEnabled(false);

        juwelen = new JButton("Juwelen: " + playerMoney);
        juwelen.setBackground(Color.BLACK);
        juwelen.setForeground(Color.WHITE);
        juwelen.setFont(buttonFont);
        inventarPanel.add(juwelen);
        juwelen.setVisible(true);
        juwelen.setEnabled(false);
    }

    public void fensterOeffnen(){
        inventoryWindow.setVisible(true);
    }

    public void schwert1(){
        waffe1.setEnabled(true);
        waffe1.setText("Schwert Level 1");
    }

    public void schwert2(){
        waffe2.setEnabled(true);
        waffe2.setText("Schwert Level 2");
    }

    public void setCurrenAromoury(String pCurrenAromoury) {
        this.currenAromoury = pCurrenAromoury;
    }

    public void setCurrentWeapon(String pCurrentWeapon) {
        this.currentWeapon = pCurrentWeapon;
    }

    public void kaufenKleinerHeiltrank(String pItem){
        if (slotCounter < slot.length-1 & aPlayer.playerMoney > 0){
            slot[slotCounter] = pItem;
            slotCounter++;
            aPlayer.playerMoney = aPlayer.playerMoney - 1;
            anzKleineTraenke++;
        }else System.out.println("ERROR!!! Item slot voll");
    }

    public void kaufenGroßerHeiltrank(String pItem){
        if (slotCounter < slot.length-1 & aPlayer.playerMoney > 2){
            slot[slotCounter] = pItem;
            slotCounter++;
            aPlayer.playerMoney = aPlayer.playerMoney - 3;
            anzGroßeTraenke++;
        }else System.out.println("ERROR!!! Item slot voll oder nicht genug Geld!");
    }
    
    public void benutzenKleinerHeiltrank(){
        if (anzKleineTraenke > 0){
            aPlayer.playerLivePoints = aPlayer.playerLivePoints + 20;
            slotCounter--;
            anzKleineTraenke--;
        }
    }

    public void benutzenGroßerHeiltrank(){
        if (anzGroßeTraenke > 0){
            aPlayer.playerLivePoints = aPlayer.playerLivePoints + 40;
            slotCounter--;
            anzGroßeTraenke--;
        }
    }

    public void setCurrentScreen(String pCurrentScreen) {
        this.currentScreen = pCurrentScreen;
    }

    public String getCurrentScreen() {
        return currentScreen;
    }
}
