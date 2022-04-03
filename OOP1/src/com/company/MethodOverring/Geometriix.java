package com.company.MethodOverring;
import java.util.Date;
public class Geometriix {

    private  String colour="white";
    private  boolean filled;
    private Date date;

    public Geometriix()
    {
        date = new Date();
    }
    public Geometriix(String c,boolean f)
    {
        date = new Date();
        this.colour=c;
        this.filled=f;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String c)
    {
        this.colour=c;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean f)
    {
        this.filled=f;
    }
    public Date getDate()
    {
        return date;
    }

    public String toString() {
        return "Geometriix{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                ", date=" + date +
                '}';
    }
}



