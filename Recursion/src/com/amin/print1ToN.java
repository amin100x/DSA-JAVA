package com.amin;

public class print1ToN {
    public static void main(String[] args) {
print1ton(5);
    }
   static void print1ton(int n)
   {
       if (n==0)
       {
           return;
       }
       print1ton(n-1);
       System.out.println(n);
   }
}
