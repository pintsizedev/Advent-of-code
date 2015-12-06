package AdventOfCode.Day2;

import AdventOfCode.Day2.UseCase.GetSmallestSide;
import AdventOfCode.Day2.UseCase.WorkOutTotalArea;

/**
 * Created by pintsizedev
 */
public class GetTotalPaperNeeded implements AdventOfCode.Day2.UseCase.GetTotalPaperNeeded {

    AdventOfCode.Day2.UseCase.GetSmallestSide getSmallestSide;
    WorkOutTotalArea workOutTotalArea;

    public GetTotalPaperNeeded(GetSmallestSide getSmallestSide, WorkOutTotalArea workOutTotalArea) {
        this.getSmallestSide = getSmallestSide;
        this.workOutTotalArea = workOutTotalArea;
    }

    @Override
    public int getTotal(int length, int width, int height) {
        int smallestSide = this.getSmallestSide.getSmallestSide(length, width, height);
        int totalArea = this.workOutTotalArea.getTotalArea(length, width, height);
        return smallestSide + totalArea;
    }
}
