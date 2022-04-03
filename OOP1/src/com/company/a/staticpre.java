package com.company.a;

public class staticpre {

    public static void main(String args[])
    {

        Student a= new Student(22, "urvi");
        Student s= new Student(11, "Amin");
        s.display();
        a.display();
    }

}

class Student
{
    int rollN;
    String name;
    static String clg="GEC";

    Student(int r, String n)
    {
        rollN=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollN +" " + name + " " + clg);
    }
}