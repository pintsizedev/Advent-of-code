package Day2;

import Day2.UseCase.*;

/**
 * Created by pintsizedev
 */
class WorkOutTotalAreaStub implements Day2.UseCase.WorkOutTotalArea {
    @Override
    public int getTotalArea(int length, int width, int height) {
        return GetTotalPaperNeededTest.TOTAL_AREA;
    }
}
