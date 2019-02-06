package Characters;

public abstract class Person {
    private int baseHP, baseDef, baseAtk, map, xPos, yPos;
    private int HP = baseHP;
    private int def = baseDef;
    private int atk = baseAtk;

    public Person(int HP, int def, int atk, int map, int x, int y){
        this.baseHP = HP;
        this.baseDef = def;
        this.baseAtk = atk;
        this.map = map;
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

    public int getxPos(){
        return xPos;
    }

    public int getyPos(){
        return yPos;
    }

    public int getMap(){
        return map;
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

    public void changePos(int x, int y){
        xPos += x;
        yPos += y;
    }

    public void changeMap(int num){
        map = num;
    }
}
