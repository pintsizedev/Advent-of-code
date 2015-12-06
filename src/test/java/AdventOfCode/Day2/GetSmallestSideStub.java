package AdventOfCode.Day2;

/**
 * Created by pintsizedev
 */
class GetSmallestSideStub implements AdventOfCode.Day2.UseCase.GetSmallestSide {
    @Override
    public int getSmallestSide(int length, int width, int height) {
        return GetTotalPaperNeededTest.SMALLEST_SIDE;
    }
}
