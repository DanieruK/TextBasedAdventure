package ali.industries;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenControl {
    GUI aGui;
    Inventory inv = new Inventory();
    private ActionListener action = new Action();
    public ScreenControl(GUI pGui){
        this.aGui=pGui;
        aGui.setAction(action);
    }

    public void ueberpruefenWaffenInventar(){
        aGui.getChoice1().setEnabled(false);
        if (inv.waffe2.isEnabled()){
            aGui.getChoice2().setEnabled(false);
        }
    }

    public void ueberpruefenRuestungenInventar(){
        if (inv.ruestung1.isEnabled()){
            aGui.getChoice1().setEnabled(false);
        }if (inv.ruestung2.isEnabled()){
            aGui.getChoice2().setEnabled(false);
        }if (inv.ruestung3.isEnabled()){
            aGui.getChoice3().setEnabled(false);
        }
    }

    public class Action implements ActionListener {

        public void actionPerformed(ActionEvent event){
            if (event.getSource()==aGui.getStartButton()){
                aGui.Standardbefehl();
                aGui.createGameScreen();
                aGui.getMainWindow().repaint();
            }else if (event.getSource().equals(aGui.getStartGame())){
                choiceActionButtons(aGui.getStartGame().getText());
            }else if (event.getSource().equals(aGui.getChoice1())){
                choiceActionButtons(aGui.getChoice1().getText());
            }else if (event.getSource().equals(aGui.getChoice2())){
                choiceActionButtons(aGui.getChoice2().getText());
            }else if (event.getSource().equals(aGui.getChoice3())){
                choiceActionButtons(aGui.getChoice3().getText());;
            }else if (event.getSource().equals(aGui.getChoice4())){
                choiceActionButtons(aGui.getChoice4().getText());
            }else if (event.getSource().equals(aGui.getInventory())){
                choiceActionButtons(aGui.getInventory().getText());
            }
        }
    }

    public void choiceActionButtons(String pNextScreen){
        switch (pNextScreen){

            case "Story starten" : aGui.Tutorial1(); aGui.getMainWindow().repaint(); break;
            case "zum Hoehleneingang" : aGui.Tutorial2();aGui.getMainWindow().repaint(); break;
            case "zurueck zur Kreuzung" : aGui.Tutorial3(); aGui.getMainWindow().repaint(); break;
            case "zum Schloss" : aGui.Tutorial4(); aGui.getMainWindow().repaint(); break;
            case "zur Gaststaette" : aGui.Tutorial5(); aGui.getMainWindow().repaint(); break;
            case "Ja bitte..." : aGui.Schlafen(); aGui.Tutorial6(); aGui.getMainWindow().repaint(); break;
            case "Werde ich bestimmt!" : aGui.Tutorial7(); aGui.getMainWindow().repaint(); break;
            case "zum Schmied" : aGui.Tutorial8(); aGui.getMainWindow().repaint(); break;
            case "Deine Geschichte erzaehlen..." : aGui.Tutorial9(); aGui.getMainWindow().repaint(); break;
            case "Geschenk annehmen" : aGui.Tutorial10(); aGui.getMainWindow().repaint(); inv.schwert1(); break;

            /**Inventar**/
            case "Inventar" : inv.fensterOeffnen(); aGui.getMainWindow().repaint(); inv.refreshJeweleryLabel(); break;

            /**Kreuzung**/
            case "Zurueck zur Kreuzung" : aGui.WegMitDemSchmutz(); aGui.Kreuzung();aGui.getMainWindow().repaint(); break;
            case "Zum dem Hoehleneingang" : aGui.Hoehleneingang();aGui.getMainWindow().repaint(); break;
            case "Zum Schloss" : aGui.Marktplatz(); aGui.getMainWindow().repaint(); break;
            case "Zu deinem Heimatdorf" : aGui.Heimat(); aGui.getMainWindow().repaint(); break;
            case "Zur Hexe" : aGui.Sumpf(); aGui.getMainWindow().repaint(); break;

            case "Die Hoehle betreten" : aGui.Hoehle(); aGui.getMainWindow().repaint(); break;

            /**Gaststaette**/
            case "Zur Gaststaette" : aGui.GaststaetteVor(); aGui.getMainWindow().repaint(); break;
            case "Gerne!" : aGui.Schlafen(); aGui.GaststaetteNach(); aGui.getMainWindow().repaint(); break;
            case "Nein, vielen dank." :
            case "Vielen dank, bis bald!" :
                aGui.Marktplatz();aGui.getMainWindow().repaint(); break;

            /**Schmied**/
            case "Zum Schmied" : aGui.Schmied(); aGui.getMainWindow().repaint(); break;
            case "Zurueck zum Marktplatz" : aGui.Marktplatz(); aGui.getMainWindow().repaint(); break;
            case "Ruestungen ansehen" : aGui.RuestungsShop(); aGui.getMainWindow().repaint(); ueberpruefenRuestungenInventar(); break;
            case "Waffen ansehen" : aGui.WaffenShop(); aGui.getMainWindow().repaint(); ueberpruefenWaffenInventar(); break;

            case "Verlassen" : aGui.Schmied(); aGui.getMainWindow().repaint(); aGui.getChoice1().setEnabled(true);
            aGui.getChoice2().setEnabled(true); aGui.getChoice3().setEnabled(true); break;

            case "Eisenschwert = 10 J" : if (Player.getPlayerMoney()>=10){
                aGui.getChoice2().setEnabled(false); inv.schwert2(); inv.refreshJeweleryLabel(); break;
            }else System.out.println("Nicht genug Juwelen"); break;

            case "Lederruestung = 4 J" : if (Player.getPlayerMoney() >= 4) {
                aGui.getChoice1().setEnabled(false); inv.ruestung1(); inv.refreshJeweleryLabel(); break;
            }else System.out.println("Nicht genug Juwelen"); break;

            case "Kettenhemd = 10 J" : if (Player.getPlayerMoney() >= 10) {
                aGui.getChoice2().setEnabled(false); inv.ruestung2(); inv.refreshJeweleryLabel(); break;
            }

            case "Stahlruestung = 20 J" : if (Player.getPlayerMoney() >= 20) {
                aGui.getChoice3().setEnabled(false); inv.ruestung3(); inv.refreshJeweleryLabel(); break;
            }

            /**Heimat**/
            case "Zurueck zum Dorfeingang" : aGui.Heimat(); aGui.getMainWindow().repaint(); break;
            case "Zu deiner alten Schule" : aGui.Schule(); aGui.getMainWindow().repaint(); break;
            case "Zur großen Kirche" : aGui.Kirche(); aGui.getMainWindow().repaint(); break;
            case "Zum Park" : aGui.Park(); aGui.getMainWindow().repaint(); break;
            case "Zu deinem Haus" : if (inv.waffe2.isEnabled() & inv.ruestung1.isEnabled() & inv.ruestung2.isEnabled() & inv.ruestung3.isEnabled()) {
                aGui.getChoice2().setVisible(true);
                aGui.Haus();
                aGui.getMainWindow().repaint();
                break;
            }else if(inv.waffe3.isEnabled()){
                aGui.getChoice2().setVisible(false); aGui.Haus(); aGui.getMainWindow().repaint(); break;
            }else aGui.getChoice2().setVisible(false); aGui.Haus(); aGui.getMainWindow().repaint(); break;

            case "Heldenschwert aufheben" : inv.schwert3(); aGui.getChoice2().setVisible(false); aGui.Haus();
                aGui.getMainWindow().repaint(); break;

            /**Hexe**/
            case "Hexenhaus betreten" :
            case "Zurueck" :
                aGui.Hexe();aGui.getMainWindow().repaint(); break;
            case "Trankinformationen" : aGui.Trankinformationen(); aGui.getMainWindow().repaint(); break;
            case "kl. Trank = 1 Juwel" : inv.kaufenKleinerHeiltrank(); inv.refreshKleineTraenke(); inv.refreshJeweleryLabel(); break;
            case "gr. Trank = 3 Juwelen" : inv.kaufenGroßerHeiltrank(); inv.refreshGrosseTraenke(); inv.refreshJeweleryLabel(); break;

            //Anfang Kampfszenerie
            case "Links" : Player.setCurrenDemon(EntityData.demonLVL1); aGui.createFightTheme(); break;
            case "Geradeaus" : aGui.createFightTheme(); Player.setCurrenDemon(EntityData.demonLVL1); break;
            case "Rechts" : aGui.createFightTheme(); Player.setCurrenDemon(EntityData.demonLVL1); break;

            case "Angreifen" : Player.takeDamage(); aGui.refreshLPLabel(); aGui.getMainWindow().repaint(); break;


        }
    }
}
