package com.company;

public class Circle extends Shape {

    private double radius;
    private Point circleCenter;
    private Point dotOnCircle;

    public Circle(Point circleCenter, Point dotOnCircle) {
        this.circleCenter = circleCenter;
        this.dotOnCircle = dotOnCircle;
        setRadius(dotOnCircle,circleCenter);
    }

    public Circle() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(Point dotOnCircle,Point circleCenter) {
        this.radius = Math.sqrt((Math.pow(dotOnCircle.getX()-circleCenter.getX(),2))
                +(Math.pow(dotOnCircle.getY()-circleCenter.getY(),2)));
    }

    public Point getCircleCenter() {
        return circleCenter;
    }

    public void setCircleCenter(Point circleCenter) {
        this.circleCenter = circleCenter;
    }

    public Point getDotOnCircle() {
        return dotOnCircle;
    }

    public void setDotOnCircle(Point dotOnCircle) {
        this.dotOnCircle = dotOnCircle;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", circleCenter="
                + circleCenter + ", dotOnCircle=" + dotOnCircle + '}';
    }
}
