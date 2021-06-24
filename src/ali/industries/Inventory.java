package ali.industries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inventory {

    protected int anzKleineTraenke = 0;
    protected int anzGroßeTraenke = 0;
    private JPanel inventarPanel, inventoryTitlePanel;
    private JFrame inventoryWindow;
    private JLabel inventoryTitleLabel;
    protected JButton waffe1, waffe2, waffe3, ruestung1, ruestung2, ruestung3, kleinerHeiltrank, grosserHeiltrank, juwelen;
    Font buttonFont = new Font("Algerian", Font.PLAIN, 17);
    Font titleFont = new Font("Algerian", Font.PLAIN, 60);
    
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

        kleinerHeiltrank = new JButton("Anz. kl. Heiltrank: " + getAnzKleineTraenke());
        kleinerHeiltrank.setBackground(Color.BLACK);
        kleinerHeiltrank.setForeground(Color.WHITE);
        kleinerHeiltrank.setFont(buttonFont);
        inventarPanel.add(kleinerHeiltrank);
        kleinerHeiltrank.setVisible(true);
        kleinerHeiltrank.setEnabled(false);

        grosserHeiltrank = new JButton("Anz. gr. Heiltrank: " + getAnzGroßeTraenke());
        grosserHeiltrank.setBackground(Color.BLACK);
        grosserHeiltrank.setForeground(Color.WHITE);
        grosserHeiltrank.setFont(buttonFont);
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


    /**das Inventar wird auf Knopfdruck geöffnet*/
    public void fensterOeffnen() {
        inventoryWindow.setVisible(true);
    }


    /**wird die jeweilige Waffe gekauft oder gefunden, wird sie im Inventar freigeschalten*/
    public void schwert1() {
        waffe1.setEnabled(true);
        waffe1.setText(ItemData.schwertlvl1.getName() + (" (10 dmg)"));
    }

    public void schwert2() {
        waffe2.setEnabled(true);
        waffe2.setText(ItemData.schwertlvl2.getName() + (" (20 dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 10);
    }

    public void schwert3() {
        waffe3.setEnabled(true);
        waffe3.setText(ItemData.schwertlvl3.getName() + (" (40 dmg)"));
    }


    /**wird die jeweilige Rüstung erworben, wird sie im Inventar freigeschalten*/
    public void ruestung1(){
        ruestung1.setEnabled(true);
        ruestung1.setText(ItemData.ruestunglvl1.getName() + (" (-15% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 4);
    }

    public void ruestung2(){
        ruestung2.setEnabled(true);
        ruestung2.setText(ItemData.ruestunglvl2.getName() + (" (-50% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 10);
    }

    public void ruestung3(){
        ruestung3.setEnabled(true);
        ruestung3.setText(ItemData.ruestunglvl3.getName() + (" (-75% dmg)"));
        Player.setPlayerMoney(Player.getPlayerMoney() - 20);
    }


    /**mit diesen Befehlen werden die Heiltränke gekauft und das Geld abgezogen*/
    public void kaufenKleinerHeiltrank() {
        Player.setPlayerMoney(Player.getPlayerMoney() - 2);
        setAnzKleineTraenke(getAnzKleineTraenke() + 1);
        }

    public void kaufenGroßerHeiltrank(){
            Player.setPlayerMoney(Player.getPlayerMoney()-5);
            setAnzGroßeTraenke(getAnzGroßeTraenke()+1);
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


    /**mit diesem Befehl wird überprüft welche Tränke der Spieler hat, je nachdem wird der Trank dann verwender und der Spieler geheilt*/
    public void usePotion(){
        if (anzGroßeTraenke > 0){
            Player.setPlayerLivePoints(Player.getPlayerLivePoints()+50);
            if (Player.getPlayerLivePoints() > 100){
                Player.setPlayerLivePoints(100);
            }
            setAnzGroßeTraenke(getAnzGroßeTraenke() - 1);
            refreshGrosseTraenke();
        }else if (anzKleineTraenke > 0){
            Player.setPlayerLivePoints(Player.getPlayerLivePoints()+20);
            if (Player.getPlayerLivePoints() > 100) {
                Player.setPlayerLivePoints(100);
            }
            setAnzKleineTraenke(getAnzKleineTraenke() - 1);
            refreshKleineTraenke();
        }
    }
}
