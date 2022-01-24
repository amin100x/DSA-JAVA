import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr={1,4,3,5,7,6,8};

        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void  selection(int arr[] , int r, int c, int maxx)
    {
        if (r==0)
        {
            return;
        }
        if (r>c)
        {
            if (arr[c]>arr[maxx])
            {
                selection(arr,r,c+1,c);
            }
            else
            {
                selection(arr,r,c+1,maxx);
            }
        }
        else
        {
            int temp=arr[maxx];
            arr[maxx] =arr[r-1];
            arr[r-1]=temp;

            selection(arr,r-1,0,0);
        }
    }
}
