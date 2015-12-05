package Day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pintsizedev
 */
public class GetSmallestSideTest {

    Day2.UseCase.GetSmallestSide getSmallest;
    int length;
    int width;
    int height;

    private void assertSmallestSide(int expectedArea) {
        assertEquals(expectedArea, getSmallest.getSmallestSide(length, width, height));
    }

    @Before
    public void setUp() throws Exception {
        getSmallest = new GetSmallestSide();
    }

    @Test
    public void givenSidesAllOfLengthOne_whenGettingSmallestSize_returnOne() {
        length = 1;
        width = 1;
        height = 1;

        assertSmallestSide(1);
    }

    @Test
    public void GivenAllButOneSideIsOfLengthOne_WhenGettingSmallestSize_ThenReturnOne() {
        length = 1;
        width = 1;
        height = 10;

        assertSmallestSide(1);
    }

    @Test
    public void GivenOneLengthOneAndOtherSizesTen_WhenGettingSmallestSize_ThenReturnTen() {
        length = 1;
        width = 10;
        height = 10;

        assertSmallestSide(10);
    }

    @Test
    public void GivenLengthAndWidthSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesWidth() {
        length = 1;
        width = 2;
        height = 10;

        assertSmallestSide(length * width);
    }

    @Test
    public void GivenLengthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesHeight() {
        length = 1;
        width = 10;
        height = 2;

        assertSmallestSide(length * height);
    }

    @Test
    public void GivenWidthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnWidthTimesHeight() {
        length = 10;
        width = 1;
        height = 2;

        assertSmallestSide(width * height);
    }
}