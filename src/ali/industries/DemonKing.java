package ali.industries;

public class DemonKing extends Entity{

    private int damage2;
    private int firstAttackDamage;
    private int firstAttackCounter = 1;
    private int combatCounter;
    private int healingCounter = 3;

    public DemonKing(String pName, int pLP, int pDamage, int pDamage2, int pFirstAttackDamage) {
        super(pName, pLP, pDamage);
        damage2 =pDamage2;
        firstAttackDamage = pFirstAttackDamage;
    }

    public int getFirstAttackDamage() {
        return firstAttackDamage;
    }

    public int getFirstAttackCounter() {
        return firstAttackCounter;
    }

    public void reduceFirstAttackCounter() {
        this.firstAttackCounter = 0;
    }

    public void setCombatCounter(int combatCounter) {
        this.combatCounter = combatCounter;
    }

    public int getCombatCounter() {
        return combatCounter;
    }

    public int getDamage2() {
        return damage2;
    }

    public int getHealingCounter() {
        return healingCounter;
    }

    public void reduceHealingCounter() {
        this.healingCounter =- 1;
    }
}
