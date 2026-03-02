package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CseControllerTest {

    @Test
    public void testAddCSE() {
        CseController controller = new CseController();
        String result = controller.addCSE(10, 20);
        String expected = "THE VALUE IS 30 AND MY ROLL NUMBER IS 23MH1A05I1";
        assertEquals(expected, result);
    }
}