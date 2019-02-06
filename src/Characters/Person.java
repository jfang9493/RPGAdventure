package Characters;

public abstract class Person {
    private int baseHP;
    private int baseDef;
    private int baseAtk;
    private int HP = baseHP;
    private int def = baseDef;
    private int atk = baseAtk;
    private int xPos, yPos;

    public Person(int HP, int def, int atk, int x, int y){
        this.baseHP = HP;
        this.baseDef = def;
        this.baseAtk = atk;
        this.xPos = x;
        this.yPos = y;
    }

    public int getBaseHealth() {
        return baseHP;
    }

    public int getBaseDefense() {
        return baseDef;
    }

    /*public int getBaseMagic() {
        return baseMP;
    }*/

    public int getBaseAttack() {
        return baseAtk;
    }

    public int getHP(){
        return HP;
    }

    /*public int getMP() {
        return MP;
    }*/

    public int getAtk(){
        return atk;
    }

    public int getDef(){
        return def;
    }

    public void changeHP(int val){
        HP += val;
    }

    /*public void changeMP(int val){
        MP += val;
    }*/

    public void changeAtk(int val){
        atk += val;
    }

    public void changeDef(int val){
        def += val;
    }
}
