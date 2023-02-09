import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal loewe;

    @BeforeEach
    void setUp() {
        loewe = new Animal("loewe", "fitim", 1, "Roar");

    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("fitim", loewe.getName());
        Assertions.assertEquals(1, loewe.getAge());

        Animal mausi = new Animal("maus", "mausi", -1, "piep");
        Assertions.assertEquals(0, mausi.getAge());
        Assertions.assertEquals("maus", mausi.getSpecies());
        Assertions.assertEquals("piep", mausi.getAnimalLoud());
    }

    @Test
    void getAnimalLoud() {
        Assertions.assertEquals("Roar", loewe.getAnimalLoud());
    }

    @Test
    @DisplayName("Das ist der Test für den Namen und das Alter")
    void getNameAndAge() {
        String expected = "Name: fitim Alter: 1";
        String actual = loewe.getNameAndAge();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void ageCategory(){
        Assertions.assertEquals("baby animal", loewe.ageCategory());

    }
}