package Day2;

/**
 * Created by pintsizedev
 */
class GetSmallestSideStub implements Day2.UseCase.GetSmallestSide {
    @Override
    public int getSmallestSide(int length, int width, int height) {
        return GetTotalPaperNeededTest.SMALLEST_SIDE;
    }
}
