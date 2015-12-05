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

    private void assertSmallestSide(int length) {
        assertEquals(1, getSmallest.getSmallestSide(length, width, height));
    }

    @Before
    public void setUp() throws Exception {
        getSmallest = new GetSmallestSide();
    }

    @Test
    public void givenSidesAllOfLengthOne_whenGettingSmallestSize_returnOne() throws Exception {
        length = 1;
        width = 1;
        height = 1;

        assertSmallestSide(1);
    }
}