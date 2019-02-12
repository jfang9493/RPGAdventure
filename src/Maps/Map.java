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
    public Map()
    {
        super();
    }
    public Map(DigitalPicture map, int x, int y)
    {
        // set the picture
        this.map = map;

        // set the x location
        this.x = x;

        // set the y location
        this.y = y;

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
    public int getRed() {
        int value = map.getBasicPixel(x,y);
        int red = (value >> 16) & 0xff;
        return red;
    }
    public static int getRed(int value)
    {
        int red = (value >> 16) & 0xff;
        return red;
    }
    public int getGreen() {
        int value = map.getBasicPixel(x,y);
        int green = (value >>  8) & 0xff;

        return green;
    }
    public static int getGreen(int value)
    {
        int green = (value >> 8) & 0xff;
        return green;
    }
    public int getBlue() {
        int value = map.getBasicPixel(x,y);
        int blue = value & 0xff;
        return blue;
    }
    public static int getBlue(int value)
    {
        int blue = value & 0xff;
        return blue;
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
        boolean isGrey = false;
        boolean isMonster = false;
        boolean tileChecker = false;
        int[][] newArray = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        int[][] red = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        int[][] green = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        int[][] blue  = new int[bufferedImage.getHeight()][bufferedImage.getWidth()];
        for(int i =0; i< newArray.length;i++)
        {
            for(int j = i;j<newArray[i].length;j++)
            {
                blue[i][j] = getBlue();
                green[i][j] = getGreen();
                red[i][j] = getRed();
                newArray[i][j] = (blue[i][j] + green[i][j] + red[i][j]);
            }
        }
        for(int i =0; i< newArray.length;i++)
        {
            for(int j = i; j< newArray[i].length;j++)
            {
                if(newArray[i][j] == 384)
                {
                    isGrey = true;
                    tileChecker = isGrey;
                }
                else if(newArray[i][j]==510)
                {
                    isYellow = true;
                    tileChecker = isYellow;
                }
                else if(newArray[i][j]==0)
                {
                    isBlack = true;
                    tileChecker = ;
                }
                else
                {
                    isMonster = true;
                    tileChecker = isMonster;
                }
            }
        }
        return tileChecker;
    }
    public void copy(Picture fromPic, int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
             fromRow < fromPixels.length &&
                     toRow < toPixels.length;
             fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol;
                 fromCol < fromPixels[0].length &&
                         toCol < toPixels[0].length;
                 fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
}
