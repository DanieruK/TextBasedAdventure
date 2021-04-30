package ali.industries;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenControl {
    GUI aGui;
    private ActionListener action = new Action();
    public ScreenControl(GUI pGui){
        this.aGui=pGui;
        aGui.setAction(action);
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
            }
        }
    }

    public void choiceActionButtons(String pNextScreen){
        switch (pNextScreen){
            case "Story starten" : aGui.Tutorial1(); break;
            case "zum Hoehleneingang" : aGui.Tutorial2(); break;
            case "zurueck zur Kreuzung" : aGui.Tutorial3(); break;
            case "zum Schloss" : aGui.Tutorial4(); break;
            case "zur Gaststaette" : aGui.Tutorial5(); break;
            case "Ja bitte..." : aGui.Schlafen(); aGui.Tutorial6(); break;
            case "Werde ich bestimmt!" : aGui.Tutorial7(); break;
            case "zum Schmied" : aGui.Tutorial8(); break;
            case "Deine Geschichte erzaehlen..." : aGui.Tutorial9(); break;
            case "Geschenk annehmen" : aGui.Tutorial10(); break;

            /**Inventar**/
            case "Inventar" : aGui.Inventar(); break;

            /**Kreuzung**/
            case "Zurueck zur Kreuzung" : aGui.WegMitDemSchmutz(); aGui.Kreuzung(); break;
            case "Zum Hoehleneingang" : System.out.println(2); aGui.Hoehleneingang(); break;
            case "Zum Schloss" : aGui.Marktplatz(); break;
            case "Zu deinem Heimatdorf" : aGui.Heimat(); break;
            case "Zur Hexe" : aGui.Sumpf(); break;

            case "Hoehle betreten" : aGui.Hoehle(); break;

                      /**Gaststaette**/
            case "Zur Gaststaette" : aGui.GaststaetteVor(); break;
            case "Gerne!" : aGui.Schlafen(); aGui.GaststaetteNach(); break;
            case "Nein, vielen dank." :
            case "Vielen dank, bis bald!" :
                aGui.Marktplatz(); break;

            /**Heimat**/
            case "Zurueck zum Dorfeingang" : aGui.Heimat(); break;
            case "Zur Schule" : aGui.Schule(); break;
            case "Zur Kirche" : aGui.Kirche(); break;
            case "Zum Park" : aGui.Park(); break;

            /**Hexe**/
            case "Hexenhaus betreten" :
            case "Zurueck" :
                aGui.Hexe(); break;
            case "Trankinformationen" : aGui.Trankinformationen(); break;
            case "kl. Trank = 1 Juwel" :
        }
    }
}
