package Characters;

public class Boss  implements Person
{

    @Override
    public int getBaseHealth()
    {
        return 400;
    }

    @Override
    public int getBaseDefense() {
        return 80;
    }

    @Override
    public int getBaseMagic() {
        return 100;
    }

    @Override
    public int getBaseAttack() {
        return 80;
    }
}
