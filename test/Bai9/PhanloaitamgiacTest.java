package Bai9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhanloaitamgiacTest {

    @Test
    void checkTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "Tam giác thường";
        Phanloaitamgiac phanloaitamgiac = new Phanloaitamgiac();
        String result = phanloaitamgiac.checkTriangle(a,b,c);
        assertEquals(expected, result);
    }
}