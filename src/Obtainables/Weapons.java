package Obtainables;

public class Weapons extends Items {
    String[] giveWeapons = {
            "Raggity Stick",//Start Weapon     Set Dmg:70
            "Knights Blade",//Drop Rate:75%    Set Dmg:75
            "BFF Sword",//Drop Rate:30%        Set Dmg:100
            "B.O.R.K"};//Drop Rate:1%          Set Dmg:300
    public int effectAtk;
    public String WeaponName;
    public Weapons(String type, int effect){
        super(type);
        effectAtk=effect;
    }
    public int getAttack()
    {
        int prob1= (int)(Math.random()*100)+1;
        if(prob1==1 )
        {
            effectAtk= 150;
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            effectAtk= 100;
        }
        prob1 = (int)(Math.random()*4)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            effectAtk= 75;
        }
        effectAtk= 0;
    }
    @Override
    public String toString() {
        return (super.toString() +
                "\nItem Effect: " + effectAtk);

    }
    /*
    public int giveAttack()
    {
        int prob1= (int)(Math.random()*100)+1;
        if(prob1==1 )
        {
            return 150;
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 100;
        }
        prob1 = (int)(Math.random()*4)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 75;
        }
        return 0;
    }
    */
}
