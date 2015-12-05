package Day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pintsizedev
 */
public class GetSmallestSideTest extends AbstractPresentTest {

    Day2.UseCase.GetSmallestSide getSmallest;

    private void assertSmallestSide(int expectedArea) {
        assertEquals(expectedArea, getSmallest.getSmallestSide(length, width, height));
    }

    @Before
    public void setUp() throws Exception {
        getSmallest = new GetSmallestSide();
    }

    @Test
    public void givenSidesAllOfLengthOne_whenGettingSmallestSize_returnOne() {
        this.setSizes(1, 1, 1);
        assertSmallestSide(1);
    }

    @Test
    public void GivenAllButOneSideIsOfLengthOne_WhenGettingSmallestSize_ThenReturnOne() {
        this.setSizes(1,1,10);
        assertSmallestSide(1);
    }

    @Test
    public void GivenOneLengthOneAndOtherSizesTen_WhenGettingSmallestSize_ThenReturnTen() {
        this.setSizes(1, 10, 10);
        assertSmallestSide(10);
    }

    @Test
    public void GivenLengthAndWidthSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesWidth() {
        this.setSizes(1, 2, 10);
        assertSmallestSide(length * width);
    }

    @Test
    public void GivenLengthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnLengthTimesHeight() {
        this.setSizes(1, 10, 2);
        assertSmallestSide(length * height);
    }

    @Test
    public void GivenWidthAndHeightSmallestAndBothDifferent_WhenGettingSmallestSize_ThenReturnWidthTimesHeight() {
        this.setSizes(10, 1, 2);
        assertSmallestSide(width * height);
    }
}