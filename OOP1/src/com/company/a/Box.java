package com.company.a;

public class Box {

    double h;
    double w;
    double l;

    Box()
    {
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }

    Box(double s)
    {
        this.l=s;
        this.w=s;
        this.h=s;
    }
    Box(double l, double w, double h)
    {
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box( Box old)
    {
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }

    void display()
    {
        System.out.println("Running the box");
    }
}
