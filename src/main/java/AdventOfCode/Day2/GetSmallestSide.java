package AdventOfCode.Day2;

import java.util.Arrays;

public class GetSmallestSide implements AdventOfCode.Day2.UseCase.GetSmallestSide {

    @Override
    public int getSmallestSide(int length, int width, int height) {
        int lw = length * width;
        int lh = length * height;
        int wh = width * height;

        int[] areas = {lw, lh, wh};
        Arrays.sort(areas);

        return areas[0];
    }
}
