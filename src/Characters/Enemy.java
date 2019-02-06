package Characters;

public class Enemy extends Person {

    public Enemy(int HP, int def, int atk, int x, int y){
        super(HP, def, atk, x, y);
        
    }

    @Override
    public int getBaseHealth() {
        return 100;
    }

    @Override
    public int getBaseDefense() {
        return 50;
    }

    @Override
    public int getBaseAttack() {
        return 50;
    }
}
