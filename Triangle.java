package com.company;

public class Triangle extends Shape {

    private double sideAB;
    private double sideBC;
    private double sideCA;
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        setSideAB(a,b);
        setSideBC(b,c);
        setSideCA(c,a);
    }

    public Triangle() {
        super();
    }

    public double getSideAB() {
        return sideAB;
    }

    private void setSideAB(Point a,Point b) {
        this.sideAB =  Math.sqrt((Math.pow(b.getX()-a.getX(),2))
                +(Math.pow(b.getY()-a.getY(),2)));
    }

    public double getSideBC() {
        return sideBC;
    }

    private void setSideBC(Point b,Point c){
        this.sideBC =  Math.sqrt((Math.pow(c.getX()-b.getX(),2))
                +(Math.pow(c.getY()-b.getY(),2)));
    }

    public double getSideCA() {
        return sideCA;
    }

    private void setSideCA(Point c,Point a) {
        this.sideCA =  Math.sqrt((Math.pow(a.getX()-c.getX(),2))
                +(Math.pow(a.getY()-c.getY(),2)));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return this.sideAB+this.sideBC+this.sideCA;
    }

    private double getHalfPerimeter(){
        return (getPerimetr())/2;
    }

    @Override
    public double getArea() {
        double halfPerim=getHalfPerimeter();
        return Math.sqrt(halfPerim*(halfPerim-sideAB)*(halfPerim-sideBC)*(halfPerim-sideCA));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideAB=" + sideAB +
                ", sideBC=" + sideBC +
                ", sideCA=" + sideCA +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
