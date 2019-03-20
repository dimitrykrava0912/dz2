package com.company;

import java.util.Arrays;

public class Blackboard {
    private double sumPerim;
    private double sumArea;

    private Shape []shapes =new Shape[4];
    
    public Blackboard(){
        super();
    }

    public double getSumPerim() {
        return sumPerim;
    }

    public double getSumArea() {
        return sumArea;
    }

    public void addShape(Shape shape, int position){
        if(shapes[position-1]==null){
            shapes[position-1]=shape;
        }
        else {
            System.out.println("this position isn't available");
        }
        setSumArea();
        setSumPerim();
    }
    
    public void delShape(int position){
        shapes[position-1]=null;
        setSumArea();
        setSumPerim();
    }
    
    private void setSumArea(){
        sumArea=0;
        for (Shape tmp:shapes) {
            if (tmp == null) {
                continue;
            } else {
                sumArea += tmp.getArea();
            }
        }
    }

    private void setSumPerim(){
        sumPerim=0;
        for (Shape tmp:shapes) {
            if(tmp==null) {
                continue;
            }
            else {
                sumPerim+=tmp.getPerimetr();
            }
        }
    }

    @Override
    public String toString() {
        return "Blackboard{" +
                "shapes=" + Arrays.toString(shapes) + " sumPerimetr="+getSumPerim()
        +" sumArea="+getSumArea()+'}';
    }
}
