package Characters;

import Obtainables.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player extends Person{

    private int MP;
    private int baseMP = MP;
    private List<Items> inventory;
    private List<String> spells = Arrays.asList("Fire", "Cure", "Lightning", "Hurricane", "Supernova");
    private List<Integer> spellcost = Arrays.asList(25, 120, 50, 80, 120);

    public Player(int HP, int MP, int def, int atk, int map, int xPos, int yPos, List<Items> inventory){
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
        for(int i = 0; i < inventory.size(); i++){
            str += inventory.get(i).getName() + ", ";
        }
        str += inventory.get(inventory.size()-1).getName();
        return str;
    }

    public void useItem(Items x){
        if(inventory.indexOf(x) > 0){
            if(x.getType() == "health"){
            }
        }
    }
}
