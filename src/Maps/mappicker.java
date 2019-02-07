package Maps;

public interface mappicker
{
    public String determineMap();
    public void show();
    public int getBasicPixel(int x, int y);

    public void setBasicPixel(int x, int y, int value);
}
