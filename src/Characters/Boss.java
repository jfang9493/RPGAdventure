package Characters;


public class Boss extends Person {
    public Boss(int HP, int def, int atk, int map, int x, int y)
    {
        super(HP, def, atk, map, x, y);
    }

    public int getBaseHealth()
    {
        return 400;
    }
    public int getBaseDefense() {
        return 80;
    }
    /** @Override
    public int getBaseMagic() {
        return 100;
    } **/

    public int getBaseAttack() {
        return 80;
    }
}
