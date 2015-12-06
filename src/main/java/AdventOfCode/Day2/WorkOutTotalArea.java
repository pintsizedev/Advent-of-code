package AdventOfCode.Day2;

import AdventOfCode.Day2.Entity.*;

/**
 * Created by pintsizedev
 */
public class WorkOutTotalArea implements AdventOfCode.Day2.UseCase.WorkOutTotalArea{
    @Override
    public int getTotalArea(AdventOfCode.Day2.Entity.Present present) {
        int length = present.getLength();
        int width = present.getWidth();
        int height = present.getHeight();

        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
}
