package com.amin;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,89,8,6,4,3,2};
        System.out.println(peak(arr));
    }
    static int peak(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        while (s<e)
        {
            int mid=s+(e-s)/2;
            if (arr[mid]>arr[mid+1])
            {
                e=mid;
            }
            else
            {
                s=mid+1;
            }
        }
        return s;
    }
}
