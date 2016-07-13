package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidstone on 7/13/16.
 */
public class LionTest {

    @Test
    public void testIfLionNoiseIsCorrect() throws Exception {

        Lion lion = new Lion(true);
        String expectedNoise = "Roar!!!";
        String actualNoise = lion.makeNoise();
        assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void testIfLionTopSpeedIsCorrect() throws Exception {

        Lion lion = new Lion(true);
        int expectedTopSpeed = 50;
        int actualTopSpeed = lion.getTopSpeed();
        assertEquals(expectedTopSpeed, actualTopSpeed);
    }
}
