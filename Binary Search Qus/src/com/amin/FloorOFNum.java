package com.amin;
// Floor:- Greatest number in smaller or = target
public class FloorOFNum {
    public static void main(String[] args) {
        int[] arr={2,3,4,8,9,89};
        int target=5;
        int ans=floor(arr,target);
        System.out.println(ans);
    }

    static int floor(int[] arr,int target)
    {
        if (target>arr[arr.length-1])
        {
            return -1;
        }
        int s=0;
        int e=arr.length-1;
        while (s<=e)
        {
            int mid=s+(e-s)/2;

            if (target>arr[mid])
            {
                s=mid+1;
            }
            else if (target<arr[mid])
            {
                e=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return e;
    }
}
