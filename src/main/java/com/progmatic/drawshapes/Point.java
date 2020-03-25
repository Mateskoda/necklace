package com.progmatic.drawshapes;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point getPointAt(double angle, double distance){
        double x2 = x + Math.sin(Math.toRadians(angle))*distance;
        double y2 = y - Math.cos(Math.toRadians(angle))*distance;
        return new Point(x2, y2);
    }
}
