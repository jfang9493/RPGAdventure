package Characters;

public class Boss  implements Person
{

    @Override
    public int getBaseHealth()
    {
        return 500;
    }

    @Override
    public int getBaseDefense() {
        return 250;
    }

    @Override
    public int getBaseMagic() {
        return 100;
    }

    @Override
    public int getBaseAttack() {
        return 100;
    }
}
