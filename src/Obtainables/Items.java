package Obtainables;

public class Items {
    private String name;
    private String type;


    public Items(String n, String y){
        name = n;
        type = y;

    }

    public Items(){}

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String toString()
    {
        return("Item Name: "+name
                +"\n"
                + "Item Type:"+type);
    }
}
