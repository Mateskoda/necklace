package com.progmatic.drawshapes;


public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public Circle[] getNecklace(double necklaceRadius, int pearlDiameter){
        double circumference = 2* necklaceRadius*Math.PI;
        int nrOfPearls = (int)circumference/pearlDiameter;
        double angleTogrow = 360d/nrOfPearls;
        Circle[] ret = new Circle[nrOfPearls];
        for (int i = 0; i < nrOfPearls; i++) {
            Point p = center.getPointAt(i*angleTogrow, necklaceRadius);
            Circle c = new Circle(p, pearlDiameter/2);
            ret[i]=c;
        }
        return ret;
    }
}
