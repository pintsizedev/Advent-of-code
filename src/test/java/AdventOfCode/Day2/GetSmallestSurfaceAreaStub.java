package AdventOfCode.Day2;

import AdventOfCode.Day2.Entity.*;
import AdventOfCode.Day2.UseCase.GetSmallestSurfaceArea;

/**
 * Created by pintsizedev
 */
class GetSmallestSurfaceAreaStub implements GetSmallestSurfaceArea {
    @Override
    public int getSmallestSide(AdventOfCode.Day2.Entity.Present present) {
        return GetTotalPaperNeededTest.SMALLEST_SIDE;
    }
}
