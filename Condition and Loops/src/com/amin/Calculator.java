package com.amin;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);


        while (true)
        {
            System.out.println("Enter two num");
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println("Enter operation");
            char c=in.next().trim().charAt(0);
            if (c=='+' || c=='-' || c=='*' || c=='/' || c=='%')
            {
                if (c=='+')
                {
                    System.out.println(a+b);
                }
                if (c=='-')
                {
                    System.out.println(a-b);
                }
                if (c=='/')
                {
                    if (b!=0){
                        System.out.println(a/b);
                    }
                    else {
                        System.out.println("invalid");
                    }
                }
                if (c=='%')
                {
                    System.out.println(a%b);
                }
                if (c=='*')
                {
                    System.out.println(a*b);
                }
            }
            if (c=='e')
            {
                break;
            }
        }


    }
}
