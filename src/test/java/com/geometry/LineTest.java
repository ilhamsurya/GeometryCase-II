package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    public void shouldCalculateLength() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        Line line = new Line(x1, y1, x2, y2);
        assertEquals(Math.sqrt(8), line.length(), 0.00001);
    }
}
