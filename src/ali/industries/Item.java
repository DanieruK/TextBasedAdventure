package ali.industries;

public class Item {
    protected int price;
    protected String name;
    protected int iD;

    public Item( String pName, int pPrice, int pID){
        price = pPrice;
        name = pName;
        iD = pID;
    }

    public String getName() {
        return name;
    }

}

