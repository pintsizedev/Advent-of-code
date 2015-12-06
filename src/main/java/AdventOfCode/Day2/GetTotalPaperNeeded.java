package AdventOfCode.Day2;

import AdventOfCode.Day2.Entity.*;
import AdventOfCode.Day2.UseCase.GetSmallestSurfaceArea;
import AdventOfCode.Day2.UseCase.WorkOutTotalArea;

/**
 * Created by pintsizedev
 */
public class GetTotalPaperNeeded implements AdventOfCode.Day2.UseCase.GetTotalPaperNeeded {

    GetSmallestSurfaceArea getSmallestSurfaceArea;
    WorkOutTotalArea workOutTotalArea;

    public GetTotalPaperNeeded(GetSmallestSurfaceArea getSmallestSurfaceArea, WorkOutTotalArea workOutTotalArea) {
        this.getSmallestSurfaceArea = getSmallestSurfaceArea;
        this.workOutTotalArea = workOutTotalArea;
    }

    @Override
    public int getTotal(AdventOfCode.Day2.Entity.Present present) {
        int smallestSide = this.getSmallestSurfaceArea.getSmallestSide(present);
        int totalArea = this.workOutTotalArea.getTotalArea(present);
        return smallestSide + totalArea;
    }
}
