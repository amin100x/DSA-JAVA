package com.company.MethodOverring;

public class Circle extends Geometriix{

    private double radius;
    public Circle(double r)
    {
        this.radius=r;
    }
    public Circle(double r, String c, boolean f)
    {
        this.radius=r;
        this.setColour(c);
        this.setFilled(f);
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getParimeter()
    {
        return 2*Math.PI*radius;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public void PrintCircle()
    {
        System.out.println("The Circle is created on "+ getDate() + "And the Radius is " + getRadius() + "ares" + getArea());
    }
}
