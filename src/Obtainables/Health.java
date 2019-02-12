package Obtainables;

public class Health extends Items {

    String[] giveHealth = {
            "Band-Aid",//Drop Rate:75%    health: 10
            "Health Pot",//Drop Rate:50%   health: 20
            "Mom's Chicken Soup",//Drop Rate:30%   health: 30
            "Rainbow Health Drop"};//Drop Rate:1% Max health: +50 Health Recovery:50

    private int effectHealth;
    private String healthName;
    private String typeH;

    public Health(String type, String name, int effect) {
        super(type, name, effect);
        typeH = "Health";
        effectHealth = effect;
        healthName = name;
    }

    public void giveHealth() {
        int prob1 = (int) (Math.random() * 100) + 1;
        if (prob1 == 1) {
            effectHealth = 50;
            healthName = "Rainbow Health Drop";
        }
        prob1 = (int) (Math.random() * 10) + 1;
        if (prob1 == 1 || prob1 == 2 || prob1 == 3) {
            effectHealth = 30;
            healthName = "Mom's Chicken Soup";
        }
        prob1 = (int) (Math.random() * 2) + 1;
        if (prob1 == 1) {
            effectHealth = 20;
            healthName = "Health Pot";
        }
        prob1 = (int) (Math.random() * 4) + 1;
        if (prob1 == 1 || prob1 == 2 || prob1 == 3) {
            effectHealth = 10;
            healthName = "Band-Aid";
        }
        effectHealth = 0;
        healthName = "Mpthomg";
    }
}
    /*
    public int giveHealth() {
        int prob1 = (int)(Math.random()*100)+1;
        if(prob1==1)
        {
            return 50;
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 30;
        }
        prob1 = (int)(Math.random()*2)+1;
        if(prob1==1)
        {
            return 20;
        }
        prob1=(int)(Math.random()*4)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 10;
        }
        return 0;
    }
    */

