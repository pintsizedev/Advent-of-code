package Day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pintsizedev
 */
public class WorkOutTotalAreaTest extends AbstractPresentTest {

    Day2.UseCase.WorkOutTotalArea totalArea;

    private void assertArea(int expectedArea) {
        assertEquals(expectedArea, totalArea.getTotalArea(length, width, height));
    }

    private int calculateExpectedArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }

    @Before
    public void setUp() throws Exception {
        totalArea = new WorkOutTotalArea();
    }

    @Test
    public void GivenAllSizesOne_WhenGettingTotalArea_ThenReturnSix() {
        this.setSizes(1, 1, 1);
        assertArea(6);
    }

    @Test
    public void GivenAllSizesDifferent_WhenGettingTotalArea_ThenReturnCorrectTotal() {
        this.setSizes(1, 2, 3);
        assertArea(calculateExpectedArea());
    }

}