package Characters;

import Obtainables.Items;

public class Player extends Person{

    private int MP;
    private int baseMP = MP;
    private Items[] inventory;

    public Player(int HP, int MP, int def, int atk, int map, int xPos, int yPos, Items[] inventory){
        super(HP, def, atk, map, xPos, yPos);
        this.MP = MP;
        this.inventory = inventory;
    }

    public int getBaseMP(){
        return baseMP;
    }

    public int getMP(){
        return MP;
    }

    public void changeMP(int val){
        MP += val;
    }

    public String showInventory(){
        String str = "";
        for(int i = 0; i < inventory.length; i++){
            //str += inventory[i].getName;
        }
        return str;
    }

    public void useItem(Items x){

    }
}
