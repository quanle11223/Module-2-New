package Bai9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        int number = 15;
        String expection = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = (String) fizzBuzz.checkFizzBuzz(number);
        assertEquals(expection,result);


    }
}