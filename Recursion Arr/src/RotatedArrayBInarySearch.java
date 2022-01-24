public class RotatedArrayBInarySearch {

    // Binary search in Rotated Array Using Recurtion

    public static void main(String[] args) {

        int[] arr={5,6,7,1,2,3,4};
        System.out.println(RBS(arr,4,0,arr.length-1));
    }

    static int RBS(int [] arr, int key, int s, int e)
    {
        int mid= s+(e-s)/2;
        if (s>e)
        {
            return -1;
        }
        if (arr[mid]==key)
        {
            return mid;
        }

        if (arr[s]<=arr[mid])
        {
            if (arr[s]>= key && arr[mid]<=key)
            {
                return RBS(arr,key,s,mid-1);
            }
            else
            {
                return RBS(arr,key,mid+1,e);
            }
        }
        if (key>=arr[mid] && key<=arr[e])
        {
            s=mid+1;
        }
        return RBS(arr,key,mid+1,e);


    }
}
