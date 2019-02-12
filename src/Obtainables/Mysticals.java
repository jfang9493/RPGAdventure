package Obtainables;
//d
public class Mysticals extends Items {
    String[] giveMysticals = {
            "SmolFire",//What the player is starts with   Cost: 10 Mana Dmg:10
            "BiggerFire", //Drop Rate:25%                 Cost: 20 Mana Dmg:30
            "Napalm",//Drop Rate:10%                      Cost: 50 Mana Dmg:50
            "SuperNova"}; //Drop Rate:1%                  Cost: 75 Mana Dmg:100

    //Acc.. To Brandon, Player already has the spells so probably no drop rate

    public int mpDmg(String name) {
        if(name.equalsIgnoreCase("SmolFire"))
        {
            return 10;
        }
        else if(name.equalsIgnoreCase("BiggerFire"))
        {
            return 30;
        }
        else if(name.equalsIgnoreCase("Napalm"))
        {
            return 50;
        }
        else if(name.equalsIgnoreCase("supernova"))
        {
            return 100;
        }
        else{
            return 0;
        }

    }
}
