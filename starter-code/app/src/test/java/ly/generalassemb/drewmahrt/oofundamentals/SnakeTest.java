package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidstone on 7/13/16.
 */
public class SnakeTest {

    @Test
    public void testIfSnakeNoiseIsCorrect() throws Exception {

        Snake snake = new Snake(true);
        String expectedNoise = "Hiss!!!";
        String actualNoise = snake.makeNoise();
        assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void testIfSnakeTopSpeedIsCorrect() throws Exception {

        Snake snake = new Snake(true);
        int expectedTopSpeed = 5;
        int actualTopSpeed = snake.getTopSpeed();
        assertEquals(expectedTopSpeed, actualTopSpeed);
    }
}
