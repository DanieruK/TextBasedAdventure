package ali.industries;

public class Inventory {

    private String[] slot = new String[4];
    private int slotCounter = 0;
    private String currentWeapon;
    private String currenAromoury;

    public void setCurrenAromoury(String pCurrenAromoury) {
        this.currenAromoury = pCurrenAromoury;
    }

    public void setCurrentWeapon(String pCurrentWeapon) {
        this.currentWeapon = pCurrentWeapon;
    }

    public void addItem(String pItem){
        if (slotCounter < slot.length){
            slot[slotCounter] = pItem;
            slotCounter++;
        }else System.out.println("ERROR!!! Item slot voll");
    }
    
    public void removeItem(){
        if (slotCounter > 0){
            slot[slotCounter] = null;
        }
    }

}
