package com.amin;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Enter Number:- ");
    int n=input.nextInt();
        int c=2;
    if (n<1)
    {
        System.out.println("invalid");
        return;
    }
    else
        {
            while (c*c<=n)
            {
                if (n%c==0)
                {
                    System.out.println("Not prime");
                    return;
                }
                c++;
            }
            if (c*c>n)
            {
                System.out.println("prime");
            }
        }
    }
}
