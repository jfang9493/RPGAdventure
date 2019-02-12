package Obtainables;

public class Defense extends Items {
    String[] giveDefense = {
            "Raggity Woodplank",//Starting Defense     Defense:0
            "Adequate Armor",//Drop Rate:80%           Defense:25
            "Knights Vow",//Drop Rate:50%              Defense 40
            "Something Armor",//Drop Rate:20%          Defense: 60
            "Ultimate Mystical Shiny Armor"};//Drop Rate:1% Defense 125

    private int effectDef;
    private String DefName;
    public Defense(String type,String name, int effect) {
        super(type,name,effect);
        effectDef = effect;
        DefName = name;
    }

    public void setDefense() {
        int prob1 = (int) (Math.random() * 100) + 1;
        if (prob1 == 1) {
            effectDef = 125;
            DefName= "Ultimate Mystical Shiny Armor";
        }
        prob1 = (int) (Math.random() * 10) + 1;
        if (prob1 == 1 || prob1 == 2) {
            effectDef = 60;
            DefName="Something Armor";
        }
        prob1 = (int) (Math.random() * 2) + 1;
        if (prob1 == 1) {
            effectDef = 40;
            DefName="Knights Vow";
        }
        prob1 = (int) (Math.random() * 10) + 1;
        if (prob1 != 1 && prob1 != 2) {
            effectDef = 25;
            DefName="Adequate Armor";
        }
        effectDef = 0;
        DefName="Raggity Woodplank";
    }
}