package com.amin;

import java.util.Arrays;

public class SortedArrayIN2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=7;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static  int[] binarysearch(int[][] arr, int row, int Cstart, int Cend, int target)
    {
        while (Cstart<=Cend)
        {
            int mid=Cstart+(Cend-Cstart)/2 ;
            if (arr[row][mid]==target)
            {
                return new int[] {row, mid};
            }
            if (arr[row][mid]<target)
            {
                Cstart=mid+1;
            }
            else
            {
                Cend=mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    static  int[] search(int[][] arr, int target)
    {
        int rows=arr.length;
        int cols= arr[0].length;
        if (cols==0)
        {
            return new int[]{-1,-1};
        }
        if (rows==1)
        {
            return binarysearch(arr, 0,0,cols-1, target);
        }
        int Rstart=0;
        int Rend=rows-1;
        int Cmid=cols/2;

        // Run the loop till 2 rows are remaining
        while (Rstart <(Rend-1))
        {
            int mid=Rstart+(Rend-Rstart)/2;
            if (arr[mid][Cmid]==target)
            {
                return new int[] {mid, Cmid};
            }
            if (arr[mid][Cmid] < target)
            {
                Rstart=mid;
            }
            else
            {
                Rend=mid;
            }
        }

        // Now we have 2 rows

        if (arr[Rstart][Cmid]==target)
        {
            return new int[] {Rstart, Cmid};
        }
        if (arr[Rstart+1][Cmid]==target)
        {
            return new int[] {Rstart+1, Cmid};
        }

        // Search in 1st half
        if (target<=arr[Rstart][Cmid-1])
        {
            return  binarysearch(arr, Rstart, 0, Cmid-1, target);
        }
        // Search in 2nd half
        if (target >=arr[Rstart][Cmid+1] && target<=arr[Rstart][cols-1])
        {
            return  binarysearch(arr, Rstart, Cmid+1 , cols-1, target);
        }
        // Search in 3rd half
        if (target <=arr[Rstart+1][Cmid-1])
        {
            return  binarysearch(arr, Rstart+1, 0 , Cmid-1, target);
        }
        else
        {
            return  binarysearch(arr, Rstart+1, Cmid+1 , cols-1, target);
        }
    }
}
