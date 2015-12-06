package AdventOfCode.Day2;

/**
 * Created by pintsizedev
 */
public abstract class AbstractPresentTest {

    int length;

    int width;

    int height;

    protected void setSizes(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

}
