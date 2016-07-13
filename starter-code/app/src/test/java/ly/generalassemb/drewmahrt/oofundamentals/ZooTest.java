package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidstone on 7/13/16.
 */
public class ZooTest {

    @Test
    public void testIfZooRemovesAnimalCorrectly() throws Exception {

        Zoo newZoo = Zoo.getInstance();
        ArrayList<Animal> zooSize = newZoo.getAnimals();
        newZoo.addAnimal(new Lion(true));
        newZoo.getAnimals().remove(0);
        int expectedNewZoo = 0;
        int actualNewZoo = zooSize.size();
        assertEquals(expectedNewZoo, actualNewZoo);}

    @Test
    public void testIfZooAddsAnimalsCorrectly() throws Exception {


        Zoo newZoo = Zoo.getInstance();
        int expectedNewZoo = 1;
        ArrayList<Animal> zooSize = newZoo.getAnimals();
        newZoo.addAnimal(new Lion(true));
        int actualNewZoo = zooSize.size();
        assertEquals(expectedNewZoo, actualNewZoo);
    }


    }
