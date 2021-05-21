package ali.industries;

import javax.swing.*;
import java.awt.*;

public class Inventory {
    Player aPlayer;

    private String[] slot = new String[4];
    private int slotCounter = 0;
    protected int anzKleineTraenke = 0;
    protected int anzGroßeTraenke = 0;
    private String currentWeapon;
    private String currenAromoury;
    private String currentScreen;
    private JFrame inventoryWindow;

    public void createInventoryScreen(){
        inventoryWindow = new JFrame("Inventar");
        inventoryWindow.setSize(800,600);
        inventoryWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        inventoryWindow.getContentPane().setBackground(Color.BLACK);
        inventoryWindow.setLayout(null);
        inventoryWindow.setResizable(false);
        inventoryWindow.setVisible(true);


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
