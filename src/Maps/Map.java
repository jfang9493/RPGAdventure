package Maps;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Map {
    private DigitalPicture map;
    private int x;
    private int y;
    private BufferedImage bufferedImage;
    public Map(DigitalPicture map, int x, int y)
    {
        this.map = map;
        this.x =x;
        this.y= y;
    }
    public int getPixelValue()
    {
        return
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
    public boolean ifWalkable()
    {
        boolean isBlack = false;
        boolean isYellow = false;
        boolean isRed = false;
        if()
    }
}
