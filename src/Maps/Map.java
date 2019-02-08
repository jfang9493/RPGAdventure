package Maps;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Map extends SimplePicture {
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
    public Map(String fileName)
    {
        super(fileName);

    }
    public Map(Map copyMap)
    {
        super(copyMap);
    }
    public Map(BufferedImage image)
    {
        super(image);
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
    public int[][] generateArray()
    {
        int[][] mapArray = new int[bufferedImage.getWidth()][bufferedImage.getHeight()];
        for(int i =0; i<bufferedImage.getHeight();i++)
        {
            for(int j= 0; j<bufferedImage.getWidth();j++)
            {
                mapArray[i][j] =
            }
        }
    }
    public static void main(String[] args)
    {
        Map start = new Map()
    }
}
