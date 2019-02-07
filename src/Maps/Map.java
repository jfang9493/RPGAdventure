package Maps;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Map implements mappicker
{
    private mappicker map;
    private int x;
    private int y;
    private BufferedImage bufferedImage;
    public Map(mappicker map, int x, int y) {
    this.map = map;
    this.x =x;
    this.y = y;
    }
    public void determineMap()
    {
        BufferedImage img = null;
        try
        {
            img  = ImageIO.read(new File("bigboxx.png"));
        }
        catch (IOException e)
        {
        }

    }
    public int getPixel(int x, int y)
    {
        return bufferedImage.getRGB(x,y);
    }
    public boolean ifWalkable(int x, int y)
    {
        boolean ifBlack = false;
        boolean isYellow = false;
        boolean isRed = false;

        if()
        {
            ifBlack = true;
        }
        if(getPixel(x, y)==)
        return ifBlack;
    }.
    public int[][] createMap()
    {
        int[][] currentMap = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        for(int i =0; i<bufferedImage.getWidth();i++)
        {
            for(int j = 0; j<bufferedImage.getHeight();j++)
            {
                currentMap[i][j] = getPixel(x,y);
            }
        }
        return currentMap;
    }
    public void show()
    {

    }
    public int getBasicPixel(int x, int y) {
        return 0;
    }
    public void setBasicPixel(int x, int y, int value)
    {
    }
}
