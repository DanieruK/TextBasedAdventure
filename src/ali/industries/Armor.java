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

}
