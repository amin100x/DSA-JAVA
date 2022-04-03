package com.company.a;

public class BoxWedth extends Box{

    double weight;
    public BoxWedth()
    {
        this.weight=-1;
    }

    public BoxWedth(double l, double w, double h, double weight)
    {
        super(l,w,h);
        this.weight=weight;

    }
}
