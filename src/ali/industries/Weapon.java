package ali.industries;

public class Weapon extends Item {
    private int damage;

    public Weapon(String pName, int pDamage, int pPrice, int pID) {
        super(pName, pPrice, pID);
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    Weapon langschwert = new Weapon("LongDong",10,1,0);
    Weapon dolch = new Weapon("2cmNahKampfStechele",20,2,10 );
    Weapon breitschwert = new Weapon("DerFühltSichZuBreit", 40, 3, 0);

}
