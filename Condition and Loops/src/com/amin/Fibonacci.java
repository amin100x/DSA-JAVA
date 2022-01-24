package com.amin;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n:- ");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int ans=0;
        int count=2;
        while (count<n)
        {
            ans=a+b;
            a=b;
            b=ans;
            count++;
        }
        System.out.println(ans);
    }
}
