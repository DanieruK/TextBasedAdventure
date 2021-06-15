package ali.industries;

import jdk.jfr.Enabled;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inventory {

    private String[] slot = new String[4];
    protected int anzKleineTraenke = 0;
    protected int anzGroßeTraenke = 0;
    private JPanel inventarPanel, inventoryTitlePanel;
    private JFrame inventoryWindow;
    private JLabel feuerStein, eisStein, blitzStein, inventoryTitleLabel;
    protected JButton waffe1, waffe2, waffe3, ruestung1, ruestung2, ruestung3, kleinerHeiltrank, grosserHeiltrank, juwelen;
    Font buttonFont = new Font("Algerian", Font.PLAIN, 17);
    Font titleFont = new Font("Algerian", Font.PLAIN, 60);

    private ActionListener invAction = new invAction();

    public class invAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(getWaffe1())){
                invActionButtons(getWaffe1().getText());
            }else if (e.getSource().equals(getWaffe2())){
                invActionButtons(getWaffe2().getText());
            }else if (e.getSource().equals(getWaffe3())){
                invActionButtons(getWaffe3().getText());
            }else if (e.getSource().equals(getRuestung1())){
                invActionButtons(getRuestung1().getText());
            }else if (e.getSource().equals(getRuestung2())){
                invActionButtons(getRuestung2().getText());
            }else  if (e.getSource().equals(getRuestung3())){
                invActionButtons(getRuestung3().getText());
            }
        }
    }

    public void invActionButtons(String pNextAction){
        switch (pNextAction){

            case "" : break;
        }
    }

    public int getAnzKleineTraenke() {
        return anzKleineTraenke;
    }

    public int getAnzGroßeTraenke() {
        return anzGroßeTraenke;
    }

    public void setAnzKleineTraenke(int anzKleineTraenke) {
        this.anzKleineTraenke = anzKleineTraenke;
    }

    public void setAnzGroßeTraenke(int anzGroßeTraenke) {
        this.anzGroßeTraenke = anzGroßeTraenke;
    }

    public Inventory() {
        inventoryWindow = new JFrame("Inventar");
        inventoryWindow.setSize(900, 600);
        inventoryWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        inventoryWindow.getContentPane().setBackground(Color.LIGHT_GRAY);
        inventoryWindow.setLayout(null);
        inventoryWindow.setResizable(false);
        inventoryWindow.setVisible(false);

        inventarPanel = new JPanel();
        inventarPanel.setBounds(50, 150, 800, 200);
        inventarPanel.setBackground(Color.BLACK);
        inventarPanel.setLayout(new GridLayout(3, 3));
        inventarPanel.setVisible(true);
        inventoryWindow.add(inventarPanel);

        inventoryTitlePanel = new JPanel();
        inventoryTitlePanel.setBounds(50, 50, 300, 75);
        inventoryTitlePanel.setBackground(Color.LIGHT_GRAY);
        inventoryTitlePanel.setVisible(true);
        inventoryWindow.add(inventoryTitlePanel);

        inventoryTitleLabel = new JLabel("Inventar");
        inventoryTitleLabel.setFont(titleFont);
        inventoryTitleLabel.setForeground(Color.BLACK);
        inventoryTitlePanel.add(inventoryTitleLabel);

        ImageIcon icon = new ImageIcon("Bilder/FeuersteinXXX.png");
        feuerStein = new JLabel(icon);
        feuerStein.setBounds(20, 300, 300, 300);
        icon.setImage(icon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        inventoryWindow.add(feuerStein);

        ImageIcon icon2 = new ImageIcon("Bilder/EissteinXXX.png");
        eisStein = new JLabel(icon2);
        eisStein.setBounds(290, 300, 300, 300);
        icon2.setImage(icon2.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        inventoryWindow.add(eisStein);

        ImageIcon icon3 = new ImageIcon("Bilder/BlitzSteinXXX.png");
        blitzStein = new JLabel(icon3);
        blitzStein.setBounds(540, 280, 300, 300);
        icon3.setImage(icon3.getImage().getScaledInstance(220, 220, Image.SCALE_DEFAULT));
        inventoryWindow.add(blitzStein);

        waffe1 = new JButton("???");
        waffe1.setBackground(Color.BLACK);
        waffe1.setForeground(Color.WHITE);
        waffe1.setFont(buttonFont);
        waffe1.addActionListener(invAction);
        inventarPanel.add(waffe1);
        waffe1.setVisible(true);
        waffe1.setEnabled(false);

        waffe2 = new JButton("???");
        waffe2.setBackground(Color.BLACK);
        waffe2.setForeground(Color.WHITE);
        waffe2.setFont(buttonFont);
        waffe2.addActionListener(invAction);
        inventarPanel.add(waffe2);
        waffe2.setVisible(true);
        waffe2.setEnabled(false);

        waffe3 = new JButton("???");
        waffe3.setBackground(Color.BLACK);
        waffe3.setForeground(Color.WHITE);
        waffe3.setFont(buttonFont);
        waffe3.addActionListener(invAction);
        inventarPanel.add(waffe3);
        waffe3.setVisible(true);
        waffe3.setEnabled(false);

        ruestung1 = new JButton("???");
        ruestung1.setBackground(Color.BLACK);
        ruestung1.setForeground(Color.WHITE);
        ruestung1.setFont(buttonFont);
        ruestung1.addActionListener(invAction);
        inventarPanel.add(ruestung1);
        ruestung1.setVisible(true);
        ruestung1.setEnabled(false);

        ruestung2 = new JButton("???");
        ruestung2.setBackground(Color.BLACK);
        ruestung2.setForeground(Color.WHITE);
        ruestung2.setFont(buttonFont);
        ruestung2.addActionListener(invAction);
        inventarPanel.add(ruestung2);
        ruestung2.setVisible(true);
        ruestung2.setEnabled(false);

        ruestung3 = new JButton("???");
        ruestung3.setBackground(Color.BLACK);
        ruestung3.setForeground(Color.WHITE);
        ruestung3.setFont(buttonFont);
        ruestung3.addActionListener(invAction);
        inventarPanel.add(ruestung3);
        ruestung3.setVisible(true);
        ruestung3.setEnabled(false);

        kleinerHeiltrank = new JButton("Anz. kl. Heiltrank: " + getAnzKleineTraenke());
        kleinerHeiltrank.setBackground(Color.BLACK);
        kleinerHeiltrank.setForeground(Color.WHITE);
        kleinerHeiltrank.setFont(buttonFont);
        kleinerHeiltrank.addActionListener(invAction);
        inventarPanel.add(kleinerHeiltrank);
        kleinerHeiltrank.setVisible(true);
        kleinerHeiltrank.setEnabled(false);

        grosserHeiltrank = new JButton("Anz. gr. Heiltrank: " + getAnzGroßeTraenke());
        grosserHeiltrank.setBackground(Color.BLACK);
        grosserHeiltrank.setForeground(Color.WHITE);
        grosserHeiltrank.setFont(buttonFont);
        grosserHeiltrank.addActionListener(invAction);
        inventarPanel.add(grosserHeiltrank);
        grosserHeiltrank.setVisible(true);
        grosserHeiltrank.setEnabled(false);

        juwelen = new JButton("Juwelen: " + Player.getPlayerMoney());
        juwelen.setBackground(Color.BLACK);
        juwelen.setForeground(Color.WHITE);
        juwelen.setFont(buttonFont);
        inventarPanel.add(juwelen);
        juwelen.setVisible(true);
        juwelen.setEnabled(false);
    }

    public void fensterOeffnen() {
        inventoryWindow.setVisible(true);
    }

    public void schwert1() {
        waffe1.setEnabled(true);
        waffe1.setText(ItemData.schwertlvl1.getName() + (" (10 dmg)"));
    }

    public void schwert2() {
        waffe2.setEnabled(true);
        waffe2.setText(ItemData.schwertlvl2.getName() + (" (20 dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 11);
    }

    public void schwert3() {
        waffe3.setEnabled(true);
        waffe3.setText(ItemData.schwertlvl3.getName() + (" (40 dmg)"));
    }

    public void ruestung1(){
        ruestung1.setEnabled(true);
        ruestung1.setText(ItemData.ruestunglvl1.getName() + (" (-15% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 5);
    }

    public void ruestung2(){
        ruestung2.setEnabled(true);
        ruestung2.setText(ItemData.ruestunglvl2.getName() + (" (-50% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 11);
    }

    public void ruestung3(){
        ruestung3.setEnabled(true);
        ruestung3.setText(ItemData.ruestunglvl3.getName() + (" (-75% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 21);
    }

    public void kaufenKleinerHeiltrank() {
        if (Player.getPlayerMoney() > 0 & getAnzKleineTraenke() < 3){
            Player.setPlayerMoney(Player.getPlayerMoney() - 2);
        setAnzKleineTraenke(getAnzKleineTraenke() + 1);
        }else System.out.println("Entweder hast du nicht genug Juwelen, oder du hast bereits 3 Tränke erworben");
    }

    public void kaufenGroßerHeiltrank(){
        if (getAnzGroßeTraenke() < 3 & Player.getPlayerMoney() > 2){
            Player.setPlayerMoney(Player.getPlayerMoney()-4);
            setAnzGroßeTraenke(getAnzGroßeTraenke()+1);
        }else System.out.println("Entweder hast du nicht genug Juwelen, oder du hast bereits 3 Tränke erworben");
    }
    
    public void benutzenKleinerHeiltrank(){
        if (getAnzKleineTraenke() > 0){
            Player.setPlayerLivePoints(Player.getPlayerLivePoints()+20);
            setAnzKleineTraenke(getAnzKleineTraenke()-1);
        }
    }

    public void benutzenGroßerHeiltrank(){
        if (anzGroßeTraenke > 0){
            Player.setPlayerLivePoints(Player.getPlayerLivePoints()+40);
            anzGroßeTraenke--;
        }
    }

    public void refreshJeweleryLabel() {
        juwelen.setText("Juwelen: " + Player.getPlayerMoney());
    }
    public void refreshKleineTraenke() { kleinerHeiltrank.setText("Anz. kl. Heiltrank: " + getAnzKleineTraenke());}

    public void refreshGrosseTraenke() { grosserHeiltrank.setText("Anz. gr. Heiltrank: " + getAnzGroßeTraenke());}

    public JButton getWaffe1() {
        return waffe1;
    }

    public JButton getWaffe2() {
        return waffe2;
    }

    public JButton getWaffe3() {
        return waffe3;
    }

    public JButton getRuestung1() {
        return ruestung1;
    }

    public JButton getRuestung2() {
        return ruestung2;
    }

    public JButton getRuestung3() {
        return ruestung3;
    }

    public JButton getGrosserHeiltrank() {
        return grosserHeiltrank;
    }

    public JButton getKleinerHeiltrank() {
        return kleinerHeiltrank;
    }
}
