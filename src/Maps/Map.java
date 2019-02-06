package Maps;

public class Map implements mappicker
{
    private mappicker map;
    private int x;
    private int y;
    public Map(mappicker map, int x, int y)
    {
        this.map = map;
        this.x = x;
        this.y = y;
    }

    @Override
    public String determineMap()
    {
        Map img = new Map("bogboxx.png");
        int[][] pixels = new int[w][h];

        for( int i = 0; i < w; i++ )
            for( int j = 0; j < h; j++ )
                pixels[i][j] = img.getRGB( i, j );

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void show() {

    }

    @Override
    public int getBasicPixel(int x, int y) {
        return 0;
    }
}
