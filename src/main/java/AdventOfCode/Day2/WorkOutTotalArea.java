package AdventOfCode.Day2;

/**
 * Created by pintsizedev
 */
public class WorkOutTotalArea implements AdventOfCode.Day2.UseCase.WorkOutTotalArea{
    @Override
    public int getTotalArea(int length, int width, int height) {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
}
