package Obtainables;

public class Health extends Items {
    String[] giveHealth = {
            "Band-Aid",//Drop Rate:75%    health: 10
            "Health Pot",//Drop Rate:50%   health: 20
            "Mom's Chicken Soup",//Drop Rate:30%   health: 30
            "Rainbow Health Drop"};//Drop Rate:1% Max health: +50 Health Recovery:50

    public int giveHealth(String name) {
        int prob1= (int)(Math.random()*4)+1;
        System.out.println(prob1);
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 10;
        }
        prob1 = (int)(Math.random()*2)+1;
        if(prob1==1)
        {
            return 20;
        }
        prob1 = (int)(Math.random()*10)+1;
        if(prob1==1 || prob1==2 || prob1==3)
        {
            return 30;
        }
        return 0;
    }
}
