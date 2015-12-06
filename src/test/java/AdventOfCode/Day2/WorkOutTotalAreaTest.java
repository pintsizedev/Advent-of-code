package AdventOfCode.Day2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pintsizedev
 */
public class WorkOutTotalAreaTest {

    AdventOfCode.Day2.UseCase.WorkOutTotalArea totalArea;

    private void assertArea(int expectedArea, Present present) {
        Assert.assertEquals(expectedArea, totalArea.getTotalArea(present));
    }

    private int calculateExpectedArea(int length, int width, int height) {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }

    @Before
    public void setUp() throws Exception {
        totalArea = new WorkOutTotalArea();
    }

    @Test
    public void GivenAllSizesOne_WhenGettingTotalArea_ThenReturnSix() {
        assertArea(6, new Present(1,1,1));
    }

    @Test
    public void GivenAllSizesDifferent_WhenGettingTotalArea_ThenReturnCorrectTotal() {
        int length = 1;
        int width = 2;
        int height = 3;
        assertArea(calculateExpectedArea(length, width, height), new Present(length, width, height));
    }

}