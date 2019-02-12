package Characters;

import Obtainables.Items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player extends Person{

    private int MP;
    private int baseMP = MP;
    private int currentFloor;
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

    public void changeFloor(){
        if(getMap() == 0){
            changeMap(2);
        }
        else if(getMap() == 1){
            if(getyPos() > 18){
                changeMap(2);
            }
            else {
                changeMap(4);
            }
        }
        else if(getMap() == 2){
            if(getyPos() < 1){
                changeMap(0);
            }
            else if(getxPos() < 1){
                changeMap(1);
            }
            else if(getxPos() > 1){
                changeMap(2);
            }
            else {
                changeMap(4);
            }
        }
        else if(getMap() == 3){
            if(getyPos() < 1){
                changeMap(2);
            }
            else{
                changeMap(6);
            }
        }
        else if(getMap() == 4){
            if(getyPos() > 0){
                changeMap(1);
            }
            else if(getxPos() > 7){
                changeMap(5);
            }
            else{
                changeMap(7);
            }
        }
        else if(getMap() == 5){
            if(getyPos() > 1){
                changeMap(2);
            }
            else if (getxPos() < 1){
                changeMap(4);
            }
            else if (getxPos() > 7){
                changeMap(6);
            }
            else{
                changeMap(8);
            }
        }
        else if(getMap() == 6){
            if(getyPos() < 1){
                changeMap(3);
            }
            else if(getxPos() < 1){
                changeMap(5);
            }
            else{
                changeMap(9);
            }
        }
        else if(getMap() == 7){
            if(getxPos() < 1){
                changeMap(4);
            }
            else{
                changeMap(8);
            }
        }
        else if(getMap() == 8){
            if(getyPos() > 1){
                changeMap(5);
            }
            else if (getxPos() < 1){
                changeMap(7);
            }
            else if (getxPos() > 7){
                changeMap(9);
            }
            else{
                changeMap(10);
            }
        }
        else if(getMap() == 9){
            if(getxPos() < 1){
                changeMap(6);
            }
            else{
                changeMap(8);
            }
        }
        else if(getMap() == 10){
            if(getyPos() < 1){
                changeMap(9);
            }
            else{
                changeMap(11);
            }
        }
        else if(getMap() == 11){
            if(getyPos() < 1){
                changeMap(10);
            }
            else{
                changeMap(12);
            }
        }
        else {
            changeMap(11);
        }
    }
}
