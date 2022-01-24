package com.amin;

public class Reverce {
    public static void main(String[] args) {
        System.out.print(rev2(23245));
    }
//    static void rev(int n)
//    {
//        if (n==0)
//            return;
////        System.out.print(n%10);
////        rev(n/10);
//        System.out.print(rev2(23245));
//    }

    static  int rev2(int n)
    {

        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits)
    {
        if (n%10==n)
        {
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }
}
