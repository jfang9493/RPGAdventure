package Characters;

public class Person {
    private int baseHP;
    private int baseDef;
    private int baseMP;
    private int baseAtk;
    private int HP = baseHP;
    private int MP = baseMP;
    private int def = baseDef;
    private int atk = baseAtk;
    private int Xloc, Yloc;

    public int getBaseHealth() {
        return baseHP;
    }

    public int getBaseDefense() {
        return baseDef;
    }

    public int getBaseMagic() {
        return baseMP;
    }

    public int getBaseAttack() {
        return baseAtk;
    }

    public int getHP(){
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getAtk(){
        return atk;
    }

    public int getDef(){
        return def;
    }

    public void changeHP(int val){
        HP += val;
    }

    public void changeMP(int val){
        MP += val;
    }

    public void changeAtk(int val){
        atk += val;
    }

    public void changeDef(int val){
        def += val;
    }
}
