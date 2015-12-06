package AdventOfCode.Day2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by pintsizedev
 */
public class GetTotalPaperNeededTest {

    private AdventOfCode.Day2.UseCase.GetTotalPaperNeeded totalNeeded;
    public static final int SMALLEST_SIDE = 10;
    public static final int TOTAL_AREA = 100;

    @Before
    public void setUp() throws Exception {
        totalNeeded = new GetTotalPaperNeeded(new GetSmallestSideStub(), new WorkOutTotalAreaStub());

    }

    @Test
    public void GivenTotalAreaAndSmallestSide_WhenGettingTotalPaperNeeded_ThenReturnTotalAreaPlusSmallestSide() {
        Assert.assertEquals(SMALLEST_SIDE + TOTAL_AREA, totalNeeded.getTotal(0,0,0));
    }
}