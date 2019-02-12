package Characters;
import Obtainables.Items;
import Obtainables.Weapons;
import Obtainables.Defense;
public class Enemy extends Person {

    private Items drop;

    public Enemy(int HP, int def, int atk, int map, int x, int y, Items drop){
        super(HP, def, atk, map, x, y);
        this.drop = drop;
    }

}
