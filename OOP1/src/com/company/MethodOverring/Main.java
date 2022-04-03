package com.company.MethodOverring;

public class Main {
    public static void main(String [] args)
    {
        Circle c = new Circle(12);
        System.out.println(c.getDate());
        c.setColour("RED");
        System.out.println( c.getColour());
        System.out.println(c.toString());
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
    }
}
