package AdventOfCode.Day2;

/**
 * Created by pintsizedev
 */
public class Present implements AdventOfCode.Day2.Entity.Present {

    int length;

    int width;

    int height;

    public Present(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
