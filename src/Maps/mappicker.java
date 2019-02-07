package Maps;

public interface mappicker
{
    public void determineMap();
    public void show();
    public int getBasicPixel(int x, int y);

    public void setBasicPixel(int x, int y, int value);
}
