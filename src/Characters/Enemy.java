package Characters;

public class Enemy implements Person {

    @Override
    public int getBaseHealth() {
        return 100;
    }

    @Override
    public int getBaseDefense() {
        return 50;
    }

    @Override
    public int getBaseMagic() {
        return 10;
    }

    @Override
    public int getBaseAttack() {
        return 50;
    }
}
