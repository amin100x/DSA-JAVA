package com.amin;
//We dont koow the size of array
public class InfiniteArray {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,26,32,35,36,37,38,39};
       int target= 16;
       // First find the range . start with a box size 2

       System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target)
    {
        int s=0;
        int e=1;
        while (target>arr[e])
        {
            int temp=e+1;
            e=e+(e-s+1)*2 ;
            s=temp;
        }
        return binarysearch(arr,target,s,e);
    }
    static int binarysearch(int[] arr, int target, int s, int e)
    {

        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if (target<arr[mid])
            {
                e=mid-1;
            }
            else if(target>arr[mid])
            {
                s=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

}
