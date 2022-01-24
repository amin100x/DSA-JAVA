public class LinearSearch
{
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        System.out.println(LenearS(arr,5,0));
        System.out.println(FindIndex(arr,5,0));

    }

    static boolean LenearS(int arr[], int target, int index)
    {
        if (index==arr.length)
        {
            return false;
        }
        return (target==arr[index]) || LenearS(arr,target,index+1);
    }

    static int FindIndex(int arr[], int targer, int index)
    {
        if (index==arr.length)
        {
            return -1;
        }
        if (arr[index]==targer)
        {
            return index;
        }

        return FindIndex(arr,targer,index+1);
    }
}
