package Day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pintsizedev
 */
public class GetTotalPaperNeededTest {

    private Day2.UseCase.GetTotalPaperNeeded totalNeeded;
    public static final int SMALLEST_SIDE = 10;
    public static final int TOTAL_AREA = 100;

    @Before
    public void setUp() throws Exception {
        totalNeeded = new GetTotalPaperNeeded(new GetSmallestSideStub(), new WorkOutTotalAreaStub());

    }

    @Test
    public void GivenTotalAreaAndSmallestSide_WhenGettingTotalPaperNeeded_ThenReturnTotalAreaPlusSmallestSide() {
        assertEquals(SMALLEST_SIDE + TOTAL_AREA, totalNeeded.getTotal(0,0,0));
    }
}