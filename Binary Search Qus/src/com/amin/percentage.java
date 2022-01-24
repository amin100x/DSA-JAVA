package com.amin;

import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float[] marks=new float[5];
        for(int i=0 ;i<5; i++)
        {
            marks[i]=input.nextFloat();
        }
        float sum=0;
        for(int i=0 ;i<5; i++)
        {
            sum+=marks[i];
        }
        float percentage= sum*100/500;
        System.out.println(percentage);
    }
}
