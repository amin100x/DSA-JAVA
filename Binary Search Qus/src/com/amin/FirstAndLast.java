package com.amin;

public class FirstAndLast {
    public static void main(String[] args) {
       int[] ans={-1,-1} ;
       int[] arr={1,2,3,7,7,7,8,9,10};
       int target= 7;
       ans[0]=search(arr , target, true);
       if (ans[0]!=-1)
       {
           ans[1]=search(arr,target,false);
       }
       for (int i=0; i<ans.length; i++)
           System.out.print(ans[i] + " ");
    }
    static int search(int[] arr, int target, boolean Firstindex)
    {
        int ans=-1;
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
                ans=mid;
                if (Firstindex)
                {
                    e=mid-1;
                }
                else
                {
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}
