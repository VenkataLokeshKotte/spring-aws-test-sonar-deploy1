package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CseControllerTest {

    @Test
    public void testAddCSE() {
        CseController controller = new CseController();
        String result = controller.addCSE(10, 20);
        String expected = "The value is 30 and my roll number is 23mh1a05c0";
        assertEquals(expected, result);
    }
}