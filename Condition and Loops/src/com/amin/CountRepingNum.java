package com.amin;
import java.util.Scanner;
public class CountRepingNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n:- ");
        int n=in.nextInt();
        System.out.println("Enter digit ");
        int d=in.nextInt();
        int c=0;
        while (n>0)
        {
            int rem=n%10;
            if (rem==d)
            {
                c++;
            }
            n=n/10;
        }
        System.out.println(c);
    }
}
