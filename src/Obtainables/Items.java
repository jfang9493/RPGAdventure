package Obtainables;

public class Items {

    private String name;
    private String type;
    private int effect;

    public Items(String y, String n, int e){
        name = y;
        type = n;
        effect = e;
    }

    public Items(){}

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getEffect(){
        return effect;
    }
}
