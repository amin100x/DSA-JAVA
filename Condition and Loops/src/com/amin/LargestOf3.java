package com.amin;
import java.util.Scanner;
public class LargestOf3
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a= input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();


      /* Type 1

       int max=a;
       if (b>max)
        {
            max=b;
        }
        if (c>max)
        {
            max=c;
        }
        System.out.println(max);
        */

        /*  Type 2
        int max=0;
        System.out.println(Math.max(a,Math.max(b,c)));
         */


    }
}
