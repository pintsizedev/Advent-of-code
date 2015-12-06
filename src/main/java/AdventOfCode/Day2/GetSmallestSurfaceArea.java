package AdventOfCode.Day2;

import AdventOfCode.Day2.Entity.*;

import java.util.Arrays;

public class GetSmallestSurfaceArea implements AdventOfCode.Day2.UseCase.GetSmallestSurfaceArea {

    @Override
    public int getSmallestSide(AdventOfCode.Day2.Entity.Present present) {
        int lw = present.getLength() * present.getWidth();
        int lh = present.getLength() * present.getHeight();
        int wh = present.getWidth()* present.getHeight();

        int[] areas = {lw, lh, wh};
        Arrays.sort(areas);

        return areas[0];
    }
}
