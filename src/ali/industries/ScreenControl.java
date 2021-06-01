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

    public void ueberpruefenInventar(){
        if (inv.waffe2.isEnabled()){
            aGui.getChoice2().setEnabled(false);
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
            case "Inventar" : inv.fensterOeffnen(); aGui.getMainWindow().repaint(); break;

            /**Kreuzung**/
            case "Zurueck zur Kreuzung" : aGui.WegMitDemSchmutz(); aGui.Kreuzung();aGui.getMainWindow().repaint(); break;
            case "Zum Hoehleneingang" : System.out.println(2); aGui.Hoehleneingang();aGui.getMainWindow().repaint(); break;
            case "Zum Schloss" : aGui.Marktplatz(); aGui.getMainWindow().repaint(); break;
            case "Zu deinem Heimatdorf" : aGui.Heimat(); aGui.getMainWindow().repaint(); break;
            case "Zur Hexe" : aGui.Sumpf(); aGui.getMainWindow().repaint(); break;

            case "Hoehle betreten" : aGui.Hoehle(); aGui.getMainWindow().repaint(); break;

            /**Gaststaette**/
            case "Zur Gaststaette" : aGui.GaststaetteVor(); aGui.getMainWindow().repaint(); break;
            case "Gerne!" : aGui.Schlafen(); aGui.GaststaetteNach(); aGui.getMainWindow().repaint(); break;
            case "Nein, vielen dank." :
            case "Vielen dank, bis bald!" :
                aGui.Marktplatz();aGui.getMainWindow().repaint(); break;

            /**Schmied**/
            case "Zum Schmied" : aGui.Schmied(); aGui.getMainWindow().repaint(); java.lang.System.out.print( 4 ); break;
            case "Zurueck zum Marktplatz" : aGui.Marktplatz(); aGui.getMainWindow().repaint(); break;
            case "Ruestungen ansehen" : aGui.RuestungsShop(); aGui.getMainWindow().repaint(); break;
            case "Waffen ansehen" : aGui.WaffenShop(); aGui.getMainWindow().repaint();aGui.getChoice1().setEnabled(false); ueberpruefenInventar(); break;

            case "Verlassen" : aGui.Schmied(); aGui.getMainWindow().repaint(); aGui.getChoice1().setEnabled(true); aGui.getChoice2().setEnabled(true); break;
            case "Schwert lvl 2 = 10 J" : aGui.getChoice2().setEnabled(false); inv.schwert2(); break;

            /**Heimat**/
            case "Zurueck zum Dorfeingang" : aGui.Heimat(); aGui.getMainWindow().repaint(); break;
            case "Zu deiner alten Schule" : aGui.Schule(); aGui.getMainWindow().repaint(); break;
            case "Zur großen Kirche" : aGui.Kirche(); aGui.getMainWindow().repaint(); break;
            case "Zum Park" : aGui.Park(); aGui.getMainWindow().repaint(); break;

            /**Hexe**/
            case "Hexenhaus betreten" :
            case "Zurueck" :
                aGui.Hexe();aGui.getMainWindow().repaint(); break;
            case "Trankinformationen" : aGui.Trankinformationen(); aGui.getMainWindow().repaint(); break;
            case "kl. Trank = 1 Juwel" :
        }
    }
}
