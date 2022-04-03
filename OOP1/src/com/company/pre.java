package com.company;

public class pre {

    public static void main(String args[])
    {
            student a= new student();
            student b= new student();

            System.out.println(a.rollNo);
            System.out.println(b.rollNo);
        System.out.println(a.marks);

    }
}
class student
{
    int rollNo=10;
    String name="Amin";
    float marks= 67;
}