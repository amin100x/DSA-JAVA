package com.array;

public class IsArraySorted
{

    public static void main(String[] args) {

        int new arr[5]={2,4,5,6,7};


    }
    static boolean IAS(arr[], int index)
    {
        if ( index==arr.length())
        {
            return true;
        }
        return (arr[index]<arr[index+1]) && IAS(arr,index+1);
    }
}