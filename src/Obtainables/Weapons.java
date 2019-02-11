package Obtainables;

public class Weapons extends Items {
    String[] giveWeapons = {
            "Raggity Stick",//Start Weapon     Set Dmg:70
            "Knights Blade",//Drop Rate:75%    Set Dmg:75
            "BFF Sword",//Drop Rate:30%        Set Dmg:100
            "B.O.R.K"};//Drop Rate:1%          Set Dmg:300
    private int effectAtk;
    private String weaponName;
    public Weapons(String type,String name, int effect){
        super(type);
        effectAtk=effect;
        weaponName=name;
    }
    public void getAttack()
    {
        int prob1= (int)(Math.random()*100)+1;
        if(prob1==1 )
        {
            effectAtk= 150;
            weaponName="B.O.R.K";
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            effectAtk= 100;
            weaponName="BFF Sword";
        }
        prob1 = (int)(Math.random()*4)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            effectAtk= 75;
            weaponName="Knights Blade";
        }
        effectAtk= 0;
        weaponName="Mpthomg";
    }
    @Override
    public String toString() {
        return (super.toString() +
                "\nItem Name: " + weaponName+
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
