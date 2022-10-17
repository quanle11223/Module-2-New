package Bai9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class nextDayTest {

    @Test
   void nextDay1(){
        int days = 1;
        int months = 1;
        int years = 2018;
        String expected = "2/1/2018";
        nextDay nextDay = new nextDay();
        String result = nextDay.nextDay1(days,months,years);
        assertEquals(expected, result);
    }

}