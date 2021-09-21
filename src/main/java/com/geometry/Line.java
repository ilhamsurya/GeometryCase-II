package com.geometry;

public class Line {
    private int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        int xDistance = this.x1 - this.x2;
        int yDistance = this.y1 - this.y2;

        double result = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        return result;
    }
}
