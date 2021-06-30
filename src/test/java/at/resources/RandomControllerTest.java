package at.resources;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RandomControllerTest {

    @Test
    public void Test_getMessage_ReturnCheck(){
        RandomController numberCheck = new RandomController();

        int checking = numberCheck.getRandomNumber();

        Assertions.assertNotEquals(true, checking >= 1000);
    }

    @Test
    public void Test_randomNumber_ReturnCheck(){
        RandomController numberCheck = new RandomController();

        int checking = numberCheck.randomNumber();

        Assertions.assertEquals(true, checking<= 1000);
    }
}
