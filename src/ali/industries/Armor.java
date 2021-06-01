package ali.industries;

public class Armor extends Item{
    private double damageReduktion;

    public Armor( String pName, double damageReduktion, int pID,int pPrice) {
        super(pName, pPrice, pID);
    }


    public void setDamageReduktion(double damageReduktion) {
        this.damageReduktion = damageReduktion;
    }

    public double getDamageReduktion() {
        return damageReduktion;
    }

    Armor lederLappen = new Armor("Lederlappen",0.85,4,4);
    Armor muelltuete = new Armor("Mülltüte", 0.5, 5, 10);
    Armor latexAnzug = new Armor("LatexAnzug", 0.25, 6, 20);
}
