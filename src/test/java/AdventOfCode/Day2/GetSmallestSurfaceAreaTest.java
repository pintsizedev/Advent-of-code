package AdventOfCode.Day2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by pintsizedev
 */
public class GetSmallestSurfaceAreaTest {

    GetSmallestSurfaceArea getSmallest;

    private void assertSmallestSide(int expectedArea, Present present) {
        Assert.assertEquals(expectedArea, getSmallest.getSmallestSide(present));
    }

    @Before
    public void setUp() throws Exception {
        getSmallest = new GetSmallestSurfaceArea();
    }

    @Test
    public void givenSidesAllOfLengthOne_whenGettingSmallestSize_returnOne() {
        assertSmallestSide(1 ,new Present(1, 1, 1));
    }

    @Test
    public void GivenAllButOneSideIsOfLengthOne_WhenGettingSmallestSize_ThenReturnOne() {
        assertSmallestSide(1, new Present(1, 1, 10));
    }

    @Test
    public void GivenOneLengthOneAndOtherSizesTen_WhenGettingSmallestSize_ThenReturnTen() {
        assertSmallestSide(10, new Present(1, 10, 10));
    }

    @Test
    public void GivenLengthAndWidthSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesWidth() {
        int length = 1;
        int width = 2;
        assertSmallestSide(length * width, new Present(length, width, 10) );
    }

    @Test
    public void GivenLengthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesHeight() {
        int length = 1;
        int height = 2;
        assertSmallestSide(length * height, new Present(length, 10, height));
    }

    @Test
    public void GivenWidthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnWidthTimesHeight() {
        int width = 1;
        int height = 2;
        assertSmallestSide(width * height, new Present(10, width, height));
    }
}