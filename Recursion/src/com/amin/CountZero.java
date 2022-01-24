package com.amin;

public class CountZero {
    public static void main(String[] args) {

        System.out.print(countZ(10080,0));
    }

    static int countZ(int n, int c)
    {
        if (n==0)
        {
            return c;
        }
        int rem = n%10;
        if (rem==0)
        {
            return countZ(n/10,c+1);
        }
return countZ(n/10,c);
    }
}
