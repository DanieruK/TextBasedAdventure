package ali.industries;

public class Item {
    protected int price;
    protected String name;
    protected int iD;
    protected int anz;

    public Item( String pName, int pPrice, int pID){
        price = pPrice;
        name = pName;
        iD = pID;
    }

    public void setAnz(int anz) {
        this.anz = anz;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAnz() {
        return anz;
    }

    public int getiD() {
        return iD;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}

