package Maps;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Map extends SimplePicture {
    private DigitalPicture map;
    private int x;
    private int y;
    int currentMap = 0;
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

    /*
     * determineifWalkable creates a 2d array where the values of each pixel are stored,
     * then returns a string to see if the spot is walkable.
     */
    public String determineifWalkable()
    {
        String isBlack = null;
        String isYellow = null;
        String isGrey = null;
        String isMonster = null;
        String tileChecker = null;
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
                    isGrey = "grey";
                    tileChecker = isGrey;
                }
                else if(newArray[i][j]==510)
                {
                    isYellow = "yellow";
                    tileChecker = isYellow;
                }
                else if(newArray[i][j]==0)
                {
                    isBlack = "black";
                    tileChecker = isBlack;
                }
                else
                {
                    isMonster = "monster";
                    tileChecker = isMonster;
                }
            }
        }
        return tileChecker;
    }
    public boolean isWalkable()
    {
        boolean isDoor = false;
        boolean isMonster = false;
        if(determineifWalkable().equals("grey"))
        {
            return true;
        }
        if(determineifWalkable().equals("yellow"))
        {
            isDoor = true;
            return true;
        }
        if(determineifWalkable().equals("black"))
        {
            return false;
        }
        if(determineifWalkable().equals("monster"))
        {
            isMonster = true;
            return true;
        }
        return true;
    }
    public void changeRoom()
    {
        if(currentMap == 0){
            currentMap = 2;
        }
        else if(currentMap == 1){
        }
        else if(currentMap == 2){
        }
        else if(currentMap == 3){
        }
        else if(currentMap == 4){
        }
        else if(currentMap == 5){
        }
        else if(currentMap == 6){
        }
        else if(currentMap == 7){
        }
        else if(currentMap == 8){
        }
        else if(currentMap == 9){
        }
        else if(currentMap == 10){
        }
        else if(currentMap == 11){
        }
        else if(currentMap == 12){
        }
        else {
            currentMap = 12;
        }
    }
}
