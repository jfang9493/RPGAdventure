package Obtainables;

public class Items {
    private String name;
    private String type;
    private String effect;

    public Items(String n, String y, String e){
        name = n;
        type = y;
        effect = e;
    }

    public Items(){}

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getEffect(){
        return effect;
    }
}
