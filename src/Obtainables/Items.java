package Obtainables;

public class Items {

    private String type;



    public Items( String y) {

        type = y;
    }


    public Items(){}



    public String getType(){
        return type;
    }


    public String toString() {
        return ("Item Type:" + type);
    }
}
